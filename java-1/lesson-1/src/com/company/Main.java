package com.company;

import java.util.Arrays;

/**
 * Домашнее задание к 1-му уроку по курсу Java 1
 * Студент: Сакиев Вадим
 *
 * Задачи:
 * + Создать пустой проект в IntelliJ IDEA и прописать метод main();
 * + Создать переменные всех пройденных типов данных, и инициализировать их значения;
 * + Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
 * + Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
 *   если да – вернуть true, в противном случае – false;
 * + Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
 *   в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
 * + Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
 * + Написать метод, которому в качестве параметра передается строка, обозначающая имя,
 *   метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
 * + Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
 *  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 *
 */

public class Main {

    public static void main(String[] args) {

        printAllDataType();
        System.out.println(calculateExpression(18, 26, 53, 42));
        System.out.println(inRange(3, 17));
        checkNumber(42);
        System.out.println(isNegativeNumber(-5));
        System.out.println(greetingUser("Вадим"));
        isLeapYear(2021);
    }

    static void printAllDataType() {
        byte bt = 127;
        short sh = 32767;
        int in = 2147483647;
        long lg = 9223372036854775807L;

        float fl = 3.14f;
        double db = 42.420000003;

        char ch = 'V';
        String str = "Hello, Java!";

        boolean flag = true;

        int [] myArr = {1, 2, 3};

        System.out.println("byte " + bt);
        System.out.println("short " + sh);
        System.out.println("int " + in);
        System.out.println("long " + lg);
        System.out.println("float " + fl);
        System.out.println("double " + db);
        System.out.println("char " + ch);
        System.out.println("String " + str);
        System.out.println("boolean " + flag);
        System.out.println("Array" + Arrays.toString(myArr));
    }

    static int calculateExpression (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean inRange(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }

        return false;
    }

    static void checkNumber(int a) {
        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
    }

    static boolean isNegativeNumber(int number) {
        return number <= 0;
    }

    static String greetingUser(String name) {
        return "Привет, " + name + "!";
    }

    static void isLeapYear (int year) {
        System.out.println(year % 4 == 0 && year % 100 != 0  || year % 400  == 0 ? "Год високосный" : "Год не високосный");
    }


}
