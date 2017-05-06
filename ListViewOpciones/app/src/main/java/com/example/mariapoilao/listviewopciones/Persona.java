package com.example.mariapoilao.listviewopciones;

/**
 * Created by mariapoilao on 6/05/17.
 */

public class Persona {

    private String nombre;
    private String sexo;
    private String pasatiempos;

    public Persona(String nombre, String sexo, String pasatiempos) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.pasatiempos = pasatiempos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPasatiempos() {
        return pasatiempos;
    }

    public void setPasatiempos(String pasatiempos) {
        this.pasatiempos = pasatiempos;
    }
}
