package com.parkingmanager.parkingmanagerweb.core;
import java.util.List;
public interface CrudService<T,I> {
    public T getById(I id);
    public List<T> readAll();
    public void create(T entity);
    public void update(T entity);
    public void delete(I id);

}
