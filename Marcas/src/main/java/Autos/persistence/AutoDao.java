package Autos.persistence;

import Autos.Entities.Auto;
import Autos.Entities.Marca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 07/06/2017.
 */
public class AutoDao extends AbstractDao<Auto> {

    List<Auto> lista;

    public AutoDao(){
        super();
        this.lista = new ArrayList<Auto>();
    }

    @Override
   public List<Auto> getAll() {
        return lista;
    }

    @Override
    public Auto getById(int id) {
        for(Auto a : this.lista){
            if (a.getId()== id){
                return a;
            }
            }
            return null;
        }



    }

    @Override
    void save(Auto a) {
    lista.add(a);

    }

    public Auto getByPatente(String patente){
        for (Auto a : this.lista) {
            if(a.getPatente().equals(patente)){
                return a;
            }
        }
        return null;
    }

    public List<Auto> getByMarca(Marca marca){
        List<Auto> listado = new ArrayList<Auto>();
        for (Auto a : this.lista) {
            if(a.getMarca().equals(marca)){
                listado.add(a);
            }
        }
        return listado;
    }






}
