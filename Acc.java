package Modelos;

import java.sql.Date;


//------------CLASE------------------
public class Acc {
     private Integer AccCod;
     private Integer AccColCod;
     private String AccEst;
     private Integer AccPri;
     private Integer AccRelCod;
     private String AccTipTar;

     private Integer ArtCod;
     private Integer CanUni;
     private Integer CntOriCod;
     private Integer CntDesCod;
     private Integer NdoCod;

     private Integer UbiOriCod;
     private Integer UbiDesCod;
     private Integer CntCod;

     private Date MomCre;
     private Date MomIni;
     private Date MomFin;
     
     private Float AncPas; 
     private String MovHorPos;
     private String MovVer;
    
//------------CONSTRUCTOR Sin Parametros------------
    public Acc() {
        super();
    }

//------------CONSTRUCTOR con Parametros (Sin ID)----------
    public Acc(
            Integer AccCod,
            Integer AccColCod,
            String AccEst,
            Integer AccPri,
            Integer AccRelCod,
            String AccTipTar,

            Integer ArtCod,
            Integer CanUni,
            Integer CntOriCod,
            Integer CntDesCod,
            Integer CntCod,
            Integer NdoCod,

            Date MomCre,
            Date MomIni,
            Date MomFin,

            Float AncPas, 
            String MovHorPos,
            String MovVer){

        this.AccCod = AccCod;
        this.AccColCod = AccColCod;
        this.AccEst = AccEst;
        this.AccPri = AccPri;
        this.AccRelCod = AccRelCod;
        this.AccTipTar = AccTipTar;
        this.ArtCod = ArtCod;
        this.CanUni = CanUni;
        this.CntOriCod = CntOriCod;
        this.CntDesCod = CntDesCod;
        this.NdoCod = NdoCod;
        this.CntCod = CntCod;
        this.UbiOriCod = UbiOriCod;
        this.UbiDesCod = UbiDesCod;
        this.MomCre = MomCre;
        this.MomIni = MomIni;
        this.MomFin = MomFin;
        this.AncPas = AncPas;
        this.MovHorPos = MovHorPos;
        this.MovVer = MovVer;
    }
//------------CONSTRUCTOR con Parametros ( ID)----------
    public Acc(
            Integer AccColCod,
            String AccEst,
            Integer AccPri,
            Integer AccRelCod,
            String AccTipTar,

            Integer ArtCod,
            Integer CanUni,
            Integer CntOriCod,
            Integer CntDesCod,
            Integer CntCod,
            Integer NdoCod,

            Date MomCre,
            Date MomIni,
            Date MomFin,

            Float AncPas, 
            String MovHorPos,
            String MovVer){

        this.AccCod=AccCod;
        this.AccColCod=AccColCod;
        this.AccEst=AccEst;
        this.AccPri=AccPri;
        this.AccRelCod=AccRelCod;
        this.AccTipTar=AccTipTar;
        this.ArtCod=ArtCod;
        this.CanUni=CanUni;
        this.CntOriCod=CntOriCod;
        this.CntDesCod=CntDesCod;
        this.NdoCod=NdoCod;
        this.CntCod=CntCod;
        this.UbiOriCod=UbiOriCod;
        this.UbiDesCod=UbiDesCod;
        this.MomCre=MomCre;
        this.MomIni=MomIni;
        this.MomFin=MomFin;
        this.AncPas=AncPas;
        this.MovHorPos=MovHorPos;
        this.MovVer=MovVer;
    }

//------------Getters y Setters----------
public Integer getAccCod(){return AccCod;}
public Integer getAccColCod(){return AccColCod;}
public String getAccEst(){return AccEst;}
public Integer getAccPri(){return AccPri;}
public Integer getAccRelCod(){return AccRelCod;}
public String getAccTipTar(){return AccTipTar;}
public Integer getArtCod(){return ArtCod;}
public Integer getCanUni(){return CanUni;}
public Integer getCntOriCod(){return CntOriCod;}
public Integer getCntDesCod(){return CntDesCod;}
public Integer getNdoCod(){return NdoCod;}
public Integer getCntCod(){return CntCod;}
public Integer getUbiOriCod(){return UbiOriCod;}
public Integer getUbiDesCod(){return UbiDesCod;}
public Date getMomCre(){return MomCre;}
public Date getMomIni(){return MomIni;}
public Date getMomFin(){return MomFin;}
public Float getAncPas(){return AncPas;}
public String getMovHorPos(){return MovHorPos;}
public String getMovVer(){return MovVer;}

public void setAccCod(Integer AccCod){this.AccCod=AccCod;}
public void setAccColCod(Integer AccColCod){this.AccColCod=AccColCod;}
public void setAccEst(String AccEst){this.AccEst=AccEst;}
public void setAccPri(Integer AccPri){this.AccPri=AccPri;}
public void setAccRelCod(Integer AccRelCod){this.AccRelCod=AccRelCod;}
public void setAccTipTar(String AccTipTar){this.AccTipTar=AccTipTar;}
public void setArtCod(Integer ArtCod){this.ArtCod=ArtCod;}
public void setCanUni(Integer CanUni){this.CanUni=CanUni;}
public void setCntOriCod(Integer CntOriCod){this.CntOriCod=CntOriCod;}
public void setCntDesCod(Integer CntDesCod){this.CntDesCod=CntDesCod;}
public void setNdoCod(Integer NdoCod){this.NdoCod=NdoCod;}
public void setCntCod(Integer CntCod){this.CntCod=CntCod;}
public void setUbiOriCod(Integer UbiOriCod){this.UbiOriCod=UbiOriCod;}
public void setUbiDesCod(Integer UbiDesCod){this.UbiDesCod=UbiDesCod;}
public void setMomCre(Date MomCre){this.MomCre=MomCre;}
public void setMomIni(Date MomIni){this.MomIni=MomIni;}
public void setMomFin(Date MomFin){this.MomFin=MomFin;}
public void setAncPas(Float AncPas){this.AncPas=AncPas;}
public void setMovHorPos(String MovHorPos){this.MovHorPos=MovHorPos;}
public void setMovVer(String MovVer){this.MovVer=MovVer;}

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
