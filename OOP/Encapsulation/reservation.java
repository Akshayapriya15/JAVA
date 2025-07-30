import java.time.LocalTime;
import java.time.LocalDate;

class reserve {
    private int reservationid;
    private String customername;
    private LocalTime openingtime;
    private LocalTime closingtime;
    private LocalDate reservedate;

    public reserve(int reservationid, String customername, LocalTime openingtime, LocalTime closingtime,
            LocalDate reservedate) {
        this.reservationid = reservationid;
        this.customername = customername;
        this.openingtime = openingtime;
        this.closingtime = setclosing(closingtime);
        this.reservedate = setDate(reservedate);
    }

    public LocalTime setclosing(LocalTime closingtime) {
        if (openingtime != null && closingtime.isAfter(openingtime)) {
            return closingtime;
        }
        System.out.println("closing time is past");
        return null;
    }

    public LocalDate setDate(LocalDate reservedate) {
        if (reservedate.isAfter(LocalDate.of(2025,07,11))) {
            return reservedate;
        }
        System.out.println("date is in the past");
        return null;
    }

    public boolean checktime(LocalTime now) {
        if (openingtime == null || closingtime == null) {
            return false;
        }
        return now.isAfter(openingtime) && now.isBefore(closingtime);
    }

    public boolean checkDate(LocalDate now) {
        if (reservedate == null) {
            return false;
        }
        return now.isAfter(reservedate) && now.isBefore(LocalDate.of(2026, 12, 19));

        }
    

    public void display() {
        System.out.println("reservation id : " + reservationid);
        System.out.println("customer name  : " + customername);
        System.out.println("opening time  : " + openingtime);
        System.out.println("closing time : " + closingtime);
        System.out.println("reservation date : " + reservedate);    
        
    }

}

public class reservation {
    public static void main(String[] args) {
        reserve obj = new reserve(2345,"akshayapriya",LocalTime.of(9,00),LocalTime.of(17,00),LocalDate.of(2025,07,17));
        obj.display();
        if (obj.checktime(LocalTime.now())) {
            System.out.println("reservation is open in this time : ");
        } else {
            System.out.println("reservation is closed in this time : " + LocalTime.now());
        }
        if (obj.checkDate(LocalDate.now())) {
            System.out.println("reservation is open now");
        } else {
            System.out.println("reservation is finised");
        }
    }
}
