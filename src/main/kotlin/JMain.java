import java.util.Arrays;
import java.util.List;

public class JMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(name -> System.out.println("Hello, " + name));
    }
}