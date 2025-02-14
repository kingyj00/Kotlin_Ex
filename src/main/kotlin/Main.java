public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // 0으로 나누는 예외 발생
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) { // 예외 처리
            System.out.println("예외 발생: " + e.getMessage());
        } finally {
            System.out.println("이 코드는 항상 실행됩니다.");
        }
    }
}