package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e = new FullTimeEmployee();
        Employee e1 = new FullTimeEmployee("awa", 25);
        System.out.println(e);
        System.out.println(e1);
    }
}