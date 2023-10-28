package org.acme.repository;

import org.acme.entity.BaseEntity;

import java.util.List;

public interface BaseRepository<T extends BaseEntity, Integer> {

    List<T> readFromXml();
    T writeToXml(T obj);

//    T read(T node);

//    void update(T node);

//    void delete(T node);
}
