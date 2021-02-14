package bo;

import bo.custom.impl.CourseBoImpl;
import bo.custom.impl.StudentBoImpl;

public class BoFactory {
    private static BoFactory boFactory;

    public BoFactory(){

    }

    public static BoFactory getInstance(){
        return (null == boFactory) ? boFactory = new BoFactory() : boFactory;
    }
    public <T extends SuperBo> T getBO(BoType boType){
        switch (boType){
            case STUDENT:
                return (T) new StudentBoImpl();
            case COURSE:
                return (T) new CourseBoImpl();
            default:
                return null;
        }
    }
}
