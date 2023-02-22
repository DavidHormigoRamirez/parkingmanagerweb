package com.parkingmanager.parkingmanagerweb.core;
import java.util.List;
public interface CrudService<T,I> {
    public T getById(I id);
    public List<T> readAll();
}
