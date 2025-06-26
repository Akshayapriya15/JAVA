public class vowelc {
    public static void main(String[] args) {
        char ch = 'a';
       switch(ch){
       // case 'A':
         //System.out.println("vowels");
         //break;
        //case 'a':
         //System.out.println("vowels");
         //break;
        //case 'E':
         //System.out.println("vowels");
         //break;
        //case 'e':
         //System.out.println("vowels");
         //break;
        //case 'I':
        // System.out.println("vowels");
         //break;
        //case 'i':
         //System.out.println("vowels");
         //break;
        //case 'O':
        // System.out.println("vowels");
        // break;
        //case 'o':
        // System.out.println("vowels");
         //break;
        //case 'U':
         //System.out.println("vowels");
         //break;
        //case 'u':
         //System.out.println("vowels");
         //break;
        //default:
        //System.out.println("Consonants"); 
        case 'A':
        case 'a':
        case 'E':
        case 'e':
        case 'I':
        case 'O':
        case 'o':
        case 'U':
        case 'u':
            System.out.println("vowels");
            break;
        default:
         if(Character.isLetter(ch))
             System.out.println("consonants");
         else 
             System.out.println("default value");       
       }
    }
}
