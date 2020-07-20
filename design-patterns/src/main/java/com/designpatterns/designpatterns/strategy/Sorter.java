package com.designpatterns.designpatterns.strategy;

/**
 * Description
 * 通过自定义Comparator比较器，泛型的方式指定
 * Date 2020/7/20 20:09
 * Created by kwz
 */
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    //sort(int)
    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
