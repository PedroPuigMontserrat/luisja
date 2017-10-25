
import Modelos.Mmminp;
import Modelos.Sesion;
import Rutinas.Varias;
import Servicios.MmminpService;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ppuig
 */
public class Init {
    static Sesion sesStatic = new Sesion();
    static Date now = new Date(System.currentTimeMillis());
    static Mmminp mmminp = new Mmminp();
    static MmminpService mmminpSer = new MmminpService();
    
    static Varias rut=new Varias();
    /**
     * Se conecta a la BBDD
     * Se qeda a la espera durante un segundo
     * Luego lee todos los registros que encuentre de la tabla MMMINP
     */
    public Init() {
        inicializarAplicacion();
        rut.msjADAIA(sesStatic,"Servicio de escucha KARDEX arrancado: " + now);
        rut.testTaraduceUbi();
        
        mmminp=null;
        while (true){
            mmminp=mmminpSer.getMmminp(sesStatic," WHERE MMMGES='KARDEX' "
                                               + "   AND MOMLEC=null "
                                               + "   AND (MOMSIT=100 OR "
                                               + "        MOMSIT=200 OR "
                                               + "        MOMSIT=300 OR "
                                               + "        MOMSIT=400) "
                                               + " ORDER BY MMMCOD");
            while (mmminp!=null){
               procesoMMMINP(mmminp);
               mmminp=mmminpSer.getMmminp(sesStatic," WHERE MMMGES='KARDEX'"
                                               + "      AND MOMLEC=null "
                                               + "      AND (MOMSIT=100 OR "
                                               + "           MOMSIT=200 OR "
                                               + "           MOMSIT=300 OR "
                                               + "           MOMSIT=400) "
                                               + " ORDER BY MMMCOD");
            }
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Intenta leer...");
            } catch (InterruptedException ex) {
                rut.msjADAIA(sesStatic,"Error alhacer TimeUnit: " + ex);
            }
        }
    }
    /**
     * En función del valor del comando llama a un procea u otro
     * @param mmminp 
     */
    public void procesoMMMINP(Mmminp mmminp){
        MmminpService mmmInpSer = new MmminpService();
        System.out.println("Bucle");
        
        switch (mmminp.){
        case "ENTNDO":
            //Confirmar el movimiento de entradas
            rut.procesaENT(sesStatic,mmminp);
            break;
        case "SALNDO":
            //Confirmar el movimiento de salida
            rut.procesaSAL(sesStatic,mmminp);
            break;
        case "RESET":
            //Confirmar los movimientos de entrada
            rut.procesaRST(sesStatic,mmminp);
            break;
        case "FIN":
            System.out.println("Detectado FIN");
            System.exit(0);
            break;
        default:
            //Escribir el error en MSJADAIA
            //1. Orden nbo reconocida
            break;
        }
        //Marcamos el registro con MOMLEC
        mmminp.setMmmlec(now);
        mmmInpSer.updateMmminp(sesStatic, mmminp);    
    }
        
    public void inicializarAplicacion(){
        sesStatic.setConection(abrirConexion.AbrirConexion());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("No se ha podido ejecutar");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                    new Init();
            }
        });
    }    

}
