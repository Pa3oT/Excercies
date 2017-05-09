package main.oop.polimorphism;

public class EarlyBinding {
    public static void main(String[] args) {
        CourseHelper bch = new BaseCourseHelper();
        Course course = bch.getCourse();
        //BaseCourse course1 = bch.getCourse();//ошибка компиляции
        System.out.println(bch.getCourse().id);
    }
}

class CourseHelper {
    public Course getCourse(){
        System.out.println("Course");
        return new Course();
    }
}
class BaseCourseHelper extends CourseHelper {
    public BaseCourse getCourse(){
        System.out.println("BaseCourse");
        return new BaseCourse();
    }
}
