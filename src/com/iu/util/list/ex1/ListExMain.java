package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExMain {
   public static void main(String[] args) {
      //1.정보입력 - 이름입력, 나이입력 ->arraylist
      //2.정보출력 - 모든 정보 출력
      //3.종     료
      ListExInput in = new ListExInput();
      ListExView lv = new ListExView();
      Scanner sc = new Scanner(System.in);
      boolean check = true;
      ArrayList<Member> ar = new ArrayList<>();
      System.out.println("번호 입력");

      while(check) {
         System.out.println("1.정보입력");
         System.out.println("2.정보출력");
         System.out.println("3.종     료");
         int select = sc.nextInt();

         if(select == 1) {
            Member m = in.setInfo();
            ar.add(m);
         }else if(select == 2) {
            lv.view(ar);
         }else {
            System.out.println("프로그램을 종료합니다.");
            check=!check;
         }
      }
   }
}