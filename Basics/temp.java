public class temp {
    double fahrenhite;
    double celsius;

    public void setdetails(double fah, double cel) {
        fahrenhite = fah;
        celsius = cel;
    }
        public double fahtocel(){
            celsius = (fahrenhite - 32)*5/9;
            return celsius;
        }
        public  double celtofah(){
            
            return (celsius * 9 / 5) + 32;
            
        }
        public void display(){
            System.out.println(   fahrenhite +"fahrenhite to celsius :" + fahtocel());
              System.out.println(   celsius + "celsius to fahrenhite :" + celtofah());
        }
        public static void main(String[] args) {
            temp obj = new temp();
            obj.setdetails(98.6,37.0);
            obj.display();
        }}
    

