package Algorithms_Fourth_Edition.chapter_2;

import java.util.Arrays;

/**
 * @Author yang
 * @Description 希尔排序
 * @Date 2020/11/29 10:57 下午
 * @Param
 * @return
 **/
public class Shell {

    public static void sort(Comparable[] a) {
        int length = a.length;
        int h = 1;
        Comparable tmp;
        while (h < length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (a[j].compareTo(a[j - h]) < 0) {
                        tmp = a[j];
                        a[j] = a[j - h];
                        a[j - h] = tmp;
                    }
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{2, 6, 3, 5, 77, 11, 12, 18, 15};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
