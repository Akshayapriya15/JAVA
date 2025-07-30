import java.util.Scanner;
class login {
    private String username;
    private String password;

    login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean setuser(String inputuser, String inputpassword) {
        return username.equals(inputuser) && password.equals(inputpassword);
    }

    public String getuser(){
        return username;
    }
}



public class securelogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        login s = new login("Akis", "Aki@2004");
        String user = sc.nextLine();
        String pass = sc.nextLine();
        boolean result = s.setuser(user, pass);
        System.out.println("success or fail : " + (result ? "success" : "failed"));
        

    }}

