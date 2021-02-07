package test2;//二分法查找，折半查找


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a ={20,5,60,33,90,85,76,69,92,6};
        Arrays.sort(a);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println(find(a,60));

    }


    public static int find(int[] a,int value) {
        //找到数组最大值，最小值的下标
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            //获得数组中间位置
            int mid = (low + high) / 2;
            //查找的值和中间位置的值相等，则返回下标
            if (value == a[mid]) {
                return mid;
            }
            //查找的值大于中间值，则设置比中间位置大1的位置为最小值
            if (value > a[mid]){
                low = high +1;
            }
            //查找的值小于中间值，则设置比中间位置小1的位置为最大值
            if (value < a[mid]){
                high = mid-1;
            }
        }
        return -1;              //数组不存在该值，则返回-1
    }
}
