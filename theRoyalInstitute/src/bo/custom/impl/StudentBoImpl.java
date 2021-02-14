package bo.custom.impl;

import bo.custom.StudentBo;
import dao.DaoFactory;
import dao.DoaTye;
import dao.custom.impl.RegistrationDaoImpl;
import dao.custom.impl.StudentDaoImpl;
import dto.StudentDTO;
import entity.Registration;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class StudentBoImpl implements StudentBo {

    StudentDaoImpl studentDao = DaoFactory.getInstance().getDao(DoaTye.STUDENT);
    RegistrationDaoImpl registrationDao = DaoFactory.getInstance().getDao(DoaTye.REGISTRATION);

    @Override
    public boolean saveStudent(StudentDTO studentDTO) throws Exception {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student(
                studentDTO.getId(),
                studentDTO.getName(),
                studentDTO.getAddress(),
                studentDTO.getContact(),
                studentDTO.getBod(),
                studentDTO.getGender());

        boolean save = studentDao.save(student);

        if(save){
            Registration registration = new Registration(

            );
        }
        return false;
    }

    @Override
    public boolean updateStudent(StudentDTO studentDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteStudent(String id) throws Exception {
        return false;
    }

    @Override
    public List<StudentDTO> getAllStudent() throws Exception {
        return null;
    }
}
