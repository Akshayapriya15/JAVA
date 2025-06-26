public class newgrade {
    public static void main(String[] args) {
        int mark = 1001;
        String result = switch(mark/100){
            case 9, 10 -> {
                if (mark <= 1000) {
                    yield "Grade A";
                } else {
                    yield "invalid mark";
                }
            }
            case 8 -> "Grade B";
            case 7 -> "Grade C";
            case 6 -> {
                if (mark < 60)
                 yield "fail";
                 
               else 
                yield "invalid makr";     
        }
        default -> "invalid mark";
    };
    System.out.println(result);
    }
}
