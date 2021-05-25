package test;

import java.util.Scanner;

public class Example4{

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int hour, min, sec;
      Scanner s = new Scanner(System.in);
      System.out.println("초를 입력>> ");
      
      sec = s.nextInt();
      min = sec / 60;
      
      hour = min / 60;
      sec = sec % 60;
      
      min = min % 60;
      System.out.printf("%d시 %d분 %d초", hour, min, sec);
   }

}