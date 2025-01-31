public class salarycal {
    public static void main(String[] args) {
        float yearlysalary = 1000000;
        float monthlysalary = yearlysalary / 12;
        float weeklysalary = monthlysalary / 4;
        float dailysalary = weeklysalary / 7;
        float hourlysalary = dailysalary / 24;
        System.out.println("The monthly salary is :" + monthlysalary);
        System.out.println("The weekly salary is :" + weeklysalary);
        System.out.println("The daily salary is  :" + dailysalary);
        System.out.println("The hourly salary is :" + hourlysalary);
    }
}
