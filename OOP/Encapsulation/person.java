class persons {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setname(String n, int a) {
        name = n;
        age = a;
    }
   
}

public class person {
   public static void main(String[] args) {
       persons obj = new persons();
       obj.setname("aki", 1);
       System.out.println(obj.getName() + " : " + obj.getAge());

   } 
}
