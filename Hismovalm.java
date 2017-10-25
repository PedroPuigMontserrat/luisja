/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Hismovalm.java                                                */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 12/09/2017 12:14:29           */
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
public class Hismovalm {
     private Integer hisalmcod;
     private Integer hisopecod;
     private String acctiptar;
     private Date mommov;
     private String obs;
     private String tipmovusr;
     private Integer almcod;
     private Integer almubicod;
     private String almubiref;
     private Integer artcod;
     private String artref;
     private Integer canuni;
     private String lote;
     private String unitip;
     private String fragrp;
     private Date crirot;
     private Integer pes;
     private Integer pesuni;
     private Integer cntcod;
     private String cntdorref;
     private Integer recccod;
     private Integer tercod;

//------------CONSTRUCTOR Sin Parametros------------
    public Hismovalm() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Hismovalm(
                       Integer hisalmcod,
                       Integer hisopecod,
                       String acctiptar,
                       Date mommov,
                       String obs,
                       String tipmovusr,
                       Integer almcod,
                       Integer almubicod,
                       String almubiref,
                       Integer artcod,
                       String artref,
                       Integer canuni,
                       String lote,
                       String unitip,
                       String fragrp,
                       Date crirot,
                       Integer pes,
                       Integer pesuni,
                       Integer cntcod,
                       String cntdorref,
                       Integer recccod,
                       Integer tercod){
        super();
         this.hisalmcod = hisalmcod;
         this.hisopecod = hisopecod;
         this.acctiptar = acctiptar;
         this.mommov = mommov;
         this.obs = obs;
         this.tipmovusr = tipmovusr;
         this.almcod = almcod;
         this.almubicod = almubicod;
         this.almubiref = almubiref;
         this.artcod = artcod;
         this.artref = artref;
         this.canuni = canuni;
         this.lote = lote;
         this.unitip = unitip;
         this.fragrp = fragrp;
         this.crirot = crirot;
         this.pes = pes;
         this.pesuni = pesuni;
         this.cntcod = cntcod;
         this.cntdorref = cntdorref;
         this.recccod = recccod;
         this.tercod = tercod;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Hismovalm(
                       Integer hisopecod,
                       String acctiptar,
                       Date mommov,
                       String obs,
                       String tipmovusr,
                       Integer almcod,
                       Integer almubicod,
                       String almubiref,
                       Integer artcod,
                       String artref,
                       Integer canuni,
                       String lote,
                       String unitip,
                       String fragrp,
                       Date crirot,
                       Integer pes,
                       Integer pesuni,
                       Integer cntcod,
                       String cntdorref,
                       Integer recccod,
                       Integer tercod){

        this.hisalmcod = hisalmcod;
        this.hisopecod = hisopecod;
        this.acctiptar = acctiptar;
        this.mommov = mommov;
        this.obs = obs;
        this.tipmovusr = tipmovusr;
        this.almcod = almcod;
        this.almubicod = almubicod;
        this.almubiref = almubiref;
        this.artcod = artcod;
        this.artref = artref;
        this.canuni = canuni;
        this.lote = lote;
        this.unitip = unitip;
        this.fragrp = fragrp;
        this.crirot = crirot;
        this.pes = pes;
        this.pesuni = pesuni;
        this.cntcod = cntcod;
        this.cntdorref = cntdorref;
        this.recccod = recccod;
        this.tercod = tercod;
    }

//------------Getters y Setters----------
     public Integer getHisalmcod() {
        return hisalmcod;
    }

   public void setHisalmcod(Integer hisalmcod) {
      this.hisalmcod = hisalmcod;
 }

     public Integer getHisopecod() {
        return hisopecod;
    }

   public void setHisopecod(Integer hisopecod) {
      this.hisopecod = hisopecod;
 }

     public String getAcctiptar() {
        return acctiptar;
    }

   public void setAcctiptar(String acctiptar) {
      this.acctiptar = acctiptar;
 }

     public Date getMommov() {
        return mommov;
    }

   public void setMommov(Date mommov) {
      this.mommov = mommov;
 }

     public String getObs() {
        return obs;
    }

   public void setObs(String obs) {
      this.obs = obs;
 }

     public String getTipmovusr() {
        return tipmovusr;
    }

   public void setTipmovusr(String tipmovusr) {
      this.tipmovusr = tipmovusr;
 }

     public Integer getAlmcod() {
        return almcod;
    }

   public void setAlmcod(Integer almcod) {
      this.almcod = almcod;
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

     public Integer getArtcod() {
        return artcod;
    }

   public void setArtcod(Integer artcod) {
      this.artcod = artcod;
 }

     public String getArtref() {
        return artref;
    }

   public void setArtref(String artref) {
      this.artref = artref;
 }

     public Integer getCanuni() {
        return canuni;
    }

   public void setCanuni(Integer canuni) {
      this.canuni = canuni;
 }

     public String getLote() {
        return lote;
    }

   public void setLote(String lote) {
      this.lote = lote;
 }

     public String getUnitip() {
        return unitip;
    }

   public void setUnitip(String unitip) {
      this.unitip = unitip;
 }

     public String getFragrp() {
        return fragrp;
    }

   public void setFragrp(String fragrp) {
      this.fragrp = fragrp;
 }

     public Date getCrirot() {
        return crirot;
    }

   public void setCrirot(Date crirot) {
      this.crirot = crirot;
 }

     public Integer getPes() {
        return pes;
    }

   public void setPes(Integer pes) {
      this.pes = pes;
 }

     public Integer getPesuni() {
        return pesuni;
    }

   public void setPesuni(Integer pesuni) {
      this.pesuni = pesuni;
 }

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

     public Integer getRecccod() {
        return recccod;
    }

   public void setRecccod(Integer recccod) {
      this.recccod = recccod;
 }

     public Integer getTercod() {
        return tercod;
    }

   public void setTercod(Integer tercod) {
      this.tercod = tercod;
 }

//------------Objeto Inicial----------
   public Hismovalm getObjIni(){
      Hismovalm objIni=new Hismovalm();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setHisalmcod( 0);
            objIni.setHisopecod( 0);
            objIni.setAcctiptar("");
            objIni.setMommov(now);
            objIni.setObs("");
            objIni.setTipmovusr("");
            objIni.setAlmcod( 0);
            objIni.setAlmubicod( 0);
            objIni.setAlmubiref("");
            objIni.setArtcod( 0);
            objIni.setArtref("");
            objIni.setCanuni( 0);
            objIni.setLote("");
            objIni.setCntcod( 0);
            objIni.setCntdorref("");
            objIni.setRecccod( 0);
            objIni.setTercod( 0);
         return objIni;
     }

//------------HELPS----------
     public String helpHisalmcod(){
        String ayuda="Código interno";
        return ayuda;
     }

     public String helpHisopecod(){
        String ayuda="Código interno";
        return ayuda;
     }

     public String helpAcctiptar(){
        String ayuda="Tipo de tarea (Tabla: RE UB EX,…)";
        return ayuda;
     }

     public String helpMommov(){
        String ayuda="Momento de la acción";
        return ayuda;
     }

     public String helpObs(){
        String ayuda="Observaciones del movimiento";
        return ayuda;
     }

     public String helpTipmovusr(){
        String ayuda="Tipo de movimiento (Tabla:xxxx ...)";
        return ayuda;
     }

     public String helpAlmcod(){
        String ayuda="Almacén";
        return ayuda;
     }

     public String helpAlmubicod(){
        String ayuda="Código interno de la ubicación";
        return ayuda;
     }

     public String helpAlmubiref(){
        String ayuda="Código de la ubicación";
        return ayuda;
     }

     public String helpArtcod(){
        String ayuda="Artículo";
        return ayuda;
     }

     public String helpArtref(){
        String ayuda="Articulo";
        return ayuda;
     }

     public String helpCanuni(){
        String ayuda="Cantidad";
        return ayuda;
     }

     public String helpLote(){
        String ayuda="Lote";
        return ayuda;
     }

     public String helpUnitip(){
        String ayuda="Unidades";
        return ayuda;
     }

     public String helpFragrp(){
        String ayuda="Fragilidad";
        return ayuda;
     }

     public String helpCrirot(){
        String ayuda="Criterio rotación";
        return ayuda;
     }

     public String helpPes(){
        String ayuda="Peso";
        return ayuda;
     }

     public String helpPesuni(){
        String ayuda="Unidades de peso";
        return ayuda;
     }

     public String helpCntcod(){
        String ayuda="Contenedior";
        return ayuda;
     }

     public String helpCntdorref(){
        String ayuda="Contenedor";
        return ayuda;
     }

     public String helpRecccod(){
        String ayuda="Recepción";
        return ayuda;
     }

     public String helpTercod(){
        String ayuda="Tercero";
        return ayuda;
     }

}
