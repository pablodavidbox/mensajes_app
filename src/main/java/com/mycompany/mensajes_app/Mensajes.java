/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

/**
 *
 * @author Pablo David Schvager
 */
public class Mensajes {
    int id_mensajes;
    String mensajes;
    String autor_mensajes;
    String fecha_mensajes;

    public Mensajes(){
         
    }

    public Mensajes(String mensajes, String autor_mensajes, String fecha_mensajes) {
        this.mensajes = mensajes;
        this.autor_mensajes = autor_mensajes;
        this.fecha_mensajes = fecha_mensajes;
    }
    
    
    
    public int getId_mensajes() {
        return id_mensajes;
    }

    public void setId_mensajes(int id_mensajes) {
        this.id_mensajes = id_mensajes;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }

    public String getAutor_mensajes() {
        return autor_mensajes;
    }

    public void setAutor_mensajes(String autor_mensajes) {
        this.autor_mensajes = autor_mensajes;
    }

    public String getFecha_mensajes() {
        return fecha_mensajes;
    }

    public void setFecha_mensajes(String fecha_mensajes) {
        this.fecha_mensajes = fecha_mensajes;
    }
    
    
}
