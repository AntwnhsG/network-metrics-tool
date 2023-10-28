package org.acme.service;

import java.util.List;

public interface BaseService<T, Integer>{

    List<T>  findAll();
    T create(T obj);
    void update(T obj);
    void delete(T obj);
}
