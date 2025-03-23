public class Student {
    String name;
    String course;
    int age;
    Student(String name, int age, String course){
        this.name = name;
        this.course = course;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Name: " +name);
        System.out.println("Course: " +course);
        System.out.println("Age: " +age);
        

    }
    // Overloaded displayInfo
    void displayInfo(String collegeName) {
    System.out.println("Student Name: " + name);
    System.out.println("College: " + collegeName);
    
    }

    
}
