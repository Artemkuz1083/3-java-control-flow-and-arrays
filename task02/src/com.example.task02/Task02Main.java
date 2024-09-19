package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2)
            return "зима";
        else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5)
            return "весна";
        if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8)
            return "лето";
        if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11)
            return "осень";

        return "";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}