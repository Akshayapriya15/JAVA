public class studenthelpher {
    static String schoolname;
    static double average;
    static int[] numbers;
    static {
        numbers = new int[] { 20, 90, 89, 79, 50 };
        schoolname = "leo matriculation";
        average = average();
    }

    public static double average() {
        for (int i = 0; i < numbers.length; i++) {
            average = average + numbers[i];
        }
         average =(average / numbers.length);
         return average;
}

    public void display() {
        System.out.println("school name : " + schoolname);
        for (int n : numbers) {
            System.out.println(n + " ");
        }

        System.out.println("average : " + average);

    }

    public static void main(String[] args) {
        studenthelpher obj1 = new studenthelpher();
        obj1.display();
        
    }

}
