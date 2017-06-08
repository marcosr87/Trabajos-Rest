package Autos.persistence;

import java.util.List;

/**
 * Created by alumno on 07/06/2017.
 */
public abstract class AbstractDao<K> {

    public AbstractDao() {
    }
    abstract List <K> getAll();
    abstract K getById(int id);
    abstract void save (K value);
}
