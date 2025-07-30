import java.time.LocalTime;
public class Alaram {
    private String message;
    private LocalTime time;

    public void settime(LocalTime time) {
        if (time.isBefore(LocalTime.now())) {
            System.out.println("Past time not applicable");
        } 
            this.time = time;
        
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public String getmessage() {
        return message;
    }

    public LocalTime gettime() {
        return time;
    }

    
    public static void main(String[] args) {
        Alaram obj = new Alaram();
        obj.settime(LocalTime.of(3, 30));
        obj.setmessage("wake up time up for school !");
        System.out.println("The display message : "+ obj.getmessage());
        System.out.println(" time : " +obj.gettime());
    }
}

