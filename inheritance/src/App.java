public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("fursa");

        String[] skills = { "computer skills", "communication skills" };

        Employee Haya = new Employee("Haya", "IT", 100);
        Director Sara = new Director("sara", "hr", 360);
        Engineer nora = new Engineer("nora", "hr", 70, skills);
        Manager reem = new Manager("reem", "operation", 500, 70);
        SalesPerson ahmad = new SalesPerson("ahmad", "IT", 340, 50);

        System.out.println(Haya);
        System.out.println(Sara);
        System.out.println(nora);
        System.out.println(reem);
        System.out.println(ahmad);

    }
}
