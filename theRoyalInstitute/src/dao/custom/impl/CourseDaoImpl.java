package dao.custom.impl;

import dao.custom.CourseDao;
import entity.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;

public class CourseDaoImpl implements CourseDao {
    @Override
    public boolean save(Course entity) throws Exception {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Course entity) throws Exception {
        Session session =HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        Course course = session.get(Course.class, s);

        session.delete(course);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Course find(String s) throws Exception {
        return null;
    }

    @Override
    public List<Course> FindAll() throws Exception {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        List<Course> list = null;
        Query course = session.createQuery("from Course");
        list = course.getResultList();

        transaction.commit();
        session.close();
        return list;
    }
}
