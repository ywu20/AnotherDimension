public class ArrayOps{

  public static int sum(int[] arr){
    int sum=0;
    for (int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr){
    int largest=arr[0];
    for(int i=1;i<arr.length;i++){
      largest=Math.max(largest, arr[i]);
    }
    return largest;
  }

  public static int[] sumRows(int[][] arr){
    int[] out = new int[arr.length];
    for (int i=0;i<arr.length;i++){
      out[i]=sum(arr[i]);
    }
    return out;
  }

  public static void main(String[] args){
    int[] a={4,53,8,2};
    int[][] b={{2,6,4,3,5},{4,34,2}};
    //System.out.println(sum(a));
    //System.out.println(largest(a));
    int[] out=sumRows(b);
    for (int i=0;i<out.length ; i++) {
    System.out.println(out[i]);
  }
}
}
