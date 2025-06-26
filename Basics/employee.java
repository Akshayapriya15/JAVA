public class employee {
    String name;
    int id;
    double basicsalary;
    double n;

    double calculateHra() {
        n = basicsalary * 0.2;
        return n;
    }

    double calculateGrossSalary() {
        basicsalary = basicsalary + calculateHra();
        return basicsalary;
    }

    void display() {
        System.out.println(" name :" + name);
        System.out.println("id : " + id);
        System.out.println("basicsalary :" + basicsalary);
        System.out.println(" calculateHra :" + calculateHra());
        System.out.println("calculateGrossSalary :" + calculateGrossSalary());
    }
}
class demo{
    public static void main(String[] args) {
        employee emp = new employee();
        emp.name = " aki";
        emp.id = 1;
        emp.basicsalary = 30000.00;
        emp.display();
    }}

