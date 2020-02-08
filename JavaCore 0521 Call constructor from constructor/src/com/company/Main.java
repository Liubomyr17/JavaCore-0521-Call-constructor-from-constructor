package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0521 Вызов конструктора из конструктора

Разберись, что делает программа.
Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
Подумай, какой конструктор нужно вызвать.
Подсказка:
внимательно изучи реализацию конструктора по умолчанию.

Требования:
1. У класса должно быть 3 конструктора.
2. Конструктор с двумя параметрами должен инициализировать переменные x и y переданными значениями.
3. Конструктор с двумя параметрами должен инициализировать переменную radius значением 10.
4. Конструктор с двумя параметрами должен должен вызывать другой конструктор, передав в него верные значения параметров.
5. Метод main не изменять.
6. Конструктор по умолчанию не изменять.
Level 5 Lection 9
Вызов конструктора из конструктора

*/

// public class Circle
public class Main {
    public double x;
    public double y;
    public double radius = 10;

    public Main(double x, double y, double radius) {
     this.x = x;
     this.y = y;
     this.radius = radius;
    }

    public Main(double x, double y) {
        this(x,y,10);
    }

    public Main() {
        this(5,5,1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.x + " " + main.y + " " + main.radius);
        Main anotherCircle = new Main(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}




