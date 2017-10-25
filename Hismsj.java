
/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Hismsj.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 08/09/2017 11:46:11           */
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
public class Hismsj {
     private Integer msjcod;
     private Integer mmmcod;
     private Date mmmcre;
     private Integer msjcodagr;
     private Integer msjniv;
     private String msjori;
     private String msjref;
     private String msjtip;
     private String msjtxt;
     private Date msjvismom;
     private String msjvispor;

//------------CONSTRUCTOR Sin Parametros------------
    public Hismsj() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Hismsj(
                       Integer msjcod,
                       Integer mmmcod,
                       Date mmmcre,
                       Integer msjcodagr,
                       Integer msjniv,
                       String msjori,
                       String msjref,
                       String msjtip,
                       String msjtxt,
                       Date msjvismom,
                       String msjvispor){
        super();
         this.mmmcod = mmmcod;
         this.mmmcre = mmmcre;
         this.msjcodagr = msjcodagr;
         this.msjniv = msjniv;
         this.msjori = msjori;
         this.msjref = msjref;
         this.msjtip = msjtip;
         this.msjtxt = msjtxt;
         this.msjvismom = msjvismom;
         this.msjvispor = msjvispor;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Hismsj(
                           
                           Integer mmmcod,
                          Date mmmcre,
                          Integer msjcodagr,
                          Integer msjniv,
                          String msjori,
                          String msjref,
                          String msjtip,
                          String msjtxt,
                          Date msjvismom,
                          String msjvispor){

        this.mmmcod = mmmcod;
        this.mmmcre = mmmcre;
        this.msjcodagr = msjcodagr;
        this.msjniv = msjniv;
        this.msjori = msjori;
        this.msjref = msjref;
        this.msjtip = msjtip;
        this.msjtxt = msjtxt;
        this.msjvismom = msjvismom;
        this.msjvispor = msjvispor;
    }

//------------Getters y Setters----------
     public Integer getMsjcod() {
        return msjcod;
    }

   public void setMsjcod(Integer msjcod) {
      this.msjcod = msjcod;
 }

     public Integer getMmmcod() {
        return mmmcod;
    }

   public void setMmmcod(Integer mmmcod) {
      this.mmmcod = mmmcod;
 }

     public Date getMmmcre() {
        return mmmcre;
    }

   public void setMmmcre(Date mmmcre) {
      this.mmmcre = mmmcre;
 }

     public Integer getMsjcodagr() {
        return msjcodagr;
    }

   public void setMsjcodagr(Integer msjcodagr) {
      this.msjcodagr = msjcodagr;
 }

     public Integer getMsjniv() {
        return msjniv;
    }

   public void setMsjniv(Integer msjniv) {
      this.msjniv = msjniv;
 }

     public String getMsjori() {
        return msjori;
    }

   public void setMsjori(String msjori) {
      this.msjori = msjori;
 }

     public String getMsjref() {
        return msjref;
    }

   public void setMsjref(String msjref) {
      this.msjref = msjref;
 }

     public String getMsjtip() {
        return msjtip;
    }

   public void setMsjtip(String msjtip) {
      this.msjtip = msjtip;
 }

     public String getMsjtxt() {
        return msjtxt;
    }

   public void setMsjtxt(String msjtxt) {
      this.msjtxt = msjtxt;
 }

     public Date getMsjvismom() {
        return msjvismom;
    }

   public void setMsjvismom(Date msjvismom) {
      this.msjvismom = msjvismom;
 }

     public String getMsjvispor() {
        return msjvispor;
    }

   public void setMsjvispor(String msjvispor) {
      this.msjvispor = msjvispor;
 }

//------------Objeto Inicial----------
   public Hismsj getObjIni(){
      Hismsj objIni=new Hismsj();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setMmmcod( 0);
            objIni.setMmmcre(now);
            objIni.setMsjcodagr( 0);
            objIni.setMsjniv( 0);
            objIni.setMsjori("");
            objIni.setMsjref("");
            objIni.setMsjtip("");
            objIni.setMsjtxt("");
            objIni.setMsjvismom(now);
            objIni.setMsjvispor("");
         return objIni;
     }

//------------HELPS----------
     public String helpMmmcod(){
        String ayuda="Codigo de mensaje";
        return ayuda;
     }

     public String helpMmmcre(){
        String ayuda="Momento d creación de la accion";
        return ayuda;
     }

     public String helpMsjcodagr(){
        String ayuda = "Este código agrupa todos los mensajes generados por un mismo proceso, cuando tiene "
                    + "\nsentido conocerlos en su conjunto, como por ejemplo, un traspaso";
        return ayuda;
     }

     public String helpMsjniv(){
        String ayuda="Nivel del mensaje 1= grave; 2=aviso;3=informativo";
        return ayuda;
     }

     public String helpMsjori(){
        String ayuda="Origen del mensaje";
        return ayuda;
     }

     public String helpMsjref(){
        String ayuda="Referencia del mensaje que ha de estra codificado en una tabla general";
        return ayuda;
     }

     public String helpMsjtip(){
        String ayuda="Tipo de men saje";
        return ayuda;
     }

     public String helpMsjtxt(){
        String ayuda="Mensaje";
        return ayuda;
     }

     public String helpMsjvismom(){
        String ayuda="Momnento en el que se ve el mensaje";
        return ayuda;
     }

     public String helpMsjvispor(){
        String ayuda="Operario que ha visto el mensaje";
        return ayuda;
     }

}
