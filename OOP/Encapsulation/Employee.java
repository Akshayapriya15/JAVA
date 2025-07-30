class Emp {
    private double salary;
    private String designation;

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary += salary;
        } else {
            System.out.println("negative value not allowed ");
        }
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void display() {
        System.out.println("salary : " + salary);
         System.out.println("designation : " + designation);

    }
}
public class Employee {
   public static void main(String[] args) {
       Emp obj = new Emp();
       obj.setSalary(3000.50);
       obj.setSalary(-2000);
       obj.setDesignation("software Engineering");
       obj.display();
   } 
}
