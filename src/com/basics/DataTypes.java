package com.datatypes;

import java.time.LocalDate;

public class College {
    static String college="SSM Institute of Engineering and Technology"; //common to all
    String name;  //instance variable store data of specific object
    int age;

    College(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args){

        College vignesh=new College("Vignesh",20);
        System.out.println(vignesh.name);
        System.out.println(vignesh.age);

        College yuvaraj=new College("Yuvaraj",21);
        System.out.println(yuvaraj.name);
        System.out.println(yuvaraj.age);

        //primitive data types
        //byte -128 to 127
        System.out.println("Byte Data type");
        byte a=10;
        byte b=4;
        byte sum=(byte)(a+b);
        System.out.println(sum);

        // short -32768 to 32767
        System.out.println("Short Data type");

        short c = 5;
        System.out.println(c * 3);


        // int
        System.out.println("Int Data type");
        int d = 100000;
        int e = 200000;
        int total = d + e;
        System.out.println(total);


        // long store longest number
        System.out.println("Long Data type");
        long population = 8000000000L;
        System.out.println(population);


        // float - used to store decimal values
        System.out.println("Float Data type");
        float price = 99.5f;
        System.out.println(price);


        // double - used to store large decimal values
        System.out.println("Double Data type");
        double salary = 25000.456789;
        System.out.println(salary);


        // char - stores single character
        System.out.println("Char Data type");
        char character = 'A';
        System.out.println(character);
        System.out.println(character+1);


        // boolean - stores true or false
        System.out.println("Boolean Data type");
        boolean isMonday = true;
        System.out.println(isMonday);


        //Non-primitive, Object Data type, Reference data type
        //object,class,string,array,date and time
        String data="Hello world";
        System.out.println(data);

        System.out.println("Array type");
        int[] array=new int[5];
        array[0]=10;
        array[1]=10;

        for(int num:array){
            System.out.print(num+" ");
        }

        //date and time
        System.out.println("");
        LocalDate date=LocalDate.now();
        System.out.println(date);
    }
