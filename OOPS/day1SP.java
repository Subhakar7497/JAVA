public class day1SP {
    // Static Method
    static void staticExample() {
        System.out.println("Static Method - Example");
    }

    // Public Method
    public void publicExample() {
        System.out.println("Public Method - Example");
    }

    public static void main(String[] args) {
        staticExample();

        // publicExample(); // error: non-static method publicExample() cannot be
        // referenced from a static context
        day1SP answer = new day1SP();
    }

}