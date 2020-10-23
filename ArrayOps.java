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
  public static void main(String[] args){
    int[] a={4,53,8,2};
    //System.out.println(sum(a));
    System.out.println(largest(a));
  }
}
