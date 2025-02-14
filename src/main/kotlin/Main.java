class Main {
    private static final Main INSTANCE = new Main();

    private Main() {}

    public static Main getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Main.getInstance().showMessage();
    }
}
