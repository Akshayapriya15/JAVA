import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
class Meet {
    private String topic;
    private LocalDateTime MeetingDateTime;

    public Meet(String topic, LocalDateTime MeetingDateTime) {
        this.topic = topic;
        setMeetingDateTime(MeetingDateTime);
    }

   //  String getTopic(){
     //     return topic;
    //}

    public void setMeetingDateTime(LocalDateTime Meets) {
        if (Meets.isBefore(LocalDateTime.now())) {
            System.out.println("meeting date and time cannot be past");
            this.MeetingDateTime = null;
        } else {
            this.MeetingDateTime = Meets;
        }
    }

    public LocalDateTime getMeetingDateTime() {
        return MeetingDateTime;
    }

    public boolean upcoming() {
        LocalDateTime now = LocalDateTime.now();
        Duration d = Duration.between(now, MeetingDateTime);
        return d.toHours() < 24 && MeetingDateTime.isAfter(now);
    }

    public void display() {
          DateTimeFormatter timedate = DateTimeFormatter.ofPattern("dd-MM-yyyy  hh : mm a");//HH for like 20.01 hh is for like 7.01
          System.out.println("topic name : " + topic);
          if (MeetingDateTime != null) {
              System.out.println("meeting date and time : " + MeetingDateTime.format(timedate));
              System.out.println("upcoming : " + (upcoming() ? "yes" : "no"));
          } else {
              System.out.println("Invalid meeting timing");
          }
          

    }

}

public class meeting {
    public static void main(String[] args) {
        Meet obj = new Meet("developemnt", LocalDateTime.of(2025,11,15,10,30).plusHours(5));
        obj.display();
    }
}
