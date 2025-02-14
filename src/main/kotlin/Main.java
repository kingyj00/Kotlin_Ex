class Main {
    String name;
    int age;

    public Main setName(String name) {
        this.name = name;
        return this;
    }

    public Main setAge(int age) {
        this.age = age;
        return this;
    }

    public void printInfo() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Main Main = new Main()
                .setName("Alice")
                .setAge(30);
        Main.printInfo();
    }
}