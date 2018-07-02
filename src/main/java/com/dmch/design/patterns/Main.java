package com.dmch.design.patterns;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.of("initial commit").ifPresent(System.out::print);
    }
}
