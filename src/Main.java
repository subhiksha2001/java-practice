public class Main{
    public static void main(String args[]){
        Student s1 = new Student("Subhiksha", 24, "IT");
        Student s2 = new Student("Rajesh", 26, "ECE");
        Student s3 = new Student("Aishwarya", 30, "Civil");

        s1.displayInfo();
        
        System.out.println("Percentage: " + Utils.percentage(500, 435));


    }
}