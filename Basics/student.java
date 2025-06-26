public class student {
   
        String names;
        int rollnos;
        int marks;

        public void stud(String name, int rollno, int mark) {
            this.names = name;
            this.rollnos = rollno;
            this.marks = mark;
        }

      
        

        public void displaydetail() {
            System.out.println("name:" + names);
            System.out.println("roll :" + rollnos);
            System.out.println("mark :" + marks);

        }

        public static void main(String[] args) {
            
            student obj = new student();
           obj.stud("aki", 1234, 90);
            obj.displaydetail();
    }
}
