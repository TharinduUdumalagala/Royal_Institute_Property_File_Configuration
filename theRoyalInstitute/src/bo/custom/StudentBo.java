package bo.custom;

import bo.SuperBo;
import dto.StudentDTO;

import java.util.List;

public interface StudentBo extends SuperBo {
    public boolean saveStudent(StudentDTO studentDTO) throws Exception;
    public boolean updateStudent(StudentDTO studentDTO) throws Exception;
    public boolean deleteStudent(String id) throws Exception;
    public List<StudentDTO> getAllStudent()throws Exception;
}
