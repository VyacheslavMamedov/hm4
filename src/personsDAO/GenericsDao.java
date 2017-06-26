package personsDAO;

import java.util.Collection;

/**
 * Created by asus on 22.06.17.
 */
public interface GenericsDao<T, Id> {
    void getByIdPersons(Id id);
    void toSavePersons(T entity);
    void toUpadtePersons(T entity);
    void toDelete(Id id);
    Collection<T> getAllPersons();
}
