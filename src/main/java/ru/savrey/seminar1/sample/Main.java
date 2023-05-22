package ru.savrey.seminar1.sample;

import ru.savrey.seminar1.regular.Formatter;
import ru.savrey.seminar1.regular.MathAction;

/**
 * скомпилировать
 * javac -sourcepath ./java -d out java/ru/savrey/seminar1/sample/Main.java
 * запустить
 * java -classpath ./out ru.savrey.lesson1.sample.Main
 * задокументировать
 * javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru
 *
 * dockerfile
 * FROM bellsoft/liberica-openjdk-alpine:latest
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out src/ru/savrey/seminar1/sample/Main.java
 * CMD java -classpath ./out ru.savrey.seminar1.sample.Main
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(Formatter.format(MathAction.add(2, 3)));
        System.out.println(Formatter.format(MathAction.sub(5, 3)));
        System.out.println(Formatter.format(MathAction.mul(2, 3)));
        System.out.println(Formatter.format(MathAction.div(6, 3)));
    }
}
