package org.example;

public class Main
{
    public static void main(String[] args)
    throws java.io.IOException
    {
        String name;
        name = String.valueOf(System.in.read());
        System.out.println("Hello world from " + name + ".");
    }
}