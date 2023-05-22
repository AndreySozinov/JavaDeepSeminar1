package ru.savrey.seminar1.regular;

/**
 * Класс, выполняющий четыре арифметических действия.
 * Используй методы add, sub, mul, div.
 */
public class MathAction {

    /**
     * Метод сложения двух целых чисел
     * @param a первое слагаемое число
     * @param b второе слагаемое число
     * @return Результат сложения чисел a и b. Без проверки на переполнение переменной.
     */
    public static int add(int a, int b){
        return a + b; // возврат без проверки переполнения
    }

    /**
     * Метод деления двух целых чисел
     * @param a делимое число
     * @param b число делитель
     * @return Результат деления чисел a и b. Без проверки на переполнение переменной.
     */
    public static int div(int a, int b){
        return a / b; // возврат без проверки переполнения
    }

    /**
     * Метод умножения двух целых чисел
     * @param a первый множитель
     * @param b второй множитель
     * @return Результат умножения чисел a и b. Без проверки на переполнение переменной.
     */
    public static int mul(int a, int b){
        return a * b; // возврат без проверки переполнения
    }

    /**
     * Метод вычитания двух целых чисел
     * @param a уменьшаемое число
     * @param b вычитаемое число
     * @return Результат вычитания числа b из числа а. Без проверки на переполнение переменной.
     */
    public static int sub(int a, int b){
        return a - b; // возврат без проверки переполнения
    }

}