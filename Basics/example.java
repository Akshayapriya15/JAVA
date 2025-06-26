public class example {
  public static void main(String[] args) {
    // int arr[] = { 2, 5, 6, 1, 3 };
    // Arrays.sort(arr);
    //for (int n : arr) {
    // System.out.print(n);
    //}
    //String a = "Aki";
    //a= "meow";
    // String b = "aki";
    //String a = new String("aki");  
    //String b = new String("b");
    // a.toLowerCase();

    //System.out.println(a);
    //System.out.println(b);
    //System.out.println(a);
    //int arr1[] = { 1, 2, 3 };
   // int arr2[] = { 1, 2, 3 };
   // System.out.println(arr1 == arr2);
    int a[] = { 1, 2, 3 };
    int[] b = a;
    a[2] = 2; // here i am changing the value a   and the value of b is also change
    for (int n : a) {
      System.out.println(n);
    }
    System.out.println(a == b);
  
    String c = "aki";
    String d = c; //here i am creating new object for c as aki reddy but the value of d remains same ,d  value is aki because d is point to same aki only 
    c = c + "reddy";
    System.out.println(c);
    System.out.println(d);


    String ch = "abc";
    int he = 0;
    for (int i = 0; i < ch.length(); i++) {
      he = he + ch.charAt(i);
    }
    System.out.println(he);
  }
  

}
