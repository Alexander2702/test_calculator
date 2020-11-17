package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите данные в формате: число действие число. Все через пробел.");
        System.out.println("Калькулятор считает арабские и римские цифры.");
        System.out.println("Использовать числа от 1 до 10, или от I до X включительно.");

        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            for (String retval : input.split(" ", 50)) {
                list.add(retval);
            }
            Functions.logic(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные");
        }
        System.exit(0);

    }
}
