public class day13a {
    static class Student {
        String name;
        int id;

        Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
        }

    }
    public static void main(String[] args) {
        Student s1 = new Student("Matt", 101);
        Student s2 = new Student("Alex", 102);
        
        s1.display();
        System.err.println("");
        s2.display();
    }




}