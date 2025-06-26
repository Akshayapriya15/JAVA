public class identity {
    public static void main(String[] args) {
        int[][] a = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
         int j =0;
           boolean  identity1 = false;
           for (int i = 0; i < a.length; i++) {
               if (a[i][j] != 1) {
                   identity1 = true;

               }
               j++;
          }
                for(int i =0; i < a.length;i++){
               for (int k = 0; k < a[0].length; k++)
               if (i != k && a[i][k] != 0) {
                 identity1 = true;
                }
        
            }
            if(identity1 == false){
               System.out.println("Identity matrix");
         }else{
                System.out.println("Not a identity matrix");
            }
                
             }
        }
    

