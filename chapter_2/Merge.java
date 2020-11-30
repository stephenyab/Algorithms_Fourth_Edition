package Algorithms_Fourth_Edition.chapter_2;

import java.util.Arrays;

/**
 * @Author yang
 * @Description 归并排序
 * @Date 2020/11/30 10:35 下午
 * @Param
 * @return
 **/
public class Merge {

    public static Comparable[] sort(Comparable[] a) {
        if (a.length < 2) {
            return a;
        }
        int mid = a.length / 2;
        Comparable[] left = Arrays.copyOfRange(a, 0, mid);
        Comparable[] right = Arrays.copyOfRange(a, mid, a.length);
        return merge(sort(left), sort(right));
    }

    public static Comparable[] merge(Comparable[] left, Comparable[] right) {
        Comparable[] result = new Comparable[left.length + left.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i].compareTo(right[j]) > 0) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{2, 6, 3, 5, 77, 11, 12, 18, 15};
        System.out.println(Arrays.toString(Merge.sort(a)));
    }

}
