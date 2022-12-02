package com.waqas.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TenthSession {
    public TenthSession() {
        List<String> list = List.of("Waqas", "Ilyas");

        List<String> names = new ArrayList<>();
        names.add("Waqas");
        names.add("Shahid");
        names.add("Ilyas");
        names.add("Ausaf");
        names.add("Ayaz");

        //for
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //foreach
        for (String name : names) {
            System.out.println(name);
        }

        //Java 8 Streams
        names.stream()
                //Intermediate Operator like filter, map etc
                /*.map(name -> {
                    return name + name.length();
                })*/
                .map(name -> "%s %d".formatted(name, name.length()))
                //Terminal Operation
                .forEach(name -> {
                    System.out.println(name);
                });

                //Print all names which are equal or less than 5 characters
        names.stream()
                .filter(name -> {
                    return name.length()<=5;
                })
                .map(name -> {
                    return name + name.length();
                })
                .forEach(name -> {
                    System.out.println(name);
                });

                //Print all characters in all names
        names.stream()
                .map(String::toLowerCase)
                .flatMap(name -> Arrays.stream(name.split("")))
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new TenthSession();
    }
}
