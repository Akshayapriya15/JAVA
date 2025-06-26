class even3d {
    public static void main(String[] args) {
        int[][][] arr = {
            { {2,3,4},{5,6,7},{8,9,10}},
            {{11,12,13},{14,15,16},{17,18,19}}       
        };
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    if (arr[i][j][k] % 2 == 0) {
                        evencount++;
                    } else {
                        oddcount++;
                    }
                }
            }
        }
        System.out.println("The no of even is :" + evencount);
        System.out.println("the no of odd is : " + oddcount);
    }
}
