package Autos.Entities;

/**
 * Created by alumno on 05/06/2017.
 */
public class Auto {
    private String Modelo;
    private Marca Marca;
    private int Kilometros;
    private String Patente;
    private int año;
    static int id;

    public Auto(String modelo, Marca marca, int kilometros, String patente, int año) {
        this.Modelo = modelo;
        this.Marca = marca;
        this.Kilometros = kilometros;
        this.Patente = patente;
        this.año = año;
        id = id++;
    }


    public Autos.Entities.Marca getMarca() {
        return Marca;
    }

    public void setMarca(Autos.Entities.Marca marca) {
        Marca = marca;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Auto.id = id;
    }


    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }



    public int getKilometros() {
        return Kilometros;
    }

    public void setKilometros(int kilometros) {
        Kilometros = kilometros;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}

