class patient {
    private String patientname;
    private String disease;
    private boolean iscritical;

    public void setdetails(String pat, String dis, boolean iscrit) {
        patientname = pat;
        disease = dis;
        iscritical = iscrit;
    }

    public String getname() {
        return patientname;
    }

    public String getdisease() {
        return disease;
    }

    public boolean getiscritical() {
        return iscritical;
    }

    public void iscriticalcheck(boolean status, boolean doctor) {
        if (doctor == true) {
            this.iscritical = status;
            System.out.println("status updated by the doctor");
        } else {
            System.out.println("unautherized only doctor is allowed");
        }

    }
}
public class Hospital {
    public static void main(String[] args) {
        patient s = new patient();
        s.setdetails("aki", "dengu", true);
        s.iscriticalcheck(false, true);
        
        boolean se = s.getiscritical();
        
        System.out.println("patientname : " + s.getname());
        System.out.println("disease : " + s.getdisease());
        System.out.println("critical : " + (se ? "yes" : "no"));
        s.iscriticalcheck(false,false);
    }
}
