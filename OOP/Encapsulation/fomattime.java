import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class reserve {
    private String customername;
    private int reserveid;
    private LocalDate reservationDate;
    private LocalTime reservationTime;
    private static LocalTime openingtime = LocalTime.of(9,0);
    private static LocalTime closingtime = LocalTime.of(17, 0);

    public reserve(String customername, int reserveid, LocalDate reservationDate, LocalTime reservationTime) {
        this.customername = customername;
        this.reserveid = reserveid;
        setdate(reservationDate);
        settime(reservationTime);

    }

    public void setdate(LocalDate date) {
        if (date.isBefore(LocalDate.now())) {
            System.out.println("past date is not applicable : " + date);
            this.reservationDate = null;
        } else {
            this.reservationDate = date;
        }
    }

    public void settime(LocalTime time) {
        if (time.isBefore(openingtime) || time.isAfter(closingtime)) {
            System.out.println("Reservation time is between 7 AM to 5 PM ");
            this.reservationTime = null;
        } else {
            this.reservationTime = time;
        }
    }

    public void display() {
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("hh : mm a");
        System.out.println("customer name : " + customername);
        System.out.println("reservation id : " + reserveid);
        if (reservationDate != null) {
            System.out.println(" reservation date : " + reservationDate.format(dateformat));
        } else {
            System.out.println("reservation date :  Invalid ");
        }
        if (reservationTime != null) {
            System.out.println("reservation time : " + reservationTime.format(timeformat));
        } else {
             System.out.println("reservation time :  Invalid ");
        }
    }
}

public class fomattime {
    public static void main(String[] args) {
        reserve obj = new reserve("akshayapriya", 243, LocalDate.now(), LocalTime.now());
        obj.display();
    }
}
