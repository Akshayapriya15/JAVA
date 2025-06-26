public class email {
    public static void main(String[] args) {
        String email = "akshaya@gmail.com";
        String password = "akshaya@123";
        if(password.length()>=8 &&  password.contains("@")||password.contains("#")){
            System.out.println("strong");
        }else{
            System.out.println("weak");
        }
     }
}
