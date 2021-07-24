package com.training.stream;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class StreamVsCollection {

    public static void main(String...args){
        List<String> names = Arrays.asList("Java8", "Lambdas", "Example", "Code");
        Stream<String> s = names.stream().filter(str->str.startsWith("J"));
        //s.forEach(System.out::println);// stream will be closed 
//        s.filter(str->str.startsWith("J"));
        // uncommenting this line will result in an IllegalStateException
        // because streams can be consumed only once
        s.forEach(System.out::println);
    }
}