package dao;

import entity.SuperEntity;

import java.util.List;

public interface SuperDao <Entity extends SuperEntity,Id> {

    public boolean save(Entity entity) throws Exception;
    public boolean update(Entity entity) throws Exception;
    public boolean delete(Id id) throws Exception;
    public Entity find(Id id) throws Exception;
    public List<Entity> FindAll()throws Exception;

}
