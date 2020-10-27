import java.util.Arrays;
public class Tester{

  public static void main(String[] args){
    int[] a={4,53,8,2};
    int[][] b={{2,6,4,3,5},{4,34,2}};
    System.out.println(ArrayOps.sum(a));//67
    System.out.println(ArrayOps.largest(a));//53
    System.out.println(Arrays.toString(ArrayOps.sumRows(b)));//[20,40]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(b)));//[6,34]

    System.out.println(ArrayOps.sum(b));//60

  int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
int[]  B  =   {  1, 3, 5 };

System.out.println(Arrays.toString(ArrayOps.sumRows(A))); //expected output: [12, 8, -14]

System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));//expected output: [12, 7, 2]

System.out.println( ArrayOps.sum(B)) ;//expected output:9

System.out.println( ArrayOps.sum(A));   //this calls the overloaded 2d array version! expected output:6

int[][]c=ArrayOps.transverse(b);
System.out.println(Arrays.toString(c[0])); //[[2,4],[6,34],[4,2],[3],[5]]
System.out.println(Arrays.deepToString(ArrayOps.transverse(b)));//[[2,4],[6,34],[4,2],[3,0],[5,0]]
System.out.println(Arrays.toString(ArrayOps.sumCols(b)));//[6,40,6,3,5]


int[][] d={ {  1,  2, 3, 4 },
   {  2, 3,  4,  1 },
   { 3, 4,  1, 2 } };  //this is rowMagic but NOT colMagic

int[][] e=  { {  1,  1, 1 },
      {  2, 2, 2 },
      { 3,  3, 3 } };  //this is colMagic but NOT rowMagic

  int[][] f= { {  2,  2, 2 },
      {  2, 2, 2 } };  //this is both colMagic AND rowMagic
System.out.println(ArrayOps.isRowMagic(d));//true
System.out.println(ArrayOps.isColMagic(d));//false
System.out.println(ArrayOps.isRowMagic(e));//false
System.out.println(ArrayOps.isColMagic(e));//true
System.out.println(ArrayOps.isRowMagic(f));//true
System.out.println(ArrayOps.isColMagic(f));//true
System.out.println(ArrayOps.isLocationMagic(f,0,0));//false
int[][]E = {
{  2,  4, 2 },
{  2, 2, 2 } };

System.out.println(ArrayOps.isLocationMagic(E, 0, 1)); //→ False  //  2 + 4 + 2  !=  4 + 2
System.out.println(ArrayOps.isLocationMagic(E, 1, 1)); //→  True  //   2 + 2 + 2 == 4 + 2
  }

}
