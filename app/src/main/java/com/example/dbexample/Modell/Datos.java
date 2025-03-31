package com.example.dbexample.Modell;

public class Datos {
    private int cod_dato;
    private int codigo_citi;
    private String nombre_persona;
    private String apellido_persona;

    public Datos() {
    }

    public Datos(int cod_dato, int codigo_citi, String nombre_persona, String apellido_persona) {
        this.cod_dato = cod_dato;
        this.codigo_citi = codigo_citi;
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
    }

    public int getCod_dato() {
        return cod_dato;
    }

    public void setCod_dato(int cod_dato) {
        this.cod_dato = cod_dato;
    }

    public int getCodigo_citi() {
        return codigo_citi;
    }

    public void setCodigo_citi(int codigo_citi) {
        this.codigo_citi = codigo_citi;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getApellido_persona() {
        return apellido_persona;
    }

    public void setApellido_persona(String apellido_persona) {
        this.apellido_persona = apellido_persona;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "cod_dato=" + cod_dato +
                ", codigo_citi=" + codigo_citi +
                ", nombre_persona='" + nombre_persona + '\'' +
                ", apellido_persona='" + apellido_persona + '\'' +
                '}';
    }
}


