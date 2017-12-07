package java_04_java语言程序设计.第七章_一维数组;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class text3_线性查找二分查找 {
    //线性查找
    public static int linerSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) return i;
        }
        return -1;
    }

    //二分查找
    public static int binarySearch(int[] list, int key) {
        int low = 0, high = list.length - 1;
        int mid;
        while (high >= low) {
            //找到中间那个数
            mid = (high + low) / 2;
            //如果关键值小于mid，说明在中间左边
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
                //关键字大于mid，说明在中间右边
            else low = mid + 1;

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        //int key = linerSearch(list, 5);
        int key=binarySearch(list,5);
        System.out.print(key);
    }
}
