public class day12b {

    static class Student {
        String name;
        int StudentId;
        double avg;// this variable is the student average
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Matt";
        s1.StudentId = 101;
        s1.avg = 72.5;

        Student s2 = new Student();
        s2.name = "John";
        s2.StudentId = 102;
        s2.avg = 65.0;

        System.err.println("Student 1:");
        System.out.println("Name: " + s1.name + "\nID: " + s1.StudentId + "\nAverage: " + s1.avg);
        
        System.err.println("\nStudent 2:");
        System.out.println("Name: " + s2.name+"\nID: "+s2.StudentId+"\nAverage: "+s2.avg);


    }

}
