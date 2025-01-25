public class day1 {
    String Name = "Subhakar";
    int Age = 20;
    String Role = "L&D";
    double Salary = 40000;

    public static void main(String args[]) {
        day1 answer = new day1();
        System.out.println(answer.Name);
        System.out.println(answer.Age);
        System.out.println(answer.Role);
        System.out.println(answer.Salary);

        // Multiple Objects & Modify Attributes

        day1 answer1 = new day1();
        System.out.println(answer1.Name);
        answer1.Name = "Subha";
        System.out.println(answer1.Name);
    }
}