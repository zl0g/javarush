package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        System.out.print(name+" получает "+d1+" через "+d2+" лет.");

    }
}