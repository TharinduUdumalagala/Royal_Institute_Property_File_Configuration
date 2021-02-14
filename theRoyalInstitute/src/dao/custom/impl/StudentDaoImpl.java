package dao.custom.impl;

import dao.custom.StudentDao;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public boolean save(Student entity) throws Exception {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Student entity) throws Exception {
        Session session = HibernateUtil.getInstance().openSession();

        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, s);

        session.delete(student);

        transaction.commit();
        session.close();
        return true;    }

    @Override
    public Student find(String s) throws Exception {
        return null;
    }

    @Override
    public List<Student> FindAll() throws Exception {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        List<Student> list = null;

        Query students = session.createQuery("from Student ");
        list = students.getResultList();

        transaction.commit();

        session.close();
        return list;
    }
}
