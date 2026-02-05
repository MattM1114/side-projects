
public class day12a {

    static class Person {
        String name;
        int age;
        String country;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Matt";
        p1.age = 25;
        p1.country = "South Africa";

        System.out.println("Name; "+p1.name);
        System.out.println("Age; "+p1.age);
        System.out.println("Country; " + p1.country);
    }
    


}
