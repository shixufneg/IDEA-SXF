package com.neuedu.rubblishRecycling.client;

public class test {

    public static void main(String[] args) {
     int arr[] = {2,1,3,6,10,9,7,8,5,4};
      test.bubble.bubble_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static class bubble{
        public static void bubble_sort(int[] arr) {
            int temp;
            for (int i = 0; i < arr.length - 1; i++)
                for (int j = 0; j < arr.length - 1 - i; j++)
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

