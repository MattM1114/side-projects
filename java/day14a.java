public class day14a {
    static class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age; // 1.2.
            } else {
                System.err.println("Invaild age!");
            }

        }

        public int getAge() {
            return age;

        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 25);
        System.out.println("Name: "+student1.getName());
        System.err.println("Age: " + student1.getAge());
        
        student1.setAge(-6);
        student1.setAge(26);

        System.out.println("Updated age: "+student1.getAge());
    }
}




