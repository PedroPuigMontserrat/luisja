/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Cntdor.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 12/09/2017 13:50:59           */
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
public class Cntdor {
     private Integer cntcod;
     private String cntdorref;
     private Integer cntsupcod;
     private Integer cntagrcod;
     private String cntdormat;
     private Boolean cntcom;
     private String cntsit;
     private String cnttip;
     private Integer dim;
     private String bustip;
     private String cntpro;
     private Date momcre;
     private Date mombaj;
     private Date mompes;
     private Date ccemom;
     private Integer tipeti;
     private String ubiref;
     private Integer zonubicod;
     private Integer reccod;
     private Integer terprocod;
     private Float pes;

//------------CONSTRUCTOR Sin Parametros------------
    public Cntdor() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Cntdor(
                       Integer cntcod,
                       String cntdorref,
                       Integer cntsupcod,
                       Integer cntagrcod,
                       String cntdormat,
                       Boolean cntcom,
                       String cntsit,
                       String cnttip,
                       Integer dim,
                       String bustip,
                       String cntpro,
                       Date momcre,
                       Date mombaj,
                       Date mompes,
                       Date ccemom,
                       Integer tipeti,
                       String ubiref,
                       Integer zonubicod,
                       Integer reccod,
                       Integer terprocod,
                       Float pes){
        super();
         this.cntcod = cntcod;
         this.cntdorref = cntdorref;
         this.cntsupcod = cntsupcod;
         this.cntagrcod = cntagrcod;
         this.cntdormat = cntdormat;
         this.cntcom = cntcom;
         this.cntsit = cntsit;
         this.cnttip = cnttip;
         this.dim = dim;
         this.bustip = bustip;
         this.cntpro = cntpro;
         this.momcre = momcre;
         this.mombaj = mombaj;
         this.mompes = mompes;
         this.ccemom = ccemom;
         this.tipeti = tipeti;
         this.ubiref = ubiref;
         this.zonubicod = zonubicod;
         this.reccod = reccod;
         this.terprocod = terprocod;
         this.pes = pes;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Cntdor(
                       String cntdorref,
                       Integer cntsupcod,
                       Integer cntagrcod,
                       String cntdormat,
                       Boolean cntcom,
                       String cntsit,
                       String cnttip,
                       Integer dim,
                       String bustip,
                       String cntpro,
                       Date momcre,
                       Date mombaj,
                       Date mompes,
                       Date ccemom,
                       Integer tipeti,
                       String ubiref,
                       Integer zonubicod,
                       Integer reccod,
                       Integer terprocod,
                       Float pes){

        this.cntcod = cntcod;
        this.cntdorref = cntdorref;
        this.cntsupcod = cntsupcod;
        this.cntagrcod = cntagrcod;
        this.cntdormat = cntdormat;
        this.cntcom = cntcom;
        this.cntsit = cntsit;
        this.cnttip = cnttip;
        this.dim = dim;
        this.bustip = bustip;
        this.cntpro = cntpro;
        this.momcre = momcre;
        this.mombaj = mombaj;
        this.mompes = mompes;
        this.ccemom = ccemom;
        this.tipeti = tipeti;
        this.ubiref = ubiref;
        this.zonubicod = zonubicod;
        this.reccod = reccod;
        this.terprocod = terprocod;
        this.pes = pes;
    }

//------------Getters y Setters----------
     public Integer getCntcod() {
        return cntcod;
    }

   public void setCntcod(Integer cntcod) {
      this.cntcod = cntcod;
 }

     public String getCntdorref() {
        return cntdorref;
    }

   public void setCntdorref(String cntdorref) {
      this.cntdorref = cntdorref;
 }

     public Integer getCntsupcod() {
        return cntsupcod;
    }

   public void setCntsupcod(Integer cntsupcod) {
      this.cntsupcod = cntsupcod;
 }

     public Integer getCntagrcod() {
        return cntagrcod;
    }

   public void setCntagrcod(Integer cntagrcod) {
      this.cntagrcod = cntagrcod;
 }

     public String getCntdormat() {
        return cntdormat;
    }

   public void setCntdormat(String cntdormat) {
      this.cntdormat = cntdormat;
 }

     public Boolean getCntcom() {
        return cntcom;
    }

   public void setCntcom(Boolean cntcom) {
      this.cntcom = cntcom;
 }

     public String getCntsit() {
        return cntsit;
    }

   public void setCntsit(String cntsit) {
      this.cntsit = cntsit;
 }

     public String getCnttip() {
        return cnttip;
    }

   public void setCnttip(String cnttip) {
      this.cnttip = cnttip;
 }

     public Integer getDim() {
        return dim;
    }

   public void setDim(Integer dim) {
      this.dim = dim;
 }

     public String getBustip() {
        return bustip;
    }

   public void setBustip(String bustip) {
      this.bustip = bustip;
 }

     public String getCntpro() {
        return cntpro;
    }

   public void setCntpro(String cntpro) {
      this.cntpro = cntpro;
 }

     public Date getMomcre() {
        return momcre;
    }

   public void setMomcre(Date momcre) {
      this.momcre = momcre;
 }

     public Date getMombaj() {
        return mombaj;
    }

   public void setMombaj(Date mombaj) {
      this.mombaj = mombaj;
 }

     public Date getMompes() {
        return mompes;
    }

   public void setMompes(Date mompes) {
      this.mompes = mompes;
 }

     public Date getCcemom() {
        return ccemom;
    }

   public void setCcemom(Date ccemom) {
      this.ccemom = ccemom;
 }

     public Integer getTipeti() {
        return tipeti;
    }

   public void setTipeti(Integer tipeti) {
      this.tipeti = tipeti;
 }

     public String getUbiref() {
        return ubiref;
    }

   public void setUbiref(String ubiref) {
      this.ubiref = ubiref;
 }

     public Integer getZonubicod() {
        return zonubicod;
    }

   public void setZonubicod(Integer zonubicod) {
      this.zonubicod = zonubicod;
 }

     public Integer getReccod() {
        return reccod;
    }

   public void setReccod(Integer reccod) {
      this.reccod = reccod;
 }

     public Integer getTerprocod() {
        return terprocod;
    }

   public void setTerprocod(Integer terprocod) {
      this.terprocod = terprocod;
 }

     public Float getPes() {
        return pes;
    }

   public void setPes(Float pes) {
      this.pes = pes;
 }

//------------Objeto Inicial----------
   public Cntdor getObjIni(){
      Cntdor objIni=new Cntdor();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setCntcod( 0);
            objIni.setCntdorref("");
            objIni.setCntsupcod( 0);
            objIni.setCntagrcod( 0);
            objIni.setCntdormat("");
            objIni.setCntcom(false);
            objIni.setBustip("");
            objIni.setCntpro("");
         return objIni;
     }

//------------HELPS----------
     public String helpCntcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntdorref(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntsupcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntagrcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntdormat(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntcom(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntsit(){
        String ayuda="";
        return ayuda;
     }

     public String helpCnttip(){
        String ayuda="";
        return ayuda;
     }

     public String helpDim(){
        String ayuda="";
        return ayuda;
     }

     public String helpBustip(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntpro(){
        String ayuda="";
        return ayuda;
     }

     public String helpMomcre(){
        String ayuda="";
        return ayuda;
     }

     public String helpMombaj(){
        String ayuda="";
        return ayuda;
     }

     public String helpMompes(){
        String ayuda="";
        return ayuda;
     }

     public String helpCcemom(){
        String ayuda="";
        return ayuda;
     }

     public String helpTipeti(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbiref(){
        String ayuda="No tiene sentido";
        return ayuda;
     }

     public String helpZonubicod(){
        String ayuda="No tiene sentido";
        return ayuda;
     }

     public String helpReccod(){
        String ayuda="Esta en los comtenidos";
        return ayuda;
     }

     public String helpTerprocod(){
        String ayuda="Está en los contenidos";
        return ayuda;
     }

     public String helpPes(){
        String ayuda="Esta en loscontenidos";
        return ayuda;
     }

}
