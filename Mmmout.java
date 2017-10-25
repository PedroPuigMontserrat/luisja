/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Mmmout.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 06/09/2017 16:30:46           */
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
public class Mmmout {
     private Integer id;
     private String mmmcmdref;
     private String mmmges;
     private String mmmdisref;
     private String mmmrecmaqref;
     private Integer mmmacccod;
     private String mmmartref;
     private Integer mmmcanuni;
     private String mmmcrirot;
     private String mmmlot;
     private String mmmcntoriref;
     private String mmmcntdesref;
     private String mmmubirefori;
     private String mmmubidesref;
     private Date momcre;
     private Date momlec;

//------------CONSTRUCTOR Sin Parametros------------
    public Mmmout() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Mmmout(
                       Integer id,
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
                       String mmmubirefori,
                       String mmmubidesref,
                       Date momcre,
                       Date momlec){
        super();
         this.id = id;
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
         this.mmmubirefori = mmmubirefori;
         this.mmmubidesref = mmmubidesref;
         this.momcre = momcre;
         this.momlec = momlec;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Mmmout(
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
                          String mmmubirefori,
                          String mmmubidesref,
                          Date momcre,
                          Date momlec){

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
        this.mmmubirefori = mmmubirefori;
        this.mmmubidesref = mmmubidesref;
        this.momcre = momcre;
        this.momlec = momlec;
    }

//------------Getters y Setters----------
     public Integer getId() {
        return id;
    }

   public void setId(Integer id) {
      this.id = id;
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
      this.mmmdisref = mmmdisref;
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

     public String getMmmubirefori() {
        return mmmubirefori;
    }

   public void setMmmubirefori(String mmmubirefori) {
      this.mmmubirefori = mmmubirefori;
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

//------------Objeto Inicial----------
   public Mmmout getObjIni(){
      Mmmout objIni=new Mmmout();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setMmmcmdref("");
            objIni.setMmmges("");
            objIni.setMmmdisref("");
            objIni.setMmmrecmaqref("");
            objIni.setMmmacccod( 0);
            objIni.setMmmartref("");
            objIni.setMmmcanuni( 0);
            objIni.setMmmcrirot("");
            objIni.setMmmlot("");
            objIni.setMmmcntoriref("");
            objIni.setMmmcntdesref("");
            objIni.setMmmubirefori("");
            objIni.setMmmubidesref("");
            objIni.setMomcre(now);
            objIni.setMomlec(now);
         return objIni;
     }

//------------HELPS----------
     public String helpId(){
        String ayuda="Identificador único interno";
        return ayuda;
     }

     public String helpMmmcmdref(){
        String ayuda="Orden que se transmite (RESET, ENTNDO, SALNDO)";
        return ayuda;
     }

     public String helpMmmges(){
        String ayuda="Nombre del manipulador mecánico";
        return ayuda;
     }

     public String helpMmmdisref(){
        String ayuda="Nombre de la máquina para el manipulador";
        return ayuda;
     }

     public String helpMmmrecmaqref(){
        String ayuda="Nombre de la máquina para adaia";
        return ayuda;
     }

     public String helpMmmacccod(){
        String ayuda="Código intermno de la acción que se pretende que ejecute la máquina";
        return ayuda;
     }

     public String helpMmmartref(){
        String ayuda="Artículo de la acción (Si es una acción PISU)";
        return ayuda;
     }

     public String helpMmmcanuni(){
        String ayuda="Cantidad en unidades (Si es una acción PISU)";
        return ayuda;
     }

     public String helpMmmcrirot(){
        String ayuda="Rotación de la mercancía nque se mueve(Si es de contenido)";
        return ayuda;
     }

     public String helpMmmlot(){
        String ayuda="Lote de la mercancía nque se mueve(Si es de contenido)";
        return ayuda;
     }

     public String helpMmmcntoriref(){
        String ayuda="Contenedor origen (Si es un movimiento de contenido)";
        return ayuda;
     }

     public String helpMmmcntdesref(){
        String ayuda="Contenedor destino (Si es un movimiento de contenido)";
        return ayuda;
     }

     public String helpMmmubirefori(){
        String ayuda="Ubicación origen (Si es un movimiento de contenedor)";
        return ayuda;
     }

     public String helpMmmubidesref(){
        String ayuda="Ubicación origen (Si es un movimiento de contenedor)";
        return ayuda;
     }

     public String helpMomcre(){
        String ayuda="Momento en el que se crea el registro";
        return ayuda;
     }

     public String helpMomlec(){
        String ayuda="Momento en el que se lee eñl registro";
        return ayuda;
     }

}
