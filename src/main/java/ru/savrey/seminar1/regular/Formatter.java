package ru.savrey.seminar1.regular;

/**
 * Форматировщик. Осуществляет форматированный вывод результата.
 */
public class Formatter {

    /**
     * Метод декорирует число, добавляя к нему строку
     * при помощи функции форматирования строк.
     * @param a число
     * @return строка
     */
    public static String format(int a){
        return String.format("Here is your number: %d", a);
    }
}
