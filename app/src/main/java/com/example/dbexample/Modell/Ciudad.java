package com.example.dbexample.Modell;

public class Ciudad {

    private int cod;
    private String  name;

    public Ciudad() {
    }


    public Ciudad(int cod, String name) {
        this.cod = cod;
        this.name = name;
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                '}';
    }
}
