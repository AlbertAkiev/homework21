package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter write = new FileWriter("java.txt");
        write.write("A a\n" +
                "эй\n" +
                "B b\n" +
                "би\n" +
                "C c\n" +
                "си\n" +
                "D d\n" +
                "ди\n" +
                "E e\n" +
                "и\n" +
                "F f\n" +
                "эф\n" +
                "G g\n" +
                "джи\n" +
                "H h\n" +
                "эйч\n" +
                "I i\n" +
                "ай\n" +
                "J j\n" +
                "джей\n" +
                "K k\n" +
                "кей\n" +
                "L l\n" +
                "эл\n" +
                "M m\n" +
                "эм\n" +
                "N n\n" +
                "эн\n" +
                "O o\n" +
                "оу\n" +
                "P p\n" +
                "пи\n" +
                "Q q\n" +
                "кью\n" +
                "R r\n" +
                "а, ар\n" +
                "S s\n" +
                "эс\n" +
                "T t\n" +
                "ти\n" +
                "U u\n" +
                "ю\n" +
                "V v\n" +
                "ви\n" +
                "W w\n" +
                "дабл-ю\n" +
                "X x\n" +
                "экс\n" +
                "Y y\n" +
                "уай\n" +
                "Z z\n" +
                "зед, зи  " );
        write.write("\n 1,2,3,4,5,6,7,8,\n");
write.close();

        FileReader reader = new FileReader("java.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
