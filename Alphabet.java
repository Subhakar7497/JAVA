class Alphabet {
    public static void main(String[] args) {

        // declare a variable
        char c = '*';

        // checks if c is an alphabet
        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is an alphabet.");
        } else {
            System.out.println(c + " is not an alphabet.");
        }
    }
}