package sort;

import java.util.Arrays;

/**
 * @author wangfan
 * @Date 2018-07-30 14:33
 */
public class BubbleSort {

    public static void main(String[] args) {
        int array1[] = new int[]{25,13,63,45,22,11,43,32};
        System.out.println("排序前："+ Arrays.toString(array1));
        for(int i = 0;i < array1.length;i++){
            for(int j = 0;j<array1.length-1-i;j++){
                if(array1[j]>array1[j+1]){
                    int temp = array1[j+1];
                    array1[j+1] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        System.out.println("排序后："+ Arrays.toString(array1));
    }

}
