/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias;

/**
 *
 * @author PC-21
 */
public class Licencias {
    private String nivel;
    private String edad;
    private String tiempo;
    private String licencia;
    /*private String fila;
    private String columna;
    private String nuevodato;*/

    public Licencias() {

    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getEdad() {
        return edad;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    /*public String getFila() {
        return fila;
    }
    public void setFila(String fila) {
        this.fila = fila;
    }
    public String getColumna() {
        return columna;
    }
    public void setColuma(String columna) {
        this.columna = columna;
    }
    public String getNuevodato() {
        return nuevodato;
    }
    public void setNuevodato(String nuevodato) {
        this.nuevodato = nuevodato;
    }*/

    public void setAll(String nivel,String edad, String tiempo,String licencia){
        this.nivel=nivel;
        this.edad=edad;
        this.tiempo=tiempo;
        this.licencia=licencia;
        /*this.fila=fila;
        this.columna=columna;
        this.nuevodato=nuevodato;*/
    }
}
