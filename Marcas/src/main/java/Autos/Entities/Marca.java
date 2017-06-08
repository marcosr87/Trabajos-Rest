package Autos.Entities;

/**
 * Created by alumno on 05/06/2017.
 */
public class Marca {
    private String Descripcion;
    private String Pais;
    static int id = 0;

    public Marca(String descripcion, String pais) {
        this.Descripcion = descripcion;
        this.Pais = pais;
        id = id++;

    }

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
}
