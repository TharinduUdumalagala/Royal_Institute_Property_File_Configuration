package bo.custom.impl;

import bo.custom.CourseBo;
import dao.DaoFactory;
import dao.DoaTye;
import dao.custom.impl.CourseDaoImpl;
import dto.CourseDTO;
import entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseBoImpl implements CourseBo {

    CourseDaoImpl courseDao = DaoFactory.getInstance().getDao(DoaTye.COURSE);

    @Override
    public boolean saveCourse(CourseDTO courseDTO) throws Exception {
        Course course = new Course();

        course.setCode(courseDTO.getCode());
        course.setCourseName(courseDTO.getCourseName());
        course.setDuration(courseDTO.getDuration());
        course.setFee(courseDTO.getFee());

        boolean save = courseDao.save(course);
        return save;
    }

    @Override
    public boolean updateCourse(CourseDTO courseDTO) throws Exception {
        Course course = new Course();

        course.setCode(courseDTO.getCode());
        course.setCourseName(courseDTO.getCourseName());
        course.setDuration(courseDTO.getDuration());
        course.setFee(courseDTO.getFee());

        boolean update = courseDao.update(course);
        return update;
    }

    @Override
    public boolean deleteCourse(String code) throws Exception {
        boolean delete = courseDao.delete(code);
        return delete;
    }

    @Override
    public List<CourseDTO> getAllCourse() throws Exception {
        List<Course> all = courseDao.FindAll();
        ArrayList<CourseDTO> dtoList =new ArrayList<>();

        CourseDTO courseDTO = null;

        for (Course course : all){
            dtoList.add(new CourseDTO(
                    course.getCode(),
                    course.getCourseName(),
                    course.getDuration(),
                    course.getFee()
            ));
        }
        return dtoList;
    }
}
