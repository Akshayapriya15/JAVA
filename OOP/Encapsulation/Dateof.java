import java.time.LocalDate;

class stud {
    private LocalDate DateofBirth;

    public void setDate(LocalDate Day) {
        if(Day.isBefore(LocalDate.now())){
       // if (Day.isBefore(LocalDate.of(2999, 05, 11))) {//Day.isBefore(LocalDate.now());
        DateofBirth = Day;
    } else {
        System.out.println("future date is not valid");
    }
}  

    public LocalDate getDate(){
        return DateofBirth;
    }
    }

  //  LocalDate today = LocalDate.now();
   


public class Dateof {
    public static void main(String[] args) {
        stud s1 = new stud();
        LocalDate n =  LocalDate.of(2000, 05, 11);
        s1.setDate(n);
        s1.setDate(LocalDate.of(3000, 05, 11));
        System.out.println("Date of birth : " + s1.getDate());
    }
}
