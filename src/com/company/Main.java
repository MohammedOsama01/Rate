package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("*** Rating ***");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your rating [1-5], Enter “exit” when you are done");
        int rating= input.nextInt();

        String result=rate(rating);
        System.out.println(result);
        System.out.println("Thank you for your feedback!!!");



    }

    public static String rate(int rate){
        Scanner input = new Scanner(System.in);
        if (rate<3) {
            System.out.println("What is the reason for this low rating?");
            String str=input.next();
            input.close();
            if (rate == 1) {
                return "BAD";
            }
            else if (rate == 2) {
                return "NOT GOOD";
            }

        }
        else if (rate == 3) {
            return "GOOD";

        }

        else if (rate==4) {
            return "VERY GOOD";

        }else if(rate==5) {
            return "EXCELLENT";
        }

        return "Display an error massage, and let them enter a new value";

    }


}

