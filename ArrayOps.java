import java.util.Arrays;
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

public static int[] largestInRows(int[][] arr){
  int[] out = new int[arr.length];
  for (int i=0;i<arr.length;i++){
    out[i]=largest(arr[i]);
  }
  return out;
}

public static int sum(int[][] arr){
  return sum(sumRows(arr));
}

public static int[][] transverse(int[][] arr){
  int maxcol=0;
  for(int i=0; i<arr.length;i++){
    maxcol = Math.max(maxcol,arr[i].length);
  }
  int[][] trans= new int[maxcol][arr.length];
  for (int row=0; row<arr.length;row++){
    for(int col=0;col<arr[row].length;col++){
      trans[col][row]=arr[row][col];
    }
  }
//  System.out.println(Arrays.toString(trans[0]));
  return trans;
}

public static int[] sumCols(int[][] arr){
  return sumRows(transverse(arr));
}

public static boolean isRowMagic(int[][] arr){
  int[] rowSum = sumRows(arr);
  for(int i=1;i<rowSum.length;i++){
    if(rowSum[i-1]!=rowSum[i]){
      return false;
    }
  }
  return true;
}

  public static void main(String[] args){
    int[] a={4,53,8,2};
    int[][] b={{2,6,4,3,5},{4,34,2}};
    //System.out.println(sum(a));
    //System.out.println(largest(a));
    /*
    int[] out=sumRows(b);
    int[] out1=largestInRows(b);
    for (int i=0;i<out.length ; i++) {
    System.out.println(out1[i]);
  }

  //    System.out.println(sum(b));

  int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
int[]  B  =   {  1, 3, 5 };

System.out.println(Arrays.toString(ArrayOps.sumRows(A))); //expected output: [12, 8, -14]

System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));//expected output: [12, 7, 2]

System.out.println( ArrayOps.sum(B)) ;//expected output:9

System.out.println( ArrayOps.sum(A));   //this calls the overloaded 2d array version! expected output:6

int[][]c=transverse(b);
System.out.println(Arrays.toString(c[0]));
System.out.println(Arrays.deepToString(transverse(b)));
*/
//System.out.println(Arrays.toString(sumCols(b)));

int[][] d={ {  1,  2, 3, 4 },
   {  2, 3,  4,  1 },
   { 3, 4,  1, 2 } };  //this is rowMagic but NOT colMagic
System.out.println(isRowMagic(d));
}
}
