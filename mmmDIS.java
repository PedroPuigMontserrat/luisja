package Modelos;


//------------CLASE------------------
public class mmmDIS {
     private Integer id;
     private String referencia;
     private String descripcion;
     private Integer gestor;
     private Integer tipo;
     private Boolean creCnt;
     private Boolean gesUbi;
     private Boolean busHueSoN;
     private Boolean busNdoSoN;
     private Boolean gesAccCntEnt;

//------------CONSTRUCTOR Sin Parametros------------
    public mmmDIS() {
        super();
    }

//------------CONSTRUCTOR con Parametros (Sin ID)----------
    public mmmDIS(
            String referencia,
            String descripcion,
            Integer gestor,
            Integer tipo,
            Boolean creCnt,
            Boolean gesUbi,
            Boolean busHueSoN,
            Boolean busNdoSoN,
            Boolean fesAccCntEnt){

         this.referencia=referencia;
         this.descripcion=descripcion;
         this.gestor=gestor;
         this.tipo=tipo;
         this.creCnt=creCnt;
         this.gesUbi=gesUbi;
         this.busHueSoN=busHueSoN;
         this.busNdoSoN=busNdoSoN;
         this.gesAccCntEnt=gesAccCntEnt;
     }
//------------CONSTRUCTOR con Parametros ( ID)----------
    public mmmDIS(
            Integer id,
            String referencia,
            String descripcion,
            Integer gestor,
            Integer tipo,
            Boolean creCnt,
            Boolean gesUbi,
            Boolean busHueSoN,
            Boolean busNdoSoN,
            Boolean gesAccCntEnt){

         this.id=id;
         this.referencia=referencia;
         this.descripcion=descripcion;
         this.gestor=gestor;
         this.tipo=tipo;
         this.creCnt=creCnt;
         this.gesUbi=gesUbi;
         this.busHueSoN=busHueSoN;
         this.busNdoSoN=busNdoSoN;
         this.gesAccCntEnt=gesAccCntEnt;
     }

//------------Getters y Setters----------
   public Integer getId() {
        return id;
   }
   public void setId(Integer id) {
      this.id=id;
   }
   public String getReferencia() {
        return referencia;
   }
   public void setReferencia(String referencia) {
      this.referencia=referencia;
   }
   public String getDescripcion() {
        return descripcion;
    }
   public void setDescripcion(String descripcion) {
      this.descripcion=descripcion;
   }
   public void setGestor(Integer gestor) {
      this.gestor=gestor;
   }
   public Integer getGestor() {
        return gestor;
   }
   public void setTipo(Integer tipo) {
      this.tipo=tipo;
   }
   public Integer getTipo() {
        return tipo;
   }
   public void setCrecnt(Boolean creCnt) {
      this.creCnt=creCnt;
   }
   public Boolean getCrecnt() {
        return creCnt;
   }
   public void setGesubi(Boolean gesUbi) {
      this.gesUbi=gesUbi;
   }
   public Boolean getGesUbi() {
        return gesUbi;
   }
   public void setBushueson(Boolean busHueSoN) {
      this.busHueSoN=busHueSoN;
   }
   public Boolean getBushueson() {
        return busHueSoN;
   }
   public void setBusndoson(Boolean busNdoSoN) {
      this.busNdoSoN=busNdoSoN;
   }
   public Boolean getBusndoson() {
        return busNdoSoN;
   }
   public void setGesacccntent(Boolean gesAccCntEnt) {
      this.gesAccCntEnt=gesAccCntEnt;
   }
   public Boolean getGesaccntent() {
        return gesAccCntEnt;
   }

//------------Objeto Inicial--------
   public mmmDIS getObjIni(){
      mmmDIS objIni=new mmmDIS();
          
          objIni.setReferencia("");
          objIni.setDescripcion("");
          objIni.setGestor(0);
          objIni.setTipo(0);
          objIni.setGesubi(false);
          objIni.setBushueson(false);
          objIni.setBusndoson(false);
          objIni.setGesacccntent(false);

          return objIni;
     }

//------------HELPS----------
     public String helpReferencia(){
        String ayuda="Texto referencia";
        return ayuda;
     }

     public String helpDescripcion(){
        String ayuda="Identificación interna";
        return ayuda;
     }

     public String helpGesUbi(){
        String ayuda="El mapa de almacénb con sus ubicaciones está duplicado, o al menos está en adaia con todas las ubicaciones";
        return ayuda;
     }

     public String helpBusHueSoN(){
        String ayuda="La búsqueda de hueco la puede hacer el dispositivo S o adaia N";
        return ayuda;
     }

     public String helpBusNdoSoN(){
        String ayuda="La búsqueda de mercancía la puede hacer el dispositivo S o adaia N";
        return ayuda;
     }

     public String helpGesCntEnt(){
        String ayuda="La entrtada de mercancía es gestionada por el dispositivo S o adaia N";
        return ayuda;
     }

}
