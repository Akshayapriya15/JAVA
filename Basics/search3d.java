class search3d{
    public static void main(String[] args){
        int[][][] arr = {
            {{29,33,4},{22,34,44},{33,56,78}},
            {{3,4,5},{6,7,8},{9,10,11}}        
        };
        int target = 10;
        boolean find = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    if(arr[i][j][k] == target){
                        find = false;
                        
                        System.out.print("element found at layer : " + i + " row : "   + j + " col : " + k);
                        break;
                    }
                }
            }
        }
        if(find == true){
            System.out.println ("Not found");
        }

    }
}