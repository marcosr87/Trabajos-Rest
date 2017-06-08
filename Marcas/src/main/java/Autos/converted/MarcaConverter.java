package Autos.converted;

import Autos.Entities.Marca;
import Autos.response.MarcaWrapped;

/**
 * Created by alumno on 05/06/2017.
 */
public class MarcaConverter {
    public MarcaWrapped convert (Marca marca)
    {
        MarcaWrapped m = new MarcaWrapped();
        m.setDescripcion(marca.getDescripcion());
        m.setPais(marca.getPais());
        m.setId(marca.getId());
        return  m;
    }
}
