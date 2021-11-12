package com.neka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int num;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println("Number before reversing " + num );

        /*logic 1 - using algo
        int rev = 0;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Number after reversing " + rev);


        //logic 2 : using string buffer

        StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        //coverting the number to string
        rev = sb.reverse();
        System.out.println("Number after reversing " + rev);
*/

        //logic 3 : String Builder
        StringBuilder sb = new StringBuilder();
        sb.append(num);
       StringBuilder rev =  sb.reverse();

        System.out.println("Number after reversing " + rev);
    }
}
