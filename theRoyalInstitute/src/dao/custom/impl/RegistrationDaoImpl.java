package dao.custom.impl;

import dao.SuperDao;
import entity.SuperEntity;

import java.util.List;


public class RegistrationDaoImpl implements SuperDao {

    @Override
    public boolean save(SuperEntity entity) throws Exception {
        return false;
    }

    @Override
    public boolean update(SuperEntity entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object o) throws Exception {
        return false;
    }

    @Override
    public SuperEntity find(Object o) throws Exception {
        return null;
    }

    @Override
    public List FindAll() throws Exception {
        return null;
    }
}
