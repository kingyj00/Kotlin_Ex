class Person {
private String name = ""; // 실제 저장되는 필드

public Person(String name) {
    this.name = name;
}

public String getName() { // Getter (""일 경우 예외 발생)
    if (name.isEmpty()) {
        throw new IllegalStateException("이름이 설정되지 않았습니다.");
    }

    return name;
}

public void setName(String name) { // Setter ("" 방지)
    if (name.isEmpty()) {
        throw new IllegalArgumentException("이름은 비어 있을 수 없습니다.");
    }

    this.name = name;
}
}