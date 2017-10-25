/* ====================================================================== */
/* NO MODIFICAR sin el permiso escrito de WMSadaia */
/* Archivo: Gencon.java                                                   */
/* Titulo : Genera clase                                                  */
/* Generado por ppuig en PEDROPUIG8670 el : 13/09/2017 11:21:03           */
/* ====================================================================== */
/*
Este archivo constituye la definicion estandar de la clase 
para cada uno de los objetos de la base de datos.
Todos los modelos de los objetos que se guardan en la BBDD
figuran en el package Modelos.
*/

package Modelos;


//------------CLASE------------------
public class Gencon {
     private String genconcod;
     private String gencondes;
     private Integer valact;
     private Integer valfin;
     private Integer valinc;
     private Integer valini;

//------------CONSTRUCTOR Sin Parametros------------
    public Gencon() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
   public Gencon(
                       String genconcod,
                       String gencondes,
                       Integer valact,
                       Integer valfin,
                       Integer valinc,
                       Integer valini){
         this.genconcod = genconcod;
         this.gencondes = gencondes;
         this.valact = valact;
         this.valfin = valfin;
         this.valinc = valinc;
         this.valini = valini;
     }

//------------Getters y Setters----------
     public String getGenconcod() {
        return genconcod;
    }

   public void setGenconcod(String genconcod) {
      this.genconcod = genconcod;
 }

     public String getGencondes() {
        return gencondes;
    }

   public void setGencondes(String gencondes) {
      this.gencondes = gencondes;
 }

     public Integer getValact() {
        return valact;
    }

   public void setValact(Integer valact) {
      this.valact = valact;
 }

     public Integer getValfin() {
        return valfin;
    }

   public void setValfin(Integer valfin) {
      this.valfin = valfin;
 }

     public Integer getValinc() {
        return valinc;
    }

   public void setValinc(Integer valinc) {
      this.valinc = valinc;
 }

     public Integer getValini() {
        return valini;
    }

   public void setValini(Integer valini) {
      this.valini = valini;
 }

}
