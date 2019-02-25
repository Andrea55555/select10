package com.company;

public class Main {

    public static void main(String[] args) {

        int min, temp;
        int[] numbers = {4, 7, 11, 2, 6};


        for (int index = 0; index < numbers.length - 1; index++) {

            min = index;

            for (int scan = index + 1; scan < numbers.length; scan++)

                if (numbers[scan] < numbers[min])

                    min = scan;

            temp = numbers[min];

            numbers[min] = numbers[index];

            numbers[index] = temp;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}



