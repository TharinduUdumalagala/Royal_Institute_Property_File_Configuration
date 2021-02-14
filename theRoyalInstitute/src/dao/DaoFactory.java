package dao;

import dao.custom.impl.CourseDaoImpl;
import dao.custom.impl.RegistrationDaoImpl;
import dao.custom.impl.StudentDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    public static DaoFactory getInstance(){
        return (null == daoFactory) ? daoFactory = new DaoFactory() : daoFactory;
    }

    public <T extends SuperDao> T getDao(DoaTye doaTye){
        switch (doaTye){
            case COURSE:
                return (T) new CourseDaoImpl();
            case STUDENT:
                return (T) new StudentDaoImpl();
            case REGISTRATION:
                return (T) new RegistrationDaoImpl();
            default:
                return null;
        }
    }

}
