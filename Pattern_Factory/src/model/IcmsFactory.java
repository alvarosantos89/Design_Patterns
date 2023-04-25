package model;

public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorEstado(String nomeEstado) {
        if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
            return new IcmsMg();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
            return new IcmsSp();
        }else if (nomeEstado.equalsIgnoreCase("ICMS_RJ")){
            return new IcmsRj();
        }else if(nomeEstado.equalsIgnoreCase("ICMS_ES")){
            return new IcmsEs();
        }else{
            return null;
        }
    }
}
