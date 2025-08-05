import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
class Patient {
  private String patname;
  private int age;
  private LocalDateTime appointmentDateTime;
  private Doctor doctor;

public Patient(String patname, int age, LocalDateTime appointmentDateTime){
    this.patname = patname;
    this.age = age;
    setAppointmentDateTime(appointmentDateTime);
  }

  public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
      if (appointmentDateTime.isAfter(LocalDateTime.now())) {
          this.appointmentDateTime = appointmentDateTime;
      } else {
          this.appointmentDateTime = null;
      }
  }

  public void setDoctor(Doctor doctor) {
      this.doctor = doctor;
      if (doctor.getPatient() != this) {
          doctor.setPatient(this);
      }

  }

  public Doctor getDoctor() {
      return doctor;
  }

  public String getName() {

      return patname;
  }

  public int getAge() {
      return age;
  }

public void display(){
    DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd-MM-yyyy  hh:mm a");
    System.out.println("patient name : "+ patname);
    System.out.println("patient age : "+ age);
    System.out.println("Doctor name : "+doctor.getName() );
    System.out.println("Doctor specification : " + doctor.getSpecification());
    if (appointmentDateTime != null) {
        System.out.println("appointment date and time : " + appointmentDateTime.format(datetimeformat));
        LocalDateTime now = LocalDateTime.now();
        Duration dates = Duration.between( now,appointmentDateTime);
        long hours = dates.toHours();
       long minutes = dates.toMinutes()  % 60;
       System.out.println("time left : " + hours + "h " +  minutes +"  m");
               // System.out.println("time left : " +dates.toHours());
    } else {
        System.out.println("appointment date  cannot be past ");
    }
  }
}
class Doctor {
    private String docname;
    private String specification;
    private Patient patient;

    public Doctor(String docname, String specification) {
        this.docname = docname;
        this.specification = specification;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
        if (patient.getDoctor() != this) {
            patient.setDoctor(this);
        }
    }

    public Patient getPatient() {
        return patient;
    }

    public String getName() {
        return docname;
    }

    public String getSpecification() {
        return specification;
    }

    public String toString(){
        return ("doctor name :  " + docname + "   ,specification : " + specification + " ,patient name : "+ patient.getName() + "   ,patient detail : age -" + patient.getAge());
    }
}
public class BiMini {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("shreya", "dermotologist");
        Patient p1 = new Patient("aki", 20,LocalDateTime.now().plusHours(3));
        d1.setPatient(p1);
        p1.display();
        System.out.println("------------------------------------------------------------------------");
        System.out.println(d1);
    }
}
