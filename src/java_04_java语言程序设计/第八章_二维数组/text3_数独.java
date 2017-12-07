package java_04_java语言程序设计.第八章_二维数组;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/27 0027.
 */
public class text3_数独 {
    public static void main(String[] args){
        int [][]grid=readASolution();
        System.out.println(isValid(grid)?"Valid solution":"Invalid solution");
    }

    private static int[][] readASolution() {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入结果：");
        int [][]grid=new int[9][9];
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                grid[i][j]=input.nextInt();
        return grid;
    }

    private static boolean isValid(int [][]grid){
        //判断每一个数字是不是符合规则
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                if(grid[i][j]<1||grid[i][j]>9||!isValid(i,j,grid))
                    return false;
        return true;

    }

    //验证i行j列的数字，在该行是不是唯一的，在该列是不是唯一的，在3*3的方格中是不是唯一的
    private static boolean isValid(int i, int j, int[][] grid) {
        //验证在i行是不是唯一的
        for(int column=0;column<9;column++)
            if(column!=j&&grid[i][column]==grid[i][j])
                return false;
        //验证在j列是不是唯一
        for(int row=0;row<9;row++)
            if(row!=i&&grid[row][j]==grid[i][j])
                return false;

        //验证在3*3的格子里是不是唯一的
        for(int row=(i/3)*3;row<(i/3)*3+3;row++){
            for(int col=(j/3)*3;col<(j/3)*3+3;col++)
                if(row!=i&&col!=j&&grid[row][col]==grid[i][j])
                    return false;
        }

        return true;
    }


}
