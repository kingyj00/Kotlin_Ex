class Example {
    private String value;

    public String getValue() {
        if (value == null) {
            value = "Hello, Lazy!";
        }
        return value;
    }

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.getValue()); // 최초 접근 시 초기화
        System.out.println(example.getValue()); // 이후 캐싱된 값 사용
    }
}