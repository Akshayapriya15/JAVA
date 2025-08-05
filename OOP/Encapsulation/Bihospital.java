class Doctor {
    private String docname;
    private Patient patient;

    public Doctor(String docname) {
        this.docname = docname;
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

    public String toString() {
        return (" doctor name : " + docname + " /Patient name : " + patient.getName());
    }
}

class Patient {
    private String patname;
    private Doctor doctor;
    private Room room;

    public Patient(String patname) {
        this.patname = patname;
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

    public void setRoom(Room room) {
        this.room = room;
        if (room.getPatient() != this) {
            room.setPatient(this);
        }
    }

    public Room getRoom() {
        return room;
    }

    public String getName() {
        return patname;
    }

    public String toString() {
        return ("patient name : " + patname + " /Patientdoctor : " + doctor.getName() + " /patient room : " + room.getId());
    }
}

class Room {
    private String roomid;
    private Patient patient;

    public Room(String roomid) {
        this.roomid = roomid;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
        if (patient.getRoom() != this) {
            patient.setRoom(this);
        }
    }

    public Patient getPatient() {
        return patient;
    }

    public String getId() {
        return roomid;
    }

    public String toString() {
        return ("Room id : " + roomid + " /patient name : " + patient.getName());
    }
    
}

public class Bihospital {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("aki");
        Patient p1 = new Patient("pooja");
        Room r1 = new Room("101");
        d1.setPatient(p1);
        r1.setPatient(p1);
        System.out.println(d1);
        System.out.println();
        System.out.println(p1);
        System.out.println();
        System.out.println(r1);
        System.out.println();
        
    }
}
