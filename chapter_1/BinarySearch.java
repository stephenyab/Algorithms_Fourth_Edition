package Algorithms_Fourth_Edition.chapter_1;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 7, 11, 16, 22, 26, 77};
        int key = 26;
        System.out.println("从数组：" + Arrays.toString(a) + " 中查找数字：" + key);
        System.out.println("位置：" + rank(key, a));
    }
}
