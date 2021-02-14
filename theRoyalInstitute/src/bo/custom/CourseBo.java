package bo.custom;

import bo.SuperBo;
import dto.CourseDTO;

import java.util.List;

public interface CourseBo extends SuperBo {
    public boolean saveCourse(CourseDTO courseDTO) throws Exception;
    public boolean updateCourse(CourseDTO courseDTO) throws Exception;
    public boolean deleteCourse(String code) throws Exception;
    public List<CourseDTO> getAllCourse()throws Exception;
}
