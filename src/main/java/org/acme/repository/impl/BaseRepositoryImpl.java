package org.acme.repository.impl;

import org.acme.entity.BaseEntity;
import org.acme.repository.BaseRepository;

import java.util.List;

public abstract class BaseRepositoryImpl<T extends BaseEntity> implements BaseRepository<T, Integer> {

    protected abstract Class<? extends BaseEntity> getTypeClass();

    protected abstract String getXmlFilePath();

    protected abstract String getXsdFilePath();

    @Override
    public List<T> readFromXml() {
        //to do
        return null;
    }

    @Override
    public T writeToXml(T obj) {
        //to do
        return null;
    }
}
