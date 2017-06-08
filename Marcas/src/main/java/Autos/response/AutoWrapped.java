package Autos.response;

/**
 * Created by alumno on 05/06/2017.
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import Autos.Entities.Marca;

public class AutoWrapped {
    @JsonProperty
    Marca marca;
    @JsonProperty
    String modelo;
    @JsonProperty
    int kilometros;
    @JsonProperty
    String patente;
    @JsonProperty
    int anio;
    @JsonProperty
    int id;



    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
