public class staticcollegename {
    static String collegename;
    String name;
    int rollno;
    public static void college(staticcollegename s){
        System.out.println(collegename + " : " + s.name + " : " + s.rollno);
    }

    public static void main(String[] args) {
        staticcollegename s1 = new staticcollegename();
        staticcollegename s2 = new staticcollegename();
        s1.name = "aki";
        s1.rollno = 12;
        s2.name = "akshaya";
        s2.rollno = 13;
        staticcollegename.collegename = "SA ENGINNERING COLLEGE";
        
        staticcollegename.college(s1);
        staticcollegename.college(s2);
        
    }
}
