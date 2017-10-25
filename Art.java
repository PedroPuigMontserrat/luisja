package Modelos;


//------------CLASE------------------
public class Art {
     private Integer ArtCod;
     private String ArtDes;
    
//------------CONSTRUCTOR Sin Parametros------------
    public Art() {
        super();
    }

//------------CONSTRUCTOR con Parametros (Sin ID)----------
    public Art(
            Integer ArtCod,
            String ArtDes){

        this.ArtCod = ArtCod;
        this.ArtDes = ArtDes;
    }
//------------Getters y Setters----------
public Integer getArtCod(){return ArtCod;}
public String getArtDes(){return ArtDes;}

//------------Objeto Inicial--------
}
