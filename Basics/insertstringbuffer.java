public class insertstringbuffer {
    public static void main(String[] args) {
        String str = "Ijava";
        StringBuffer st = new StringBuffer(str);
        st.insert(1, " love ");
        System.out.println(st.toString());

    }
}
