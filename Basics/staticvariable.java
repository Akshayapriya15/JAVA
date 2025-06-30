class demo {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);

    }

    public static void show1(demo b) {
        System.out.println(b.brand + ": " + b.price + " : " + name);
    }
}


public class staticvariable {
    public static void main(String[] args) {
        demo[] d = new demo[2];
        demo obj1 = new demo();
        d[0] = obj1;
        demo obj2 = new demo();
        d[1] = obj2;
        d[0].brand = "apple";
        d[0].price = 1900;
        d[0].name = "smartphone";
        d[1].brand = "samsung";
        d[1].price = 1700;
        d[1].name = "smartphone";
        d[0].name = " phone";
        for (demo s : d) {
            s.show();
        }
        demo.show1(d[0]);



    }}

