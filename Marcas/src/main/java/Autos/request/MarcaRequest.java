package Autos.request;

import Autos.Entities.Marca;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * Created by alumno on 06/06/2017.
 */

public class MarcaRequest {


    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Marca.id = id;
    }

    @JsonProperty("descripcion")
    String descripcion;
    @JsonProperty("pais")
    String pais;
    @JsonProperty("id")
    int id;
}
