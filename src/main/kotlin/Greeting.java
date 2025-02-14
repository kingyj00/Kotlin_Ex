public class Greeting {
    public static void sayHello() {
        sayHello("Guest"); // 기본값 제공
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Alice");
    }
}