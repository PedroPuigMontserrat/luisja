

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("InitializerMayBeStatic")
public class abrirConexion  {    
    
    public abrirConexion() {
        super();
    }
    /**
     * Rutina que devuelve una acceso a la BBDD
     * @return (Connection)
     */
    public static Connection AbrirConexion () {
        Connection cnn=null;
        
        String urlDriver="oracle.jdbc.OracleDriver";
        String urlBBDD="jdbc:oracle:thin:@172.20.10.65:1521:adaiasrv";
        String user="CAP";
        String clave="cap";
        
        try{
            Class.forName(urlDriver);
        }
        catch (ClassNotFoundException e){
            javax.swing.JOptionPane.showMessageDialog(null,"Driver no cargado","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        try { 
            DriverManager.setLoginTimeout(5);
            cnn=DriverManager.getConnection(urlBBDD,user,clave);
        }
        
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,
                    "No hay conexion con la base de datos. "
                  + "Recuerde que debe estar conectado a la VPN de Grupo Leuter. "
                  + "Base de datos en 172.20.10.65","Error"
                  , javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return cnn;
    }
}
