package main.oop.polimorphism;

public class PolimorfTest {
    public static void main(String[] args) {
        Course objA = new BaseCourse();
        BaseCourse objB = new BaseCourse();
        System.out.println("objA: id=" + objA.id);
        System.out.println("objB: id=" + objB.id);
        Course objC = new Course();
    }
}

class Course {
    public int id = 71;
    static {
        System.out.println("Course static block");
    }
    public Course() {
        System.out.println("конструктор класса Course");
        id = getId();
        System.out.println(" id=" + id);
    }
    public int getId() {
        System.out.println("getId() класса Course");
        return id;
    }
}

class BaseCourse extends Course {
    public int id = 90;// так делать не следует!
    static {
        System.out.println("Base static block");
    }
    public BaseCourse() {
        System.out.println("конструктор класса BaseCourse");
        System.out.println(" id=" + getId());
    }
    public int getId() {
        System.out.println("getId() класса BaseCourse");
        return id;
    }
}