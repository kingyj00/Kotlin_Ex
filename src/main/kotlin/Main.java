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

    // 주 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 부 생성자
    public Person(String name) {
        this(name, 0); // 다른 생성자 호출
    }
}