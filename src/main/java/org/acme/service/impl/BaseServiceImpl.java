package org.acme.service.impl;

import org.acme.entity.BaseEntity;
import org.acme.repository.BaseRepository;
import org.acme.service.BaseService;

import java.util.List;

public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T, Integer> {

    protected abstract BaseRepository<T, Integer> getRepository();

    @Override
    public List<T> findAll() {
        return getRepository().readFromXml();
    }

    @Override
    public T create(T obj) {
        //to do
        //need to retrieve all nodes to check for validations
        return getRepository().writeToXml(obj);
    }

    @Override
    public void update(T obj) {
        //to do
        //need to retrieve all nodes to check for validations
    }

    @Override
    public void delete(T obj) {
        //to do
        //need to retrieve all nodes to check for validations
    }
}
