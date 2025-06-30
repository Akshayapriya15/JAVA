class reversestringbuilder {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder b = new StringBuilder(str);
        b.reverse();
        System.out.println(b.toString());
    }
}