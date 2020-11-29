package Algorithms_Fourth_Edition.chapter_2;

import java.util.Arrays;

/**
 * @Author yang
 * @Description 插入排序
 * @Date 2020/11/29 9:57 下午
 * @Param
 * @return
 **/
public class Insertion {

    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i; j > 0; j--) {
                if (a[j].compareTo(a[j - 1]) < 0) {
                    Comparable tmp = a[j];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{2, 6, 3, 5, 77, 11, 12, 18, 15};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
