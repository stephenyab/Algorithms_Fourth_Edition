package Algorithms_Fourth_Edition.chapter_2;

import java.util.Arrays;

/**
 * @Author yang
 * @Description 选择排序
 * @Date 2020/11/29 9:31 下午
 * @Param
 * @return
 **/
public class Selection {

    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            Comparable tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{2, 6, 3, 5, 77, 11, 12, 18, 15};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
