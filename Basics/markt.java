public class markt {
    public static void main(String[] args) {
        int mark = 40;
        String result;
        result = mark >= 90 ? "Grade A"
                : mark >= 80 ? "Grade B" : mark >= 70 ? "Grade C" : mark >= 60 ? "Grade D" : "Fail";
                System.out.println("The grade is:" +result);
    }
}
