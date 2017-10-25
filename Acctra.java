/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Acctra.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 12/09/2017 15:48:11           */
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
public class Acctra {
     private Integer acccod;
     private Integer acccolcod;
     private String accest;
     private String accpri;
     private Integer accrelcod;
     private String acctiptar;
     private Integer accord;
     private Integer accordrec;
     private Integer reclin;
     private Integer etienvnum;
     private Integer reccod;
     private String entpro;
     private Integer zoncarcod;
     private Integer cntoricod;
     private Integer cntdescod;
     private Integer ndocod;
     private Integer cntcod;
     private Integer estoricod;
     private Integer artcod;
     private Integer estdescod;
     private Integer can;
     private Integer ubioricod;
     private Integer canmov;
     private Integer ubidescod;
     private Integer canori;
     private Integer canpan;
     private Integer canpen;
     private Float pesmov;
     private String unitip;
     private Date momcre;
     private Date momini;
     private Date momfin;
     private Integer expordcod;
     private Integer expordlin;
     private String expordref;
     private Integer expordpri;
     private Float ancope;
     private String movhorpos;
     private Float movver;

//------------CONSTRUCTOR Sin Parametros------------
    public Acctra() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Acctra(
                       Integer acccod,
                       Integer acccolcod,
                       String accest,
                       String accpri,
                       Integer accrelcod,
                       String acctiptar,
                       Integer accord,
                       Integer accordrec,
                       Integer reclin,
                       Integer etienvnum,
                       Integer reccod,
                       String entpro,
                       Integer zoncarcod,
                       Integer cntoricod,
                       Integer cntdescod,
                       Integer ndocod,
                       Integer cntcod,
                       Integer estoricod,
                       Integer artcod,
                       Integer estdescod,
                       Integer can,
                       Integer ubioricod,
                       Integer canmov,
                       Integer ubidescod,
                       Integer canori,
                       Integer canpan,
                       Integer canpen,
                       Float pesmov,
                       String unitip,
                       Date momcre,
                       Date momini,
                       Date momfin,
                       Integer expordcod,
                       Integer expordlin,
                       String expordref,
                       Integer expordpri,
                       Float ancope,
                       String movhorpos,
                       Float movver){
        super();
         this.acccod = acccod;
         this.acccolcod = acccolcod;
         this.accest = accest;
         this.accpri = accpri;
         this.accrelcod = accrelcod;
         this.acctiptar = acctiptar;
         this.accord = accord;
         this.accordrec = accordrec;
         this.reclin = reclin;
         this.etienvnum = etienvnum;
         this.reccod = reccod;
         this.entpro = entpro;
         this.zoncarcod = zoncarcod;
         this.cntoricod = cntoricod;
         this.cntdescod = cntdescod;
         this.ndocod = ndocod;
         this.cntcod = cntcod;
         this.estoricod = estoricod;
         this.artcod = artcod;
         this.estdescod = estdescod;
         this.can = can;
         this.ubioricod = ubioricod;
         this.canmov = canmov;
         this.ubidescod = ubidescod;
         this.canori = canori;
         this.canpan = canpan;
         this.canpen = canpen;
         this.pesmov = pesmov;
         this.unitip = unitip;
         this.ndocod = ndocod;
         this.momcre = momcre;
         this.momini = momini;
         this.momfin = momfin;
         this.expordcod = expordcod;
         this.expordlin = expordlin;
         this.expordref = expordref;
         this.expordpri = expordpri;
         this.ancope = ancope;
         this.movhorpos = movhorpos;
         this.movver = movver;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Acctra(
                          Integer acccolcod,
                          String accest,
                          String accpri,
                          Integer accrelcod,
                          String acctiptar,
                          Integer accord,
                          Integer accordrec,
                          Integer reclin,
                          Integer etienvnum,
                          Integer reccod,
                          String entpro,
                          Integer zoncarcod,
                          Integer cntoricod,
                          Integer cntdescod,
                          Integer ndocod,
                          Integer cntcod,
                          Integer estoricod,
                          Integer artcod,
                          Integer estdescod,
                          Integer can,
                          Integer ubioricod,
                          Integer canmov,
                          Integer ubidescod,
                          Integer canori,
                          Integer canpan,
                          Integer canpen,
                          Float pesmov,
                          String unitip,
                          Date momcre,
                          Date momini,
                          Date momfin,
                          Integer expordcod,
                          Integer expordlin,
                          String expordref,
                          Integer expordpri,
                          Float ancope,
                          String movhorpos,
                          Float movver){

        this.acccod = acccod;
        this.acccolcod = acccolcod;
        this.accest = accest;
        this.accpri = accpri;
        this.accrelcod = accrelcod;
        this.acctiptar = acctiptar;
        this.accord = accord;
        this.accordrec = accordrec;
        this.reclin = reclin;
        this.etienvnum = etienvnum;
        this.reccod = reccod;
        this.entpro = entpro;
        this.zoncarcod = zoncarcod;
        this.cntoricod = cntoricod;
        this.cntdescod = cntdescod;
        this.ndocod = ndocod;
        this.cntcod = cntcod;
        this.estoricod = estoricod;
        this.artcod = artcod;
        this.estdescod = estdescod;
        this.can = can;
        this.ubioricod = ubioricod;
        this.canmov = canmov;
        this.ubidescod = ubidescod;
        this.canori = canori;
        this.canpan = canpan;
        this.canpen = canpen;
        this.pesmov = pesmov;
        this.unitip = unitip;
        this.ndocod = ndocod;
        this.momcre = momcre;
        this.momini = momini;
        this.momfin = momfin;
        this.expordcod = expordcod;
        this.expordlin = expordlin;
        this.expordref = expordref;
        this.expordpri = expordpri;
        this.ancope = ancope;
        this.movhorpos = movhorpos;
        this.movver = movver;
    }

//------------Getters y Setters----------
     public Integer getAcccod() {
        return acccod;
    }

   public void setAcccod(Integer acccod) {
      this.acccod = acccod;
 }

     public Integer getAcccolcod() {
        return acccolcod;
    }

   public void setAcccolcod(Integer acccolcod) {
      this.acccolcod = acccolcod;
 }

     public String getAccest() {
        return accest;
    }

   public void setAccest(String accest) {
      this.accest = accest;
 }

     public String getAccpri() {
        return accpri;
    }

   public void setAccpri(String accpri) {
      this.accpri = accpri;
 }

     public Integer getAccrelcod() {
        return accrelcod;
    }

   public void setAccrelcod(Integer accrelcod) {
      this.accrelcod = accrelcod;
 }

     public String getAcctiptar() {
        return acctiptar;
    }

   public void setAcctiptar(String acctiptar) {
      this.acctiptar = acctiptar;
 }

     public Integer getAccord() {
        return accord;
    }

   public void setAccord(Integer accord) {
      this.accord = accord;
 }

     public Integer getAccordrec() {
        return accordrec;
    }

   public void setAccordrec(Integer accordrec) {
      this.accordrec = accordrec;
 }

     public Integer getReclin() {
        return reclin;
    }

   public void setReclin(Integer reclin) {
      this.reclin = reclin;
 }

     public Integer getEtienvnum() {
        return etienvnum;
    }

   public void setEtienvnum(Integer etienvnum) {
      this.etienvnum = etienvnum;
 }

     public Integer getReccod() {
        return reccod;
    }

   public void setReccod(Integer reccod) {
      this.reccod = reccod;
 }

     public String getEntpro() {
        return entpro;
    }

   public void setEntpro(String entpro) {
      this.entpro = entpro;
 }

     public Integer getZoncarcod() {
        return zoncarcod;
    }

   public void setZoncarcod(Integer zoncarcod) {
      this.zoncarcod = zoncarcod;
 }

     public Integer getCntoricod() {
        return cntoricod;
    }

   public void setCntoricod(Integer cntoricod) {
      this.cntoricod = cntoricod;
 }

     public Integer getCntdescod() {
        return cntdescod;
    }

   public void setCntdescod(Integer cntdescod) {
      this.cntdescod = cntdescod;
 }

     public Integer getNdocod() {
        return ndocod;
    }

   public void setNdocod(Integer ndocod) {
      this.ndocod = ndocod;
 }

     public Integer getCntcod() {
        return cntcod;
    }

   public void setCntcod(Integer cntcod) {
      this.cntcod = cntcod;
 }

     public Integer getEstoricod() {
        return estoricod;
    }

   public void setEstoricod(Integer estoricod) {
      this.estoricod = estoricod;
 }

     public Integer getArtcod() {
        return artcod;
    }

   public void setArtcod(Integer artcod) {
      this.artcod = artcod;
 }

     public Integer getEstdescod() {
        return estdescod;
    }

   public void setEstdescod(Integer estdescod) {
      this.estdescod = estdescod;
 }

     public Integer getCan() {
        return can;
    }

   public void setCan(Integer can) {
      this.can = can;
 }

     public Integer getUbioricod() {
        return ubioricod;
    }

   public void setUbioricod(Integer ubioricod) {
      this.ubioricod = ubioricod;
 }

     public Integer getCanmov() {
        return canmov;
    }

   public void setCanmov(Integer canmov) {
      this.canmov = canmov;
 }

     public Integer getUbidescod() {
        return ubidescod;
    }

   public void setUbidescod(Integer ubidescod) {
      this.ubidescod = ubidescod;
 }

     public Integer getCanori() {
        return canori;
    }

   public void setCanori(Integer canori) {
      this.canori = canori;
 }

     public Integer getCanpan() {
        return canpan;
    }

   public void setCanpan(Integer canpan) {
      this.canpan = canpan;
 }

     public Integer getCanpen() {
        return canpen;
    }

   public void setCanpen(Integer canpen) {
      this.canpen = canpen;
 }

     public Float getPesmov() {
        return pesmov;
    }

   public void setPesmov(Float pesmov) {
      this.pesmov = pesmov;
 }

     public String getUnitip() {
        return unitip;
    }

   public void setUnitip(String unitip) {
      this.unitip = unitip;
 }

     public Date getMomcre() {
        return momcre;
    }

   public void setMomcre(Date momcre) {
      this.momcre = momcre;
 }

     public Date getMomini() {
        return momini;
    }

   public void setMomini(Date momini) {
      this.momini = momini;
 }

     public Date getMomfin() {
        return momfin;
    }

   public void setMomfin(Date momfin) {
      this.momfin = momfin;
 }

     public Integer getExpordcod() {
        return expordcod;
    }

   public void setExpordcod(Integer expordcod) {
      this.expordcod = expordcod;
 }

     public Integer getExpordlin() {
        return expordlin;
    }

   public void setExpordlin(Integer expordlin) {
      this.expordlin = expordlin;
 }

     public String getExpordref() {
        return expordref;
    }

   public void setExpordref(String expordref) {
      this.expordref = expordref;
 }

     public Integer getExpordpri() {
        return expordpri;
    }

   public void setExpordpri(Integer expordpri) {
      this.expordpri = expordpri;
 }

     public Float getAncope() {
        return ancope;
    }

   public void setAncope(Float ancope) {
      this.ancope = ancope;
 }

     public String getMovhorpos() {
        return movhorpos;
    }

   public void setMovhorpos(String movhorpos) {
      this.movhorpos = movhorpos;
 }

     public Float getMovver() {
        return movver;
    }

   public void setMovver(Float movver) {
      this.movver = movver;
 }

//------------Objeto Inicial----------
   public Acctra getObjIni(){
      Acctra objIni=new Acctra();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setAcccod( 0);
            objIni.setAcccolcod( 0);
            objIni.setAccest("");
            objIni.setAccpri("");
            objIni.setAccrelcod( 0);
            objIni.setAcctiptar("");
            objIni.setAccord( 0);
            objIni.setAccordrec( 0);
            objIni.setReclin( 0);
            objIni.setEtienvnum( 0);
            objIni.setReccod( 0);
            objIni.setEntpro("");
            objIni.setZoncarcod( 0);
            objIni.setCntoricod( 0);
            objIni.setCntdescod( 0);
            objIni.setNdocod( 0);
            objIni.setCntcod( 0);
            objIni.setEstoricod( 0);
            objIni.setArtcod( 0);
            objIni.setEstdescod( 0);
            objIni.setCan( 0);
            objIni.setUbioricod( 0);
            objIni.setCanmov( 0);
            objIni.setUbidescod( 0);
            objIni.setCanori( 0);
            objIni.setCanpan( 0);
            objIni.setCanpen( 0);
            objIni.setPesmov(ceroFloat);
            objIni.setUnitip("");
            objIni.setNdocod( 0);
            objIni.setMomcre(now);
            objIni.setMomini(now);
            objIni.setMomfin(now);
         return objIni;
     }

//------------HELPS----------
     public String helpAcccod(){
        String ayuda="";
        return ayuda;
     }

     public String helpAcccolcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpAccest(){
        String ayuda="";
        return ayuda;
     }

     public String helpAccpri(){
        String ayuda="";
        return ayuda;
     }

     public String helpAccrelcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpAcctiptar(){
        String ayuda="";
        return ayuda;
     }

     public String helpAccord(){
        String ayuda="";
        return ayuda;
     }

     public String helpAccordrec(){
        String ayuda="";
        return ayuda;
     }

     public String helpReclin(){
        String ayuda="";
        return ayuda;
     }

     public String helpEtienvnum(){
        String ayuda="";
        return ayuda;
     }

     public String helpReccod(){
        String ayuda="";
        return ayuda;
     }

     public String helpEntpro(){
        String ayuda="";
        return ayuda;
     }

     public String helpZoncarcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntoricod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntdescod(){
        String ayuda="";
        return ayuda;
     }

     public String helpNdocod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpEstoricod(){
        String ayuda="";
        return ayuda;
     }

     public String helpArtcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpEstdescod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCan(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbioricod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCanmov(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbidescod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCanori(){
        String ayuda="";
        return ayuda;
     }

     public String helpCanpan(){
        String ayuda="";
        return ayuda;
     }

     public String helpCanpen(){
        String ayuda="";
        return ayuda;
     }

     public String helpPesmov(){
        String ayuda="";
        return ayuda;
     }

     public String helpUnitip(){
        String ayuda="";
        return ayuda;
     }

     public String helpMomcre(){
        String ayuda="";
        return ayuda;
     }

     public String helpMomini(){
        String ayuda="";
        return ayuda;
     }

     public String helpMomfin(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordlin(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordref(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordpri(){
        String ayuda="";
        return ayuda;
     }

     public String helpAncope(){
        String ayuda="";
        return ayuda;
     }

     public String helpMovhorpos(){
        String ayuda="";
        return ayuda;
     }

     public String helpMovver(){
        String ayuda="";
        return ayuda;
     }

}
