package com.example.task04;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Task04Main {
    public static void main(String[] args){
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        read();
    }

    public static void read(){
        // "//Z" - пробелы и символа перевода строки.
        Scanner sc = new Scanner(System.in);
        String input;
        if(sc.hasNext())
            input = sc.useDelimiter("\\Z").next();
        else
            input = "";

        Pattern sep = Pattern.compile("\\s");

        double result = 0d;
        
        String[] stringArr = input.split(sep.pattern());

        if (stringArr.length == 0){
            System.out.printf("%.6f\n", result);
        }else{
            for (String s : stringArr) {
                try {
                    result += Double.parseDouble(s);
                } catch (NumberFormatException ignored) {
                }
            }
            System.out.printf("%.6f\n", result);
        }

    }
}
