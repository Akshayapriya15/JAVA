class Department {
  private  String Deptname;
  private Manager manager;

  public Department(String Deptname) {
      this.Deptname = Deptname;
  }

  public void setManager(Manager man) {
      this.manager = man;
      if (manager.getDepartment() != this) {
          manager.setDepartment(this);
      }
  }

  public Manager getManager() {
      return manager;
  }

  public String getDeptName() {
      return Deptname;
  }

  public void display() {
      System.out.println("Department name : " + Deptname);
      System.out.println("Manager name : " + manager.getName());
      System.out.println("salary: " + manager.getSalary());
      }
}

class Manager {
    private String name;
    private double salary;
    private Department department;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
        if (department.getManager() != this) {
            department.setManager(this);
        }
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
     public void display() {
         System.out.println("manager name : " + name);
      System.out.println("salary : " + salary);
      System.out.println("Department name : " + department.getDeptName());
      }
}

public class Bidepartment {
    public static void main(String[] args) {
        Department d1 = new Department("computersicne");
        Manager m1 = new Manager("aki", 75000.00);
        m1.setDepartment(d1);
        m1.display();
        d1.display();
    }
}
