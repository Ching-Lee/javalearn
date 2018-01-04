package java_04_java语言程序设计.第22章_算法时间复杂度;


import org.junit.Test;

/**
 * Created by Administrator on 2017/12/1 0001.
 */
public class text1_回溯法解决八皇后问题 {
    private static final int SIZE=8;
    //用queens数组来存每一行放置的位置
    int []queens={-1,-1,-1,-1,-1,-1,-1,-1};

    //回溯算法
    private  boolean search() {
        int row=0;
        while (row>=0&&row<SIZE){
            //找到第i行放置的位置
            int k=findPosition(row);
            //说明没有找到位置，要回溯到上一行
            if(k==-1){
                //在回溯上一行之前，要将当前行的值恢复初始值-1，重新找
                queens[row]=-1;
                row--;
            }
            else{
               queens[row]=k;
               row++;
            }

        }
        //如果放置一遍,回溯到第一行，并且第一行也没找到,i--就变成1了
        if(row==-1)
            return false;
        else
            return true;

    }

    private int findPosition(int row) {
        //每次放置的位置，从上次位置的下一个开始
        int start=queens[row]+1;
        for(int col=start;col<SIZE;col++) {
            //判断row行，col列的位置是否可行
            if (isvalid(row, col))
                return col;
        }
        return -1;
    }

    private boolean isvalid(int row, int col) {
        //判断前面的每一行的queen[row-i]和col是否相等，相等表示在同一列
        //判断前面的每一行的queen[row-i]和col-i是否相等，相等表示在左对角线
        //判断前面的每一行的queen[row-i]和col+i是否相等，相等表示在右对角线
       for(int i=1;i<=row;i++){
           if(queens[row-i]==col||queens[row-i]==col-i||queens[row-i]==col+i)
               return false;
       }
       return true;

    }


    @Test
    public void test(){
        if(search())
            for (int i:queens)
                System.out.print(i+" ");
        else
            System.out.print("没找到");
    }

}























































