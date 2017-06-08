package Autos.response;

/**
 * Created by alumno on 05/06/2017.
 */
import com.fasterxml.jackson.annotation.JsonProperty;


public class MarcaWrapped {
    @JsonProperty
    String descripcion;
    @JsonProperty
    String pais;
    @JsonProperty
    int id;



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
