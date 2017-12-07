package java_04_java语言程序设计.第23章_排序;

import org.junit.jupiter.api.Test;

/**
 * Created by Administrator on 2017/12/5 0005.
 */
public class text6_选择排序 {
    public void selectSort(int []list){
        for(int i=0;i<list.length-1;i++){
            int min=list[i];
            int min_index=i;
            for(int j=i+1;j<list.length;j++){
                if(list[j]<min){
                    min=list[j];
                    min_index=j;
                }
            }
            if(min_index!=i){
                list[min_index]=list[i];
                list[i]=min;
            }

        }
    }

    @Test
    public void test(){
        int []list={2,3,2,5,6,1,-2,3,14,12};
        selectSort(list);
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");
    }
}
