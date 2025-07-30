import java.time.LocalDate;
public class Event {
    private String evenname;
    private LocalDate evendate;

    public Event(String evenname, LocalDate evendate) {
        this.evenname = evenname;
        setdetails(evendate);
    }

    public void setdetails(LocalDate evendate) {
        if (evendate.isBefore(LocalDate.now())) {
           System.out.println("past date is not allowed : " + evendate);
        } else {
               
            this.evendate = evendate;
            System.out.println("updated date : " + evendate);
        }
    }

    public String getName() {
        return evenname;
    }

    public LocalDate getdate() {

        return evendate;
    }
    public static void main(String[] args) {
        Event obj = new Event("akshaya party ",LocalDate.of(2026,11,15));
               System.out.println("event name : " + obj.getName());
               System.out.println("event date : " + obj.getdate());
               obj.setdetails( LocalDate.of(2027, 03, 16));
    }}

