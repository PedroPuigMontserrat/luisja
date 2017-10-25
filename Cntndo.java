/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Cntndo.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 12/09/2017 18:31:14           */
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
public class Cntndo {
     private Integer ndocod;
     private String ndosit;
     private Integer cntextcod;
     private Integer cntcod;
     private Integer artcod;
     private Integer canuni;
     private String unitip;
     private String crirot;
     private Date fecfab;
     private Date feccad;
     private String lote;
     private Float pes;
     private Float pesalb;
     private Float pesfin;
     private Float pesmed;
     private Float pesmod;
     private Float pespic;
     private Date momrec;
     private Integer altura;
     private Integer base;
     private String eancod;
     private String sinean;
     private String valest;
     private Integer asgres;
     private Integer reccod;
     private Integer expordcod;
     private Integer reclin;
     private Integer expordcodori;
     private Integer expordlin;
     private Integer expordlinori;

//------------CONSTRUCTOR Sin Parametros------------
    public Cntndo() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Cntndo(
                       Integer ndocod,
                       String ndosit,
                       Integer cntextcod,
                       Integer cntcod,
                       Integer artcod,
                       Integer canuni,
                       String unitip,
                       String crirot,
                       Date fecfab,
                       Date feccad,
                       String lote,
                       Float pes,
                       Float pesalb,
                       Float pesfin,
                       Float pesmed,
                       Float pesmod,
                       Float pespic,
                       Date momrec,
                       Integer altura,
                       Integer base,
                       String eancod,
                       String sinean,
                       String valest,
                       Integer asgres,
                       Integer reccod,
                       Integer expordcod,
                       Integer reclin,
                       Integer expordcodori,
                       Integer expordlin,
                       Integer expordlinori){
        super();
         this.ndocod = ndocod;
         this.ndosit = ndosit;
         this.cntextcod = cntextcod;
         this.cntcod = cntcod;
         this.artcod = artcod;
         this.canuni = canuni;
         this.unitip = unitip;
         this.crirot = crirot;
         this.fecfab = fecfab;
         this.feccad = feccad;
         this.lote = lote;
         this.pes = pes;
         this.pesalb = pesalb;
         this.pesfin = pesfin;
         this.pesmed = pesmed;
         this.pesmod = pesmod;
         this.pespic = pespic;
         this.momrec = momrec;
         this.altura = altura;
         this.base = base;
         this.eancod = eancod;
         this.sinean = sinean;
         this.valest = valest;
         this.asgres = asgres;
         this.reccod = reccod;
         this.expordcod = expordcod;
         this.reclin = reclin;
         this.expordcodori = expordcodori;
         this.expordlin = expordlin;
         this.expordlinori = expordlinori;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Cntndo(
                       String ndosit,
                       Integer cntextcod,
                       Integer cntcod,
                       Integer artcod,
                       Integer canuni,
                       String unitip,
                       String crirot,
                       Date fecfab,
                       Date feccad,
                       String lote,
                       Float pes,
                       Float pesalb,
                       Float pesfin,
                       Float pesmed,
                       Float pesmod,
                       Float pespic,
                       Date momrec,
                       Integer altura,
                       Integer base,
                       String eancod,
                       String sinean,
                       String valest,
                       Integer asgres,
                       Integer reccod,
                       Integer expordcod,
                       Integer reclin,
                       Integer expordcodori,
                       Integer expordlin,
                       Integer expordlinori){

        this.ndocod = ndocod;
        this.ndosit = ndosit;
        this.cntextcod = cntextcod;
        this.cntcod = cntcod;
        this.artcod = artcod;
        this.canuni = canuni;
        this.unitip = unitip;
        this.crirot = crirot;
        this.fecfab = fecfab;
        this.feccad = feccad;
        this.lote = lote;
        this.pes = pes;
        this.pesalb = pesalb;
        this.pesfin = pesfin;
        this.pesmed = pesmed;
        this.pesmod = pesmod;
        this.pespic = pespic;
        this.momrec = momrec;
        this.altura = altura;
        this.base = base;
        this.eancod = eancod;
        this.sinean = sinean;
        this.valest = valest;
        this.asgres = asgres;
        this.reccod = reccod;
        this.expordcod = expordcod;
        this.reclin = reclin;
        this.expordcodori = expordcodori;
        this.expordlin = expordlin;
        this.expordlinori = expordlinori;
    }

//------------Getters y Setters----------
     public Integer getNdocod() {
        return ndocod;
    }

   public void setNdocod(Integer ndocod) {
      this.ndocod = ndocod;
 }

     public String getNdosit() {
        return ndosit;
    }

   public void setNdosit(String ndosit) {
      this.ndosit = ndosit;
 }

     public Integer getCntextcod() {
        return cntextcod;
    }

   public void setCntextcod(Integer cntextcod) {
      this.cntextcod = cntextcod;
 }

     public Integer getCntcod() {
        return cntcod;
    }

   public void setCntcod(Integer cntcod) {
      this.cntcod = cntcod;
 }

     public Integer getArtcod() {
        return artcod;
    }

   public void setArtcod(Integer artcod) {
      this.artcod = artcod;
 }

     public Integer getCanuni() {
        return canuni;
    }

   public void setCanuni(Integer canuni) {
      this.canuni = canuni;
 }

     public String getUnitip() {
        return unitip;
    }

   public void setUnitip(String unitip) {
      this.unitip = unitip;
 }

     public String getCrirot() {
        return crirot;
    }

   public void setCrirot(String crirot) {
      this.crirot = crirot;
 }

     public Date getFecfab() {
        return fecfab;
    }

   public void setFecfab(Date fecfab) {
      this.fecfab = fecfab;
 }

     public Date getFeccad() {
        return feccad;
    }

   public void setFeccad(Date feccad) {
      this.feccad = feccad;
 }

     public String getLote() {
        return lote;
    }

   public void setLote(String lote) {
      this.lote = lote;
 }

     public Float getPes() {
        return pes;
    }

   public void setPes(Float pes) {
      this.pes = pes;
 }

     public Float getPesalb() {
        return pesalb;
    }

   public void setPesalb(Float pesalb) {
      this.pesalb = pesalb;
 }

     public Float getPesfin() {
        return pesfin;
    }

   public void setPesfin(Float pesfin) {
      this.pesfin = pesfin;
 }

     public Float getPesmed() {
        return pesmed;
    }

   public void setPesmed(Float pesmed) {
      this.pesmed = pesmed;
 }

     public Float getPesmod() {
        return pesmod;
    }

   public void setPesmod(Float pesmod) {
      this.pesmod = pesmod;
 }

     public Float getPespic() {
        return pespic;
    }

   public void setPespic(Float pespic) {
      this.pespic = pespic;
 }

     public Date getMomrec() {
        return momrec;
    }

   public void setMomrec(Date momrec) {
      this.momrec = momrec;
 }

     public Integer getAltura() {
        return altura;
    }

   public void setAltura(Integer altura) {
      this.altura = altura;
 }

     public Integer getBase() {
        return base;
    }

   public void setBase(Integer base) {
      this.base = base;
 }

     public String getEancod() {
        return eancod;
    }

   public void setEancod(String eancod) {
      this.eancod = eancod;
 }

     public String getSinean() {
        return sinean;
    }

   public void setSinean(String sinean) {
      this.sinean = sinean;
 }

     public String getValest() {
        return valest;
    }

   public void setValest(String valest) {
      this.valest = valest;
 }

     public Integer getAsgres() {
        return asgres;
    }

   public void setAsgres(Integer asgres) {
      this.asgres = asgres;
 }

     public Integer getReccod() {
        return reccod;
    }

   public void setReccod(Integer reccod) {
      this.reccod = reccod;
 }

     public Integer getExpordcod() {
        return expordcod;
    }

   public void setExpordcod(Integer expordcod) {
      this.expordcod = expordcod;
 }

     public Integer getReclin() {
        return reclin;
    }

   public void setReclin(Integer reclin) {
      this.reclin = reclin;
 }

     public Integer getExpordcodori() {
        return expordcodori;
    }

   public void setExpordcodori(Integer expordcodori) {
      this.expordcodori = expordcodori;
 }

     public Integer getExpordlin() {
        return expordlin;
    }

   public void setExpordlin(Integer expordlin) {
      this.expordlin = expordlin;
 }

     public Integer getExpordlinori() {
        return expordlinori;
    }

   public void setExpordlinori(Integer expordlinori) {
      this.expordlinori = expordlinori;
 }

//------------Objeto Inicial----------
   public Cntndo getObjIni(){
      Cntndo objIni=new Cntndo();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setNdocod( 0);
            objIni.setNdosit("");
            objIni.setCntextcod( 0);
            objIni.setCntcod( 0);
            objIni.setArtcod( 0);
            objIni.setCanuni( 0);
            objIni.setUnitip("");
            objIni.setCrirot("");
            objIni.setFecfab(now);
            objIni.setFeccad(now);
            objIni.setLote("");
            objIni.setPes(ceroFloat);
            objIni.setPesalb(ceroFloat);
            objIni.setPesfin(ceroFloat);
            objIni.setPesmed(ceroFloat);
            objIni.setPesmod(ceroFloat);
            objIni.setPespic(ceroFloat);
         return objIni;
     }

//------------HELPS----------
     public String helpNdocod(){
        String ayuda="";
        return ayuda;
     }

     public String helpNdosit(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntextcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpArtcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCanuni(){
        String ayuda="";
        return ayuda;
     }

     public String helpUnitip(){
        String ayuda="";
        return ayuda;
     }

     public String helpCrirot(){
        String ayuda="";
        return ayuda;
     }

     public String helpFecfab(){
        String ayuda="";
        return ayuda;
     }

     public String helpFeccad(){
        String ayuda="";
        return ayuda;
     }

     public String helpLote(){
        String ayuda="";
        return ayuda;
     }

     public String helpPes(){
        String ayuda="";
        return ayuda;
     }

     public String helpPesalb(){
        String ayuda="";
        return ayuda;
     }

     public String helpPesfin(){
        String ayuda="";
        return ayuda;
     }

     public String helpPesmed(){
        String ayuda="";
        return ayuda;
     }

     public String helpPesmod(){
        String ayuda="";
        return ayuda;
     }

     public String helpPespic(){
        String ayuda="";
        return ayuda;
     }

     public String helpMomrec(){
        String ayuda="";
        return ayuda;
     }

     public String helpAltura(){
        String ayuda="";
        return ayuda;
     }

     public String helpBase(){
        String ayuda="";
        return ayuda;
     }

     public String helpEancod(){
        String ayuda="";
        return ayuda;
     }

     public String helpSinean(){
        String ayuda="";
        return ayuda;
     }

     public String helpValest(){
        String ayuda="";
        return ayuda;
     }

     public String helpAsgres(){
        String ayuda="";
        return ayuda;
     }

     public String helpReccod(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpReclin(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordcodori(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordlin(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordlinori(){
        String ayuda="";
        return ayuda;
     }

}
