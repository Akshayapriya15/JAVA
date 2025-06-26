public class averagemethod {
    String name;
    int rollno;
    int marks;

    public void display() {
        System.out.println("name : " + name);
        System.out.println("rollno : " + rollno);
        System.out.println("marks : " + marks);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        averagemethod h1 = new averagemethod();
        h1.name = "aki";
        h1.rollno = 1;
        h1.marks = 90;
        averagemethod h2 = new averagemethod();
        h2.name = "jeevi";
        h2.rollno = 2;
        h2.marks = 70;
        averagemethod h3 = new averagemethod();
        h3.name = "vishva";
        h3.rollno = 3;
        h3.marks = 89;
        averagemethod avg[] = new averagemethod[3];
        avg[0] = h1;
        avg[1] = h2;
        avg[2] = h3;
        for (int i = 0; i < avg.length; i++) {
            avg[i].display();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < avg.length; i++) {
            sum = sum + avg[i].marks;
            count++;
        }
        double m = (int) (sum / count);
        System.out.println("the average sum is :" + m);
}
}
