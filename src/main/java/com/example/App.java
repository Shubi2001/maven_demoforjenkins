package com.example;

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        
        // New change for automatic Jenkins build trigger
        System.out.println("Auto build test - New code pushed to GitHub");
        
        // Another small change
        System.out.println("Jenkins CI is working successfully!");
    }
}