

class Securelogin {
    private String username;
    private String password;

    public void setuser(String user, String pass) {
        if (user.length() > 3 && Character.isUpperCase(user.charAt(0)) && pass.contains("@") && pass.length() >= 8) {
            username = user;
            password = pass;

        }
    }
        public String getuser(){
          return username;
        }

        public boolean checkuser() {
            if (username.equals("Akis") && password.equals("Aki@2005")) {
                return true;
            } else {
                System.out.println("not verified");
                return false;
            }

        }

        public void display() {
            System.out.println("username : " + getuser());
            System.out.println("check username and password : " + checkuser());
        }
    }

public class Login {
    public static void main(String[] args) {
        Securelogin obj = new Securelogin();
         obj.setuser("Akis", "Aki@2005");
        obj.display();
    }
}
