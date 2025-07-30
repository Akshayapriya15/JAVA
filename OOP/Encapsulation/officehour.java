import java.nio.channels.NonWritableChannelException;
import java.time.LocalTime;
import java.util.function.ObjDoubleConsumer;

class office {
    private LocalTime openingtime;
    private LocalTime closingtime;

    public void setopening(LocalTime openingtime) {
        this.openingtime = openingtime;
    }

    public void setclosing(LocalTime closingtime) {
        if (openingtime != null && closingtime.isBefore(openingtime)) {
            System.out.println("closing time must after the closing time");
        } else {
            this.closingtime = closingtime;
        }
    }

    public LocalTime getopening() {
        return openingtime;
    }

    public LocalTime getclosing() {
        return closingtime;
    }

    public boolean isOpen(LocalTime now) {
        if (openingtime == null || closingtime == null) {
            return false;
        } else {
            return (!now.isBefore(openingtime) && !now.isAfter(closingtime));
        }
    }

    public void display() {
        System.out.println("Opening time :" + getopening());
         System.out.println("closing time :" + getclosing());
        }

}

public class officehour {
    public static void main(String[] args) {
        office obj = new office();
        obj.setopening(LocalTime.of(7, 30));
        obj.setclosing(LocalTime.of(16, 00));
        obj.display();
        if (obj.isOpen(LocalTime.now())) {
            System.out.println("Office is open now");
        } else {
            System.out.println("office is not opened");
        }



    }
}
