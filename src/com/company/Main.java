package com.company;

public class Main {

    public static void main(String[] args) {

        // the 1st way to create an array
        int[] ages = {12, 15, 18, 19}; // manually enter values yourself
//        System.out.println(ages[3]);
        double average = 0;
        double sum = 0;

        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);

            sum += ages[i];
//            System.out.println(sum);
        }
        average = sum / ages.length;
//        System.out.println("sum = " + sum);
//        System.out.println("average = " + average);


        // the 2nd way
        String[] names = new String[4]; // create a new instance and give it a size
        names[0] = "Anne";
        names[1] = "Lana";
        names[2] = "Paris";
        names[3] = "Jane";
//        System.out.println(names[2]);

        String bunchOfNames = "";
        for (int i = 0; i < names.length; i++) {
            bunchOfNames += names[i] + " ";
        }
        System.out.println("bunchOfNames = " + bunchOfNames);



//        [13, 45, 26, 22, 19, 24, 28, 30, 90, 12]
    }
}
