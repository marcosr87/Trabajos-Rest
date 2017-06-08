package Autos.converted;

import Autos.Entities.Auto;
import Autos.response.AutoWrapped;

/**
 * Created by alumno on 05/06/2017.
 */
public class AutoConverter {
    public AutoConverter() {
    }
    public AutoWrapped convert (Auto auto)
        {
            AutoWrapped a = new AutoWrapped();
            a.setMarca(auto.getMarca());
            a.setAnio(auto.getAño());
            a.setKilometros(auto.getKilometros());
            a.setPatente(auto.getPatente());
            a.setId(auto.getId());
            return a;
        }
}
