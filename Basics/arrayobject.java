
 class product {
    String name;
    int rollno;
    int marks;

}

public class arrayobject {
    public static void main(String[] args) {
        product s1 = new product();
        s1.name = "akshaya";
        s1.rollno = 123;
        s1.marks = 90;
        product s2 = new product();
        s2.name = "aki";
        s2.rollno = 234;
        s2.marks = 90;
        product s3 = new product();
        s3.name = "yuva";
        s3.rollno = 456;
        s3.marks = 90;
        product prod[] = new product[3];
        prod[0] = s1;
        prod[1] = s2;
        prod[2] = s3;
       // for (int i = 0; i < prod.length; i++) {
       for(product  pro : prod){
            System.out.println(pro.name + ":" + pro.rollno + ": " + pro.marks);
        }
    }
    
 }