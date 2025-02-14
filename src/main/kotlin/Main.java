public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob");

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
    }
}

class Person {
    private String name;
    private int age;
    private String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Person(String name, int age) {
        this(name, age, "Unknown"); // 다른 생성자 호출
    }

    public Person(String name) {
        this(name, 0); // 기본값 제공
    }
}