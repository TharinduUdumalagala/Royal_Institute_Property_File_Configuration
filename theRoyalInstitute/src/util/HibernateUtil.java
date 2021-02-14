package util;

import entity.Course;
import entity.Registration;
import entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;

public class HibernateUtil {
    private static SessionFactory sessionFactory= createSesstion();

    private static SessionFactory createSesstion() {
        StandardServiceRegistry stg=new StandardServiceRegistryBuilder().loadProperties("application.properties").build();
        Metadata meta = new MetadataSources(stg)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Registration.class)
                .addAnnotatedClass(Course.class)
                .getMetadataBuilder().build();
        return meta.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getInstance() {
        return sessionFactory;
    }
}
