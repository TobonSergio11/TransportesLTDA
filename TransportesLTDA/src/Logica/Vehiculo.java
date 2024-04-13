/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author sala104
 */
public class Vehiculo {
    
    private String Placa;
    private String nombre;
    private String conductor;
    private String ruta;
    private String marca;
    private String modelo;
    private String descripsion;

    public Vehiculo(String Placa, String nombre, String conductor, String ruta, String marca, String modelo, String descripsion) {
        this.Placa = Placa;
        this.nombre = nombre;
        this.conductor = conductor;
        this.ruta = ruta;
        this.marca = marca;
        this.modelo = modelo;
        this.descripsion = descripsion;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripsion() {
        return descripsion;
    }

    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }
   


    

}

