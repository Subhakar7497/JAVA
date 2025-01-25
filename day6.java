// public class day6 {
//     static void checkAge(int age) {
//         if (age >= 18) {
//             System.out.println("Access Grand");
//         } else {
//             System.out.println("Access Denied");
//         }
//     }

//     public static void main(String[] args) {

//         checkAge(19);
//     }
// }

// 

public class day6 {
    static int add(int a, int b) {
        return a + b;
    }

    static double myadd(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int answer = add(10, 10);
        System.out.println(answer);
        double answer1 = myadd(10.5, 10.2);
        System.out.println(answer1);
    }
}