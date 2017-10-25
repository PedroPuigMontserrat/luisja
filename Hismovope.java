/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Hismovope.java                                                */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 12/09/2017 12:46:24           */
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
public class Hismovope {
     private Integer hisopecod;
     private Integer numtur;
     private Integer numturord;
     private String frahorcod;
     private String estado;
     private Date momcre;
     private Date momini;
     private Date momfin;
     private Integer recmaqcod;
     private String recmaqref;
     private Integer recopecod;
     private String recoperef;
     private String acctiptar;
     private String clamov;
     private Integer tieresada;
     private Integer tieresope;
     private Integer cntoricod;
     private String cntoriref;
     private Integer cntdescod;
     private String cntdesref;
     private Integer estoricod;
     private String estoriref;
     private Integer estdescod;
     private String estdesref;
     private Integer ubioricod;
     private String ubioriref;
     private Integer ubidescod;
     private String ubidesref;
     private Integer expordcod;
     private String expordref;
     private Integer expordlin;
     private Integer reccod;
     private Integer reclin;
     private Integer tercod;
     private String terref;
     private String obs;
     private String orimov;
     private Integer funkey;
     private String modulo;

//------------CONSTRUCTOR Sin Parametros------------
    public Hismovope() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Hismovope(
                       Integer hisopecod,
                       Integer numtur,
                       Integer numturord,
                       String frahorcod,
                       String estado,
                       Date momcre,
                       Date momini,
                       Date momfin,
                       Integer recmaqcod,
                       String recmaqref,
                       Integer recopecod,
                       String recoperef,
                       String acctiptar,
                       String clamov,
                       Integer tieresada,
                       Integer tieresope,
                       Integer cntoricod,
                       String cntoriref,
                       Integer cntdescod,
                       String cntdesref,
                       Integer estoricod,
                       String estoriref,
                       Integer estdescod,
                       String estdesref,
                       Integer ubioricod,
                       String ubioriref,
                       Integer ubidescod,
                       String ubidesref,
                       Integer expordcod,
                       String expordref,
                       Integer expordlin,
                       Integer reccod,
                       Integer reclin,
                       Integer tercod,
                       String terref,
                       String obs,
                       String orimov,
                       Integer funkey,
                       String modulo){
        super();
         this.hisopecod = hisopecod;
         this.numtur = numtur;
         this.numturord = numturord;
         this.frahorcod = frahorcod;
         this.estado = estado;
         this.momcre = momcre;
         this.momini = momini;
         this.momfin = momfin;
         this.recmaqcod = recmaqcod;
         this.recmaqref = recmaqref;
         this.recopecod = recopecod;
         this.recoperef = recoperef;
         this.acctiptar = acctiptar;
         this.clamov = clamov;
         this.tieresada = tieresada;
         this.tieresope = tieresope;
         this.cntoricod = cntoricod;
         this.cntoriref = cntoriref;
         this.cntdescod = cntdescod;
         this.cntdesref = cntdesref;
         this.estoricod = estoricod;
         this.estoriref = estoriref;
         this.cntdesref = cntdesref;
         this.estdescod = estdescod;
         this.estdesref = estdesref;
         this.ubioricod = ubioricod;
         this.ubioriref = ubioriref;
         this.ubidescod = ubidescod;
         this.ubidesref = ubidesref;
         this.expordcod = expordcod;
         this.expordref = expordref;
         this.expordlin = expordlin;
         this.reccod = reccod;
         this.reclin = reclin;
         this.tercod = tercod;
         this.terref = terref;
         this.obs = obs;
         this.orimov = orimov;
         this.funkey = funkey;
         this.modulo = modulo;
     }
//------------CONSTRUCTOR con Parametros (Sin ID)----------
   public Hismovope(
                          Integer numtur,
                          Integer numturord,
                          String frahorcod,
                          String estado,
                          Date momcre,
                          Date momini,
                          Date momfin,
                          Integer recmaqcod,
                          String recmaqref,
                          Integer recopecod,
                          String recoperef,
                          String acctiptar,
                          String clamov,
                          Integer tieresada,
                          Integer tieresope,
                          Integer cntoricod,
                          String cntoriref,
                          Integer cntdescod,
                          String cntdesref,
                          Integer estoricod,
                          String estoriref,
                          Integer estdescod,
                          String estdesref,
                          Integer ubioricod,
                          String ubioriref,
                          Integer ubidescod,
                          String ubidesref,
                          Integer expordcod,
                          String expordref,
                          Integer expordlin,
                          Integer reccod,
                          Integer reclin,
                          Integer tercod,
                          String terref,
                          String obs,
                          String orimov,
                          Integer funkey,
                          String modulo){

        this.hisopecod = hisopecod;
        this.numtur = numtur;
        this.numturord = numturord;
        this.frahorcod = frahorcod;
        this.estado = estado;
        this.momcre = momcre;
        this.momini = momini;
        this.momfin = momfin;
        this.recmaqcod = recmaqcod;
        this.recmaqref = recmaqref;
        this.recopecod = recopecod;
        this.recoperef = recoperef;
        this.acctiptar = acctiptar;
        this.clamov = clamov;
        this.tieresada = tieresada;
        this.tieresope = tieresope;
        this.cntoricod = cntoricod;
        this.cntoriref = cntoriref;
        this.cntdescod = cntdescod;
        this.cntdesref = cntdesref;
        this.estoricod = estoricod;
        this.estoriref = estoriref;
        this.cntdesref = cntdesref;
        this.estdescod = estdescod;
        this.estdesref = estdesref;
        this.ubioricod = ubioricod;
        this.ubioriref = ubioriref;
        this.ubidescod = ubidescod;
        this.ubidesref = ubidesref;
        this.expordcod = expordcod;
        this.expordref = expordref;
        this.expordlin = expordlin;
        this.reccod = reccod;
        this.reclin = reclin;
        this.tercod = tercod;
        this.terref = terref;
        this.obs = obs;
        this.orimov = orimov;
        this.funkey = funkey;
        this.modulo = modulo;
    }

//------------Getters y Setters----------
     public Integer getHisopecod() {
        return hisopecod;
    }

   public void setHisopecod(Integer hisopecod) {
      this.hisopecod = hisopecod;
 }

     public Integer getNumtur() {
        return numtur;
    }

   public void setNumtur(Integer numtur) {
      this.numtur = numtur;
 }

     public Integer getNumturord() {
        return numturord;
    }

   public void setNumturord(Integer numturord) {
      this.numturord = numturord;
 }

     public String getFrahorcod() {
        return frahorcod;
    }

   public void setFrahorcod(String frahorcod) {
      this.frahorcod = frahorcod;
 }

     public String getEstado() {
        return estado;
    }

   public void setEstado(String estado) {
      this.estado = estado;
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

     public Integer getRecmaqcod() {
        return recmaqcod;
    }

   public void setRecmaqcod(Integer recmaqcod) {
      this.recmaqcod = recmaqcod;
 }

     public String getRecmaqref() {
        return recmaqref;
    }

   public void setRecmaqref(String recmaqref) {
      this.recmaqref = recmaqref;
 }

     public Integer getRecopecod() {
        return recopecod;
    }

   public void setRecopecod(Integer recopecod) {
      this.recopecod = recopecod;
 }

     public String getRecoperef() {
        return recoperef;
    }

   public void setRecoperef(String recoperef) {
      this.recoperef = recoperef;
 }

     public String getAcctiptar() {
        return acctiptar;
    }

   public void setAcctiptar(String acctiptar) {
      this.acctiptar = acctiptar;
 }

     public String getClamov() {
        return clamov;
    }

   public void setClamov(String clamov) {
      this.clamov = clamov;
 }

     public Integer getTieresada() {
        return tieresada;
    }

   public void setTieresada(Integer tieresada) {
      this.tieresada = tieresada;
 }

     public Integer getTieresope() {
        return tieresope;
    }

   public void setTieresope(Integer tieresope) {
      this.tieresope = tieresope;
 }

     public Integer getCntoricod() {
        return cntoricod;
    }

   public void setCntoricod(Integer cntoricod) {
      this.cntoricod = cntoricod;
 }

     public String getCntoriref() {
        return cntoriref;
    }

   public void setCntoriref(String cntoriref) {
      this.cntoriref = cntoriref;
 }

     public Integer getCntdescod() {
        return cntdescod;
    }

   public void setCntdescod(Integer cntdescod) {
      this.cntdescod = cntdescod;
 }

     public String getCntdesref() {
        return cntdesref;
    }

   public void setCntdesref(String cntdesref) {
      this.cntdesref = cntdesref;
 }

     public Integer getEstoricod() {
        return estoricod;
    }

   public void setEstoricod(Integer estoricod) {
      this.estoricod = estoricod;
 }

     public String getEstoriref() {
        return estoriref;
    }

   public void setEstoriref(String estoriref) {
      this.estoriref = estoriref;
 }

     public Integer getEstdescod() {
        return estdescod;
    }

   public void setEstdescod(Integer estdescod) {
      this.estdescod = estdescod;
 }

     public String getEstdesref() {
        return estdesref;
    }

   public void setEstdesref(String estdesref) {
      this.estdesref = estdesref;
 }

     public Integer getUbioricod() {
        return ubioricod;
    }

   public void setUbioricod(Integer ubioricod) {
      this.ubioricod = ubioricod;
 }

     public String getUbioriref() {
        return ubioriref;
    }

   public void setUbioriref(String ubioriref) {
      this.ubioriref = ubioriref;
 }

     public Integer getUbidescod() {
        return ubidescod;
    }

   public void setUbidescod(Integer ubidescod) {
      this.ubidescod = ubidescod;
 }

     public String getUbidesref() {
        return ubidesref;
    }

   public void setUbidesref(String ubidesref) {
      this.ubidesref = ubidesref;
 }

     public Integer getExpordcod() {
        return expordcod;
    }

   public void setExpordcod(Integer expordcod) {
      this.expordcod = expordcod;
 }

     public String getExpordref() {
        return expordref;
    }

   public void setExpordref(String expordref) {
      this.expordref = expordref;
 }

     public Integer getExpordlin() {
        return expordlin;
    }

   public void setExpordlin(Integer expordlin) {
      this.expordlin = expordlin;
 }

     public Integer getReccod() {
        return reccod;
    }

   public void setReccod(Integer reccod) {
      this.reccod = reccod;
 }

     public Integer getReclin() {
        return reclin;
    }

   public void setReclin(Integer reclin) {
      this.reclin = reclin;
 }

     public Integer getTercod() {
        return tercod;
    }

   public void setTercod(Integer tercod) {
      this.tercod = tercod;
 }

     public String getTerref() {
        return terref;
    }

   public void setTerref(String terref) {
      this.terref = terref;
 }

     public String getObs() {
        return obs;
    }

   public void setObs(String obs) {
      this.obs = obs;
 }

     public String getOrimov() {
        return orimov;
    }

   public void setOrimov(String orimov) {
      this.orimov = orimov;
 }

     public Integer getFunkey() {
        return funkey;
    }

   public void setFunkey(Integer funkey) {
      this.funkey = funkey;
 }

     public String getModulo() {
        return modulo;
    }

   public void setModulo(String modulo) {
      this.modulo = modulo;
 }

//------------Objeto Inicial----------
   public Hismovope getObjIni(){
      Hismovope objIni=new Hismovope();
         float ceroFloat;
         ceroFloat=0;

          Date now = new Date(System.currentTimeMillis());
          SimpleDateFormat date = new SimpleDateFormat("yyyy - mm - dd");
          SimpleDateFormat hour = new SimpleDateFormat("HH: mm: ss");

            objIni.setHisopecod( 0);
            objIni.setNumtur( 0);
            objIni.setNumturord( 0);
            objIni.setFrahorcod("");
            objIni.setEstado("");
            objIni.setMomcre(now);
            objIni.setMomini(now);
            objIni.setMomfin(now);
            objIni.setRecmaqcod( 0);
            objIni.setRecmaqref("");
            objIni.setRecopecod( 0);
            objIni.setRecoperef("");
            objIni.setAcctiptar("");
            objIni.setClamov("");
            objIni.setTieresada( 0);
            objIni.setTieresope( 0);
            objIni.setCntoricod( 0);
            objIni.setCntoriref("");
            objIni.setCntdescod( 0);
            objIni.setCntdesref("");
            objIni.setEstoricod( 0);
            objIni.setEstoriref("");
            objIni.setCntdesref("");
            objIni.setEstdescod( 0);
            objIni.setEstdesref("");
            objIni.setUbioricod( 0);
            objIni.setUbioriref("");
            objIni.setUbidescod( 0);
            objIni.setUbidesref("");
            objIni.setExpordcod( 0);
            objIni.setExpordref("");
            objIni.setExpordlin( 0);
            objIni.setReccod( 0);
            objIni.setReclin( 0);
            objIni.setTercod( 0);
            objIni.setTerref("");
            objIni.setObs("");
            objIni.setOrimov("");
            objIni.setFunkey( 0);
            objIni.setModulo("");
         return objIni;
     }

//------------HELPS----------
     public String helpHisopecod(){
        String ayuda="Codigo";
        return ayuda;
     }

     public String helpNumtur(){
        String ayuda="Turno";
        return ayuda;
     }

     public String helpNumturord(){
        String ayuda="Orden en el turno";
        return ayuda;
     }

     public String helpFrahorcod(){
        String ayuda="Franja de facturación";
        return ayuda;
     }

     public String helpEstado(){
        String ayuda="Estado";
        return ayuda;
     }

     public String helpMomcre(){
        String ayuda="Creación";
        return ayuda;
     }

     public String helpMomini(){
        String ayuda="Inicio";
        return ayuda;
     }

     public String helpMomfin(){
        String ayuda="Final";
        return ayuda;
     }

     public String helpRecmaqcod(){
        String ayuda="Código interno de maquina";
        return ayuda;
     }

     public String helpRecmaqref(){
        String ayuda="Código de máquina";
        return ayuda;
     }

     public String helpRecopecod(){
        String ayuda="Código interno de operario";
        return ayuda;
     }

     public String helpRecoperef(){
        String ayuda="Código de operrio";
        return ayuda;
     }

     public String helpAcctiptar(){
        String ayuda="Tarea (Tabla:xxx:  RE, EX,UB,.,...)";
        return ayuda;
     }

     public String helpClamov(){
        String ayuda="Clave de movimiento (Tabla: xxxx ...)";
        return ayuda;
     }

     public String helpTieresada(){
        String ayuda="Tiempo de respuesta adaia";
        return ayuda;
     }

     public String helpTieresope(){
        String ayuda="Tiempo de respuesta operario";
        return ayuda;
     }

     public String helpCntoricod(){
        String ayuda="Codigo uinterno contenedor origen";
        return ayuda;
     }

     public String helpCntoriref(){
        String ayuda="Código contenedor origen";
        return ayuda;
     }

     public String helpCntdescod(){
        String ayuda="Código unterno contenedor destino";
        return ayuda;
     }

     public String helpCntdesref(){
        String ayuda="Contenedor destibo";
        return ayuda;
     }

     public String helpEstoricod(){
        String ayuda="";
        return ayuda;
     }

     public String helpEstoriref(){
        String ayuda="";
        return ayuda;
     }

     public String helpEstdescod(){
        String ayuda="";
        return ayuda;
     }

     public String helpEstdesref(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbioricod(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbioriref(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbidescod(){
        String ayuda="";
        return ayuda;
     }

     public String helpUbidesref(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordcod(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordref(){
        String ayuda="";
        return ayuda;
     }

     public String helpExpordlin(){
        String ayuda="";
        return ayuda;
     }

     public String helpReccod(){
        String ayuda="";
        return ayuda;
     }

     public String helpReclin(){
        String ayuda="";
        return ayuda;
     }

     public String helpTercod(){
        String ayuda="";
        return ayuda;
     }

     public String helpTerref(){
        String ayuda="";
        return ayuda;
     }

     public String helpObs(){
        String ayuda="";
        return ayuda;
     }

     public String helpOrimov(){
        String ayuda="";
        return ayuda;
     }

     public String helpFunkey(){
        String ayuda="";
        return ayuda;
     }

     public String helpModulo(){
        String ayuda="";
        return ayuda;
     }

}
