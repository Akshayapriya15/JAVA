class maxmin{
  public static int max(int[]arr){
   int max=arr[0];
  for(int i=1;i<arr.length;i++){
           
    if(arr[i]> max)
    {
     max=arr[i];
    }

    }return max;

}public static int min(int[]arr){
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
           
    if(arr[i]< min)
    {
     min=arr[i];
    }
    }return min;

}

}

public class staticmaxmin {
    public static void main(String[] args) {
    int[] a = {3,10,90,1};
    System.out.println("max : " +maxmin.max(a));
    System.out.println(" min : "+maxmin.min(a));

    }
}
