/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Almprv.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 12/09/2017 13:49:56           */
/* ====================================================================== */
/*
Este archivo constituye la definicion estandar de la clase 
para cada uno de los objetos de la base de datos.
Todos los modelos de los objetos que se guardan en la BBDD
figuran en el package Modelos.
*/

package Modelos;

import java.sql.Date;
import java.text.SimpleDateFormat;

//------------CLASE------------------
public class Almprv {
     private String almref;
     private String almubiali;
     private Integer almubicod;
     private String almubiref;
     private String estdes;
     private String hueref;
     private String mmmalmubiref;
     private String nivref;

//------------CONSTRUCTOR Sin Parametros------------
    public Almprv() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Almprv(
                       String almref,
                       String almubiali,
                       Integer almubicod,
                       String almubiref,
                       String estdes,
                       String hueref,
                       String mmmalmubiref,
                       String nivref){
        super();
         this.almref = almref;
         this.almubiali = almubiali;
         this.almubicod = almubicod;
         this.almubiref = almubiref;
         this.estdes = estdes;
         this.hueref = hueref;
         this.mmmalmubiref = mmmalmubiref;
         this.nivref = nivref;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Almprv(
                               String almref,
                          String almubiali,
                          String almubiref,
                          String estdes,
                          String hueref,
                          String mmmalmubiref,
                          String nivref){

        this.almref = almref;
        this.almubiali = almubiali;
        this.almubicod = almubicod;
        this.almubiref = almubiref;
        this.estdes = estdes;
        this.hueref = hueref;
        this.mmmalmubiref = mmmalmubiref;
        this.nivref = nivref;
    }

//------------Getters y Setters----------
     public String getAlmref() {
        return almref;
    }

   public void setAlmref(String almref) {
      this.almref = almref;
 }

     public String getAlmubiali() {
        return almubiali;
    }

   public void setAlmubiali(String almubiali) {
      this.almubiali = almubiali;
 }

     public Integer getAlmubicod() {
        return almubicod;
    }

   public void setAlmubicod(Integer almubicod) {
      this.almubicod = almubicod;
 }

     public String getAlmubiref() {
        return almubiref;
    }

   public void setAlmubiref(String almubiref) {
      this.almubiref = almubiref;
 }

     public String getEstdes() {
        return estdes;
    }

   public void setEstdes(String estdes) {
      this.estdes = estdes;
 }

     public String getHueref() {
        return hueref;
    }

   public void setHueref(String hueref) {
      this.hueref = hueref;
 }

     public String getMmmalmubiref() {
        return mmmalmubiref;
    }

   public void setMmmalmubiref(String mmmalmubiref) {
      this.mmmalmubiref = mmmalmubiref;
 }

     public String getNivref() {
        return nivref;
    }

   public void setNivref(String nivref) {
      this.nivref = nivref;
 }

//------------Objeto Inicial----------
   public Almprv getObjIni(){
      Almprv objIni=new Almprv();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setAlmref("");
            objIni.setAlmubiali("");
            objIni.setAlmubicod( 0);
            objIni.setAlmubiref("");
            objIni.setEstdes("");
            objIni.setHueref("");
            objIni.setMmmalmubiref("");
            objIni.setNivref("");
         return objIni;
     }

//------------HELPS----------
     public String helpAlmref(){
        String ayuda="Referencia delalmacé n pafra el usuario de adaia";
        return ayuda;
     }

     public String helpAlmubiali(){
        String ayuda = "Alias para la ubicación más legible que se usa solamente para display en las pantallas "
                    + "\nde adio frecuencia y algunos informes";
        return ayuda;
     }

     public String helpAlmubicod(){
        String ayuda="Código interno de la ubicación";
        return ayuda;
     }

     public String helpAlmubiref(){
        String ayuda="Codigo de la ubicación para el usuario de adaia";
        return ayuda;
     }

     public String helpEstdes(){
        String ayuda="Descripción de la estantería para el usuariio de adaia";
        return ayuda;
     }

     public String helpHueref(){
        String ayuda="Referencia del hueco para el usuario de adaia";
        return ayuda;
     }

     public String helpMmmalmubiref(){
        String ayuda = "Si la ubicación pertenece a un automatismo, el código que la identifica para el \nmecanismo.";
        return ayuda;
     }

     public String helpNivref(){
        String ayuda="Referencia del nivel para el usuario de adaia";
        return ayuda;
     }

}
