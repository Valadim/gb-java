package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        changeOneToZero();
        fillArray();
        multipleArrayElement();
        squareMultipleArray();
        findMinMax();
    }

    static void changeOneToZero() {
/*
    1.  Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
*/
        int[] oneZeroArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < oneZeroArray.length; i++) {
            if (oneZeroArray[i] == 1) {
                oneZeroArray[i] = 0;
            } else if (oneZeroArray[i] == 0) {
                oneZeroArray[i] = 1;
            }
        }

        System.out.println(Arrays.toString(oneZeroArray));
    }

    static void fillArray() {
/*
    2. Задать пустой целочисленный массив размером 8.
       С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
*/
        int[] intArray = new int[8];

        for (int i = 0; i < 8; i++) {
            intArray[i] = i * 3;
        }

        System.out.println(Arrays.toString(intArray));
    }

    static void multipleArrayElement() {
/*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
       пройти по нему циклом, и числа меньшие 6 умножить на 2;
*/
        int[] intArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 6) {
                intArray[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(intArray));
    }

    static void squareMultipleArray() {
/*
    4. Создать квадратный двумерный целочисленный массив (количество строк
       и столбцов одинаковое), и с помощью цикла(-ов)
       заполнить его диагональные элементы единицами;  [i][j] [j][j] [j][i]
*/
        int arrayLength = 7;
        int crossLine = arrayLength - 1;
        int[][] multipleArray = new int[arrayLength][arrayLength];

        for (int i = 0; i < multipleArray.length; i++) {
            for (int j = 0; j < multipleArray.length; j++) {
                multipleArray[i][j] = 0;
                if (multipleArray[j][j] <= i) {
                    multipleArray[j][i] = 1;
                    multipleArray[i][crossLine - i] = 1;
                }

                System.out.print(multipleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void findMinMax() {
/*
    5. ** Задать одномерный массив и найти в нем минимальный
    и максимальный элементы (без помощи интернета);
*/
        int[] nums = {5, 18, 26, 1, 7, 3, 6, 8, 42, 68};
        int maxNum = 0;
        int minNum = nums[0];

        for (int num : nums) {
            if (num > maxNum) {
                maxNum = num;
            }

            if (num < minNum) {
                minNum = num;
            }
        }

        System.out.println("Максимальное число в массиве " + maxNum);
        System.out.println("Минимальное число в массиве " + minNum);
    }

//    static boolean checkBalance( int[] arr ) {
///*
//    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//          метод должен вернуть true, если в массиве есть место,
//          в котором сумма левой и правой части массива равны.
//          Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//          checkBalance([1, 1, 1, || 2, 1]) → true,
//          граница показана символами ||, эти символы в массив не входят.
//*/
//        int[] nums = {5, 18, 26, 1, 7, 3, 6, 8, 42, 68};
//        int maxNum = 0;
//        int minNum = nums[0];
//
//        for (int num : nums) {
//            if (num > maxNum) {
//                maxNum = num;
//            }
//
//            if (num < minNum) {
//                minNum = num;
//            }
//        }
//
//        System.out.println("Максимальное число в массиве " + maxNum);
//        System.out.println("Минимальное число в массиве " + minNum);
//    }
}