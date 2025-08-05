class Scientist {
    private String name;
    private String field;
    private Lab lab;

    public Scientist(String name, String field) {
        this.name = name;
        this.field = field;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
        if (lab.getScientist() != this) {
            lab.setScientist(this);
        }

    }

    public Lab getLab() {
        return lab;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("field : " + field);
        System.out.println("lab name : " + lab.getlabName());
     }
}

class Lab {
    private String labName;
    private Scientist scientist;

    public Lab(String labName) {
        this.labName = labName;
    }

    public void setScientist(Scientist scientist) {
        this.scientist = scientist;
        if (scientist.getLab() != this) {
            scientist.setLab(this);
        }
    }

    public Scientist getScientist() {
        return scientist;
    }

    public String getlabName() {
        return labName;
    }

    public void display() {
        System.out.println("lab name : " + labName);
        System.out.println("scientist name : " + scientist.getName());
        System.out.println("Scientist field : " + scientist.getField());
    }
}


public class Biscientist {
    public static void main(String[] args) {
        Lab l1 = new Lab("research institution");
        Scientist s1 = new Scientist("aki","chemist");
        l1.setScientist(s1);
        l1.display();
        s1.display();
        
    }
}
