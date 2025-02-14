class Person {
    private String name; // private 변수

    public Person(String name) { // 생성자
        this.name = name;
    }

    public String getName() { // Getter
        return name;
    }

    public void setName(String name) { // Setter
        this.name = name;
    }
}