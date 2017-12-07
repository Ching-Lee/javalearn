package java_04_java语言程序设计.第18章_递归;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class text5_二分查找 {
    public static void main(String[] args){
        double []list={1,4,5,6,7,7,8,9};
        System.out.print(binarySelect(list,6));
    }

    private static int binarySelect(double[] list, int number) {
        int low=0,high=list.length-1;
       return binarySelect(list,low,high,number);
    }

    private static int binarySelect(double[] list, int low, int high, int number) {
        if(low>high)
            return -1;
        int mid=(low+high)/2;
        if(list[mid]==number)
            return mid;
        else if(number<list[mid])
            return binarySelect(list,low,mid-1,number);
        else
            return binarySelect(list,mid+1,high,number);
    }

    /*private static int binarySelect(double[] list, int number) {
        int low=0,high=list.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(number==list[mid])
                return mid;
            else if (number<list[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }*/


}
