package org.example;


import Singleton.Logger;
import Singleton.SimpleLocking;

public class Main {
    public static void main(String[] args) {
        System.out.println(SimpleLocking.getUniqueInstance());
        System.out.println(SimpleLocking.getUniqueInstance());
    }
}