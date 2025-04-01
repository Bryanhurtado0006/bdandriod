package com.example.dbexample.Modell;

public class Regis {
    private int codi_regis;
    private int documenti;
    private String fecha_naci;
    private String expedicion;

    public Regis(){}

    public Regis(int codi_regis, int documenti, String fecha_naci,String expedicion){
        this.codi_regis=codi_regis;
        this.documenti=documenti;
        this.fecha_naci=fecha_naci;
        this.expedicion=expedicion;
    }


    public int getCodi_regis() {
        return codi_regis;
    }

    public void setCodi_regis(int codi_regis) {
        this.codi_regis = codi_regis;
    }

    public int getDocumenti() {
        return documenti;
    }

    public void setDocumenti(int documenti) {
        this.documenti = documenti;
    }

    public String getFecha_naci() {
        return fecha_naci;
    }

    public void setFecha_naci(String fecha_naci) {
        this.fecha_naci = fecha_naci;
    }

    public String getExpedicion() {
        return expedicion;
    }

    public void setExpedicion(String expedicion) {
        this.expedicion = expedicion;
    }

    @Override
    public String toString() {
        return "Regis{" +
                "codi_regis=" + codi_regis +
                ", documenti=" + documenti +
                ", fecha_naci='" + fecha_naci + '\'' +
                ", expedicion='" + expedicion + '\'' +
                '}';
    }
}
