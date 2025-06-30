public class titlestringbuilder {
    public static void main(String[] args) {
        String str = "java is powerful";
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1))
                    .append(" ");
        }
        System.out.println(sb.toString());
    }
}
