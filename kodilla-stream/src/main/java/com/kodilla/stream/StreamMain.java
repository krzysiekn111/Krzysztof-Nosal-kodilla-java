package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("abcde", text -> text.toUpperCase());
        poemBeautifier.beautify("Piotr", text ->  text + " Wielki");
        poemBeautifier.beautify("ABCDE", text -> "|||" + text.concat("|||"));
        poemBeautifier.beautify("Tutaj", text -> text.concat(" ->"));
    }
}