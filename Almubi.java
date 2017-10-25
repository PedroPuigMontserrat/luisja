/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Almubi.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 12/09/2017 13:50:28           */
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
public class Almubi {
     private Integer agrubi;
     private Integer almcod;
     private Integer almubicod;
     private String dimcod;
     private Integer estcod;
     private String ubitip;
     private Integer zoncarcod;
     private Integer zoncolcod;
     private Integer zoninvcod;
     private Integer zonmvtcod;
     private Integer zonpiccod;
     private Integer zonprecod;
     private Integer zonubicod;
     private Integer accllecod;
     private Integer accvaccod;
     private String motivo;
     private String ubiest;
     private String ubisit;
     private Float altfis;
     private String consig;
     private Integer posx;
     private Integer posy;
     private Integer posz;
     private Integer conaccubi;
     private Integer ubirot;
     private Date ultent;
     private Date ultsal;
     private Integer cntcod;
     private String agrubicnttip;

//------------CONSTRUCTOR Sin Parametros------------
    public Almubi() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Almubi(
                       Integer agrubi,
                       Integer almcod,
                       Integer almubicod,
                       String dimcod,
                       Integer estcod,
                       String ubitip,
                       Integer zoncarcod,
                       Integer zoncolcod,
                       Integer zoninvcod,
                       Integer zonmvtcod,
                       Integer zonpiccod,
                       Integer zonprecod,
                       Integer zonubicod,
                       Integer accllecod,
                       Integer accvaccod,
                       String motivo,
                       String ubiest,
                       String ubisit,
                       Float altfis,
                       String consig,
                       Integer posx,
                       Integer posy,
                       Integer posz,
                       Integer conaccubi,
                       Integer ubirot,
                       Date ultent,
                       Date ultsal,
                       Integer cntcod,
                       String agrubicnttip){
        super();
         this.agrubi = agrubi;
         this.almcod = almcod;
         this.almubicod = almubicod;
         this.dimcod = dimcod;
         this.estcod = estcod;
         this.ubitip = ubitip;
         this.zoncarcod = zoncarcod;
         this.zoncolcod = zoncolcod;
         this.zoninvcod = zoninvcod;
         this.zonmvtcod = zonmvtcod;
         this.zonpiccod = zonpiccod;
         this.zonprecod = zonprecod;
         this.zonubicod = zonubicod;
         this.accllecod = accllecod;
         this.accvaccod = accvaccod;
         this.motivo = motivo;
         this.ubiest = ubiest;
         this.ubisit = ubisit;
         this.altfis = altfis;
         this.consig = consig;
         this.posx = posx;
         this.posy = posy;
         this.posz = posz;
         this.conaccubi = conaccubi;
         this.ubirot = ubirot;
         this.ultent = ultent;
         this.ultsal = ultsal;
         this.cntcod = cntcod;
         this.agrubicnttip = agrubicnttip;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Almubi(
                               Integer agrubi,
                          Integer almcod,
                          String dimcod,
                          Integer estcod,
                          String ubitip,
                          Integer zoncarcod,
                          Integer zoncolcod,
                          Integer zoninvcod,
                          Integer zonmvtcod,
                          Integer zonpiccod,
                          Integer zonprecod,
                          Integer zonubicod,
                          Integer accllecod,
                          Integer accvaccod,
                          String motivo,
                          String ubiest,
                          String ubisit,
                          Float altfis,
                          String consig,
                          Integer posx,
                          Integer posy,
                          Integer posz,
                          Integer conaccubi,
                          Integer ubirot,
                          Date ultent,
                          Date ultsal,
                          Integer cntcod,
                          String agrubicnttip){

        this.agrubi = agrubi;
        this.almcod = almcod;
        this.almubicod = almubicod;
        this.dimcod = dimcod;
        this.estcod = estcod;
        this.ubitip = ubitip;
        this.zoncarcod = zoncarcod;
        this.zoncolcod = zoncolcod;
        this.zoninvcod = zoninvcod;
        this.zonmvtcod = zonmvtcod;
        this.zonpiccod = zonpiccod;
        this.zonprecod = zonprecod;
        this.zonubicod = zonubicod;
        this.accllecod = accllecod;
        this.accvaccod = accvaccod;
        this.motivo = motivo;
        this.ubiest = ubiest;
        this.ubisit = ubisit;
        this.altfis = altfis;
        this.consig = consig;
        this.posx = posx;
        this.posy = posy;
        this.posz = posz;
        this.conaccubi = conaccubi;
        this.ubirot = ubirot;
        this.ultent = ultent;
        this.ultsal = ultsal;
        this.cntcod = cntcod;
        this.agrubicnttip = agrubicnttip;
    }

//------------Getters y Setters----------
     public Integer getAgrubi() {
        return agrubi;
    }

   public void setAgrubi(Integer agrubi) {
      this.agrubi = agrubi;
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

     public String getDimcod() {
        return dimcod;
    }

   public void setDimcod(String dimcod) {
      this.dimcod = dimcod;
 }

     public Integer getEstcod() {
        return estcod;
    }

   public void setEstcod(Integer estcod) {
      this.estcod = estcod;
 }

     public String getUbitip() {
        return ubitip;
    }

   public void setUbitip(String ubitip) {
      this.ubitip = ubitip;
 }

     public Integer getZoncarcod() {
        return zoncarcod;
    }

   public void setZoncarcod(Integer zoncarcod) {
      this.zoncarcod = zoncarcod;
 }

     public Integer getZoncolcod() {
        return zoncolcod;
    }

   public void setZoncolcod(Integer zoncolcod) {
      this.zoncolcod = zoncolcod;
 }

     public Integer getZoninvcod() {
        return zoninvcod;
    }

   public void setZoninvcod(Integer zoninvcod) {
      this.zoninvcod = zoninvcod;
 }

     public Integer getZonmvtcod() {
        return zonmvtcod;
    }

   public void setZonmvtcod(Integer zonmvtcod) {
      this.zonmvtcod = zonmvtcod;
 }

     public Integer getZonpiccod() {
        return zonpiccod;
    }

   public void setZonpiccod(Integer zonpiccod) {
      this.zonpiccod = zonpiccod;
 }

     public Integer getZonprecod() {
        return zonprecod;
    }

   public void setZonprecod(Integer zonprecod) {
      this.zonprecod = zonprecod;
 }

     public Integer getZonubicod() {
        return zonubicod;
    }

   public void setZonubicod(Integer zonubicod) {
      this.zonubicod = zonubicod;
 }

     public Integer getAccllecod() {
        return accllecod;
    }

   public void setAccllecod(Integer accllecod) {
      this.accllecod = accllecod;
 }

     public Integer getAccvaccod() {
        return accvaccod;
    }

   public void setAccvaccod(Integer accvaccod) {
      this.accvaccod = accvaccod;
 }

     public String getMotivo() {
        return motivo;
    }

   public void setMotivo(String motivo) {
      this.motivo = motivo;
 }

     public String getUbiest() {
        return ubiest;
    }

   public void setUbiest(String ubiest) {
      this.ubiest = ubiest;
 }

     public String getUbisit() {
        return ubisit;
    }

   public void setUbisit(String ubisit) {
      this.ubisit = ubisit;
 }

     public Float getAltfis() {
        return altfis;
    }

   public void setAltfis(Float altfis) {
      this.altfis = altfis;
 }

     public String getConsig() {
        return consig;
    }

   public void setConsig(String consig) {
      this.consig = consig;
 }

     public Integer getPosx() {
        return posx;
    }

   public void setPosx(Integer posx) {
      this.posx = posx;
 }

     public Integer getPosy() {
        return posy;
    }

   public void setPosy(Integer posy) {
      this.posy = posy;
 }

     public Integer getPosz() {
        return posz;
    }

   public void setPosz(Integer posz) {
      this.posz = posz;
 }

     public Integer getConaccubi() {
        return conaccubi;
    }

   public void setConaccubi(Integer conaccubi) {
      this.conaccubi = conaccubi;
 }

     public Integer getUbirot() {
        return ubirot;
    }

   public void setUbirot(Integer ubirot) {
      this.ubirot = ubirot;
 }

     public Date getUltent() {
        return ultent;
    }

   public void setUltent(Date ultent) {
      this.ultent = ultent;
 }

     public Date getUltsal() {
        return ultsal;
    }

   public void setUltsal(Date ultsal) {
      this.ultsal = ultsal;
 }

     public Integer getCntcod() {
        return cntcod;
    }

   public void setCntcod(Integer cntcod) {
      this.cntcod = cntcod;
 }

     public String getAgrubicnttip() {
        return agrubicnttip;
    }

   public void setAgrubicnttip(String agrubicnttip) {
      this.agrubicnttip = agrubicnttip;
 }

//------------Objeto Inicial----------
   public Almubi getObjIni(){
      Almubi objIni=new Almubi();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setAgrubi( 0);
            objIni.setAlmcod( 0);
            objIni.setAlmubicod( 0);
            objIni.setDimcod("");
            objIni.setEstcod( 0);
            objIni.setUbitip("");
            objIni.setZoncarcod( 0);
            objIni.setZoncolcod( 0);
            objIni.setZoninvcod( 0);
            objIni.setZonmvtcod( 0);
            objIni.setZonpiccod( 0);
            objIni.setZonprecod( 0);
            objIni.setZonubicod( 0);
            objIni.setAccllecod( 0);
            objIni.setAccvaccod( 0);
            objIni.setMotivo("");
            objIni.setUbiest("");
            objIni.setUbisit("");
            objIni.setAltfis(ceroFloat);
            objIni.setConsig("");
            objIni.setPosx( 0);
            objIni.setPosy( 0);
            objIni.setPosz( 0);
            objIni.setConaccubi( 0);
            objIni.setUbirot( 0);
         return objIni;
     }

//------------HELPS----------
     public String helpAgrubi(){
        String ayuda="";
        return ayuda;
     }

     public String helpAlmcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpAlmubicod(){
        String ayuda="";
        return ayuda;
     }

     public String helpDimcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpEstcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbitip(){
        String ayuda="";
        return ayuda;
     }

     public String helpZoncarcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpZoncolcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpZoninvcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpZonmvtcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpZonpiccod(){
        String ayuda="";
        return ayuda;
     }

     public String helpZonprecod(){
        String ayuda="";
        return ayuda;
     }

     public String helpZonubicod(){
        String ayuda="";
        return ayuda;
     }

     public String helpAccllecod(){
        String ayuda="";
        return ayuda;
     }

     public String helpAccvaccod(){
        String ayuda="";
        return ayuda;
     }

     public String helpMotivo(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbiest(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbisit(){
        String ayuda="";
        return ayuda;
     }

     public String helpAltfis(){
        String ayuda="";
        return ayuda;
     }

     public String helpConsig(){
        String ayuda="";
        return ayuda;
     }

     public String helpPosx(){
        String ayuda="";
        return ayuda;
     }

     public String helpPosy(){
        String ayuda="";
        return ayuda;
     }

     public String helpPosz(){
        String ayuda="";
        return ayuda;
     }

     public String helpConaccubi(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbirot(){
        String ayuda="";
        return ayuda;
     }

     public String helpUltent(){
        String ayuda="";
        return ayuda;
     }

     public String helpUltsal(){
        String ayuda="";
        return ayuda;
     }

     public String helpCntcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpAgrubicnttip(){
        String ayuda="";
        return ayuda;
     }

}
