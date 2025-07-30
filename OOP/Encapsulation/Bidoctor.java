class Patient {
    private String name;
    private String disease;
    private Doctor doctor;

    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    public void setDoctor(Doctor d) {
        this.doctor = d;
        if (doctor.getPatient() != this)
            doctor.setPatient(this);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public void display() {
        System.out.println("Patient name :" + name);
        System.out.println("disease :" + disease);
        if (doctor != null) {
            System.out.println("doctor name : " + doctor.getName());
            System.out.println("doctor spcialization: " + doctor.getSpecialization());
        } else {
            System.out.println("patient is not assign to doctor");
                }
    }
    
}
class Doctor{
    private String name;
    private String specialization;
    private Patient patient;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void setPatient(Patient p) {
        this.patient = p;
        if (patient.getDoctor() != null) {
            patient.setDoctor(this);
        }
    }

    public Patient getPatient() {
        return patient;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
  public void display() {
        System.out.println("Patient name :" + name);
        System.out.println("disease :" + specialization);
        if (patient != null) {
            System.out.println("doctor name : " + patient.getName());
            System.out.println("doctor spcialization: " + patient.getDisease());
        } else {
            System.out.println("doctor is not assign to patient");
                }
    }
    
}
public class Bidoctor {
    public static void main(String[] args) {
         Patient pat = new Patient("yuva","skindisease");
         Doctor doc = new Doctor("aki", "skindisease");
         pat.setDoctor(doc);
         pat.display();
         doc.display();
        
    }
}
