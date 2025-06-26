public class search2d {
    public static void main(String[] args) {
        int[][] arr = {
            {2,3,4},
            {19,8,25},
            {24,30,5}               
        };
        int target = 25;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j])
                    System.out.println("element " + target + " found at index : " + i + "," + j);
                break;
            }
        }
    }
}
