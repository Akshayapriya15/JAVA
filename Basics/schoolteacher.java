class teacher {
    String name;
    String subject;
    static String schoolname;

    public static void setails(String school) {
        schoolname = school;
    }

    public void setdetails(String names, String sub) {
        name = names;
        subject = sub;
    }

    public void display(){
        System.out.println("names :" + name);
        System.out.println("subject : "+ subject);
        System.out.println("schoolname :" + schoolname);
    }
}

    public class schoolteacher {
    public static void main(String[] args) {
        
    
    teacher[] tech = new teacher[3];
    for (int i = 0; i < 3; i++) {
        tech[i] = new teacher();
    }
    teacher.setails("Leo matriculation");
    tech[0].setdetails("aki" ,"java");
    tech[1].setdetails("akshaya","science");
    tech[2].setdetails("yuva","tamil");
    for (int i = 0; i < 3; i++) {
        tech[i].display();
    } //tech[1].display();


    
}
    }