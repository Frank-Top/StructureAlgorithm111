package Demo1;

/**
 * @author cjb
 * @date 2020-12-25 11:41:19
 */
public class SparseArray {
    public static void main(String[] args){
        //创建一个原始的二维数组11*11
        //0：表示没有棋子 1：表示黑棋 2：表示蓝棋
     int chessArr[][] = new int[11][11];
     chessArr[1][2] = 1;
     chessArr[2][3] = 2;
     //输出原始的二维数组
        System.out.println("输出原始的二维数组:");
        for (int[] ints : chessArr) {
            for (int anInt : ints) {
                //没遍历一行就换行
                System.out.print(anInt+" ");
            }
            System.out.println();
        }

        //将二维数组 转 稀疏数组的思路
        //1、先遍历二维数组 得到非0的总和
        System.out.println("- - - - - - - - - -");
        int sum = 0;
        int[] a=new int[11];
        int[] b=new int[11];
        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j <11 ; j++) {
                 if (chessArr[i][j] != 0) {
                     sum++;
                 }
            }
        }
        System.out.println("sum:"+sum);

        //创建稀疏数组
        //存入
    }
}
