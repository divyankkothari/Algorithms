package com.algorithms.example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]={1,32,451,-5,123,542,1334,201};
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(arr);

        System.out.println(arr[0]);
    }
}
