package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import model.Conversor;
import services.ConversorS;

@Named(value = "calculadoraC")
@SessionScoped
public class ConversorC implements Serializable {

    private Conversor modelo;
    private ConversorS servicio;
    
    public ConversorC() {
        modelo = new Conversor();
        servicio = new ConversorS();
    }

    public void calcular(){
        servicio.calcular(modelo.getDecimal());
        modelo.setBinario(ConversorS.Binario);
    } 
    
    public void limpiar(){
        modelo = new Conversor();
        
    }
    
    // Getter y Setter
    public Conversor getModelo() {
        return modelo;
    }

    public void setModelo(Conversor modelo) {
        this.modelo = modelo;
    }

    public ConversorS getServicio() {
        return servicio;
    }

    public void setServicio(ConversorS servicio) {
        this.servicio = servicio;
    }
    
    
    
    
}
