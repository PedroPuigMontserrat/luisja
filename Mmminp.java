/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Mmminp.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 06/09/2017 16:31:25           */
/* ====================================================================== */
/*
Este archivo constituye la definicion estandar de la clase 
para cada uno de los objetos de la base de datos.
Todos los modelos de los objetos que se guardan en la BBDD
figuran en el package Modelos.
*/

import java.sql.Date;
import java.text.SimpleDateFormat;

//------------CLASE------------------
public class Mmminp {
     private int mmmcod;
     private String mmmcmdref;
     private String mmmges;
     private String mmmdisref;
     private String mmmrecmaqref;

     private int mmmacccod;
     
     private String mmmartref;
     private int mmmcanuni;
     private String mmmcrirot;
     private String mmmlot;
     
     private String mmmcntoriref;
     private String mmmcntdesref;
     private String mmmubioriref;
     private String mmmubidesref;
     
     private Date momcre;
     private Date momlec;
     private int mmmsit;

//------------CONSTRUCTOR Sin Parametros------------
    public Mmminp() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Mmminp(
            Integer mmmcod,
            String mmmcmdref,
            String mmmges,
            String mmmdisref,
            String mmmrecmaqref,

            Integer mmmacccod,

            String mmmartref,
            Integer mmmcanuni,
            String mmmcrirot,
            String mmmlot,

            String mmmcntoriref,
            String mmmcntdesref,
            String mmmubioriref,
            String mmmubidesref,

            Date momcre,
            Date momlec,
            Integer mmmsit){

       super();
       
         this.mmmcod=mmmcod;
         this.mmmcmdref = mmmcmdref;
         this.mmmges = mmmges;
         this.mmmdisref = mmmdisref;
         this.mmmrecmaqref = mmmrecmaqref;
         
         this.mmmacccod = mmmacccod;
         
         this.mmmartref = mmmartref;
         this.mmmcanuni = mmmcanuni;
         this.mmmcrirot = mmmcrirot;
         this.mmmlot = mmmlot;

         this.mmmcntoriref = mmmcntoriref;
         this.mmmcntdesref = mmmcntdesref;
         this.mmmubioriref = mmmubioriref;
         this.mmmubidesref = mmmubidesref;

         this.momcre = momcre;
         this.momlec = momlec;
         this.mmmsit = mmmsit;
     }
//------------CONSTRUCTOR con Parametros------------
   public Mmminp(
            String mmmcmdref,
            String mmmges,
            String mmmdisref,
            String mmmrecmaqref,

            Integer mmmacccod,

            String mmmartref,
            Integer mmmcanuni,
            String mmmcrirot,
            String mmmlot,

            String mmmcntoriref,
            String mmmcntdesref,
            String mmmubioriref,
            String mmmubidesref,

            Date momcre,
            Date momlec,
            Integer mmmsit){

       super();
       
         this.mmmcmdref = mmmcmdref;
         this.mmmges = mmmges;
         this.mmmdisref = mmmdisref;
         this.mmmrecmaqref = mmmrecmaqref;
         
         this.mmmacccod = mmmacccod;
         
         this.mmmartref = mmmartref;
         this.mmmcanuni = mmmcanuni;
         this.mmmcrirot = mmmcrirot;
         this.mmmlot = mmmlot;

         this.mmmcntoriref = mmmcntoriref;
         this.mmmcntdesref = mmmcntdesref;
         this.mmmubioriref = mmmubioriref;
         this.mmmubidesref = mmmubidesref;

         this.momcre = momcre;
         this.momlec = momlec;
         this.mmmsit = mmmsit;
     }

//------------Getters y Setters----------
     public Integer getMmmcod() {
        return mmmcod;
    }

   public void setMmmcod(Integer mmmcod) {
      this.mmmcod=mmmcod;
 }

     public String getMmmcmdref() {
        return mmmcmdref;
    }

   public void setMmmcmdref(String mmmcmdref) {
      this.mmmcmdref = mmmcmdref;
 }

     public String getMmmges() {
        return mmmges;
    }

   public void setMmmges(String mmmges) {
      this.mmmges = mmmges;
 }

     public String getMmmdisref() {
        return mmmdisref;
    }

   public void setMmmdisref(String mmmdisref) {
      this.mmmdisref=mmmdisref;
 }

     public String getMmmrecmaqref() {
        return mmmrecmaqref;
    }

   public void setMmmrecmaqref(String mmmrecmaqref) {
      this.mmmrecmaqref = mmmrecmaqref;
 }

     public Integer getMmmacccod() {
        return mmmacccod;
    }

   public void setMmmacccod(Integer mmmacccod) {
      this.mmmacccod = mmmacccod;
 }

     public String getMmmartref() {
        return mmmartref;
    }

   public void setMmmartref(String mmmartref) {
      this.mmmartref = mmmartref;
 }

     public Integer getMmmcanuni() {
        return mmmcanuni;
    }

   public void setMmmcanuni(Integer mmmcanuni) {
      this.mmmcanuni = mmmcanuni;
 }

     public String getMmmcrirot() {
        return mmmcrirot;
    }

   public void setMmmcrirot(String mmmcrirot) {
      this.mmmcrirot = mmmcrirot;
 }

     public String getMmmlot() {
        return mmmlot;
    }

   public void setMmmlot(String mmmlot) {
      this.mmmlot = mmmlot;
 }

     public String getMmmcntoriref() {
        return mmmcntoriref;
    }

   public void setMmmcntoriref(String mmmcntoriref) {
      this.mmmcntoriref = mmmcntoriref;
 }

     public String getMmmcntdesref() {
        return mmmcntdesref;
    }

   public void setMmmcntdesref(String mmmcntdesref) {
      this.mmmcntdesref = mmmcntdesref;
 }

     public String getMmmubioriref() {
        return mmmubioriref;
    }

   public void setMmmubioriref(String mmmubioriref) {
      this.mmmubioriref = mmmubioriref;
 }

     public String getMmmubidesref() {
        return mmmubidesref;
    }

   public void setMmmubidesref(String mmmubidesref) {
      this.mmmubidesref = mmmubidesref;
 }

     public Date getMomcre() {
        return momcre;
    }

   public void setMomcre(Date momcre) {
      this.momcre = momcre;
 }

     public Date getMomlec() {
        return momlec;
    }

   public void setMomlec(Date momlec) {
      this.momlec = momlec;
 }

     public Integer getMmmsit() {
        return mmmsit;
    }

   public void setMmmsit(Integer mmmsit) {
      this.mmmsit=mmmsit;
 }
//------------Objeto Inicial----------
   public Mmminp getObjIni(){
      Mmminp objIni=new Mmminp();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setMmmcmdref("");
            objIni.setMmmges("");
            objIni.setMmmacccod( 0);
            objIni.setMmmartref("");
            objIni.setMmmcanuni( 0);
            objIni.setMmmcrirot("");
            objIni.setMmmlot("");
            objIni.setMmmcntoriref("");
            objIni.setMmmcntdesref("");
            objIni.setMmmubioriref("");
            objIni.setMmmubidesref("");
            objIni.setMomcre(now);
            objIni.setMomlec(now);
         return objIni;
     }
}
