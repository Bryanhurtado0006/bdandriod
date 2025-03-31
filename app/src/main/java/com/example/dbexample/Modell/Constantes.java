package com.example.dbexample.Modell;

public class Constantes {

    public static String NAME_DB="pruebabd";
    public static int NAME_VERSION=2;
    public static String SENTENCIACIUDAD = "Create table Ciudad (cod integer, nombre text )";
    public static String SENTENCIASDATOS = "Create table DATOS (cod integer, cod_CUIDAD integer, nombre text, apellido text)";
    public static String SENTENCIAREGISTRADURIA  = "Create table REGISTRADURIA (cod integer serial, numero_documento integer, fecha_nacimiento string, fecha_de_expedicion string )";

}
