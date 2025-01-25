class day8 {
    public static void main(String[] args) {
        // StringBuilder answer = new StringBuilder("Hi i am subhakar");
        // answer.append("credo sysytemz");
        // answer.insert(0, "credo systemz");
        // answer.replace(0, 2, "credo systemz");
        // answer.delete(0, 9);

        StringBuffer answer = new StringBuffer("Hello");
        // answer.reverse();
        answer.append("world");
        // answer.delete(0, 2);
        answer.replace(0, 5, "java");

        System.out.println(answer);
    }
}