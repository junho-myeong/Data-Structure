package com.junho;

import java.util.Scanner;

public class FindNumber {
  static Scanner sc = new Scanner(System.in);

  static int promptInt() throws Exception {
    int inputNumber = sc.nextInt();
    if (inputNumber >= 1 && inputNumber <= 100000) {
      return inputNumber;
    } else {
      throw new Exception();
    }
  }

  static void findNumber(int[] list1, int[] list2) {
    int result = 0;
    for (int i =0; i < list2.length; i++) {
      for (int j = 0; j < list1.length; j++) {
        if (list2[i] == list1[j]) {
          result = 1;
          break;
        } else {
          result = 0;
        }
      }
      System.out.println(result);
    }
  }


  public static void main(String[] args) throws Exception {
    int inputNumber1 = promptInt();
    int[] list1 = new int[inputNumber1];
    for (int i = 0 ; i < inputNumber1 ;i++) {
      list1[i] = sc.nextInt();
    }
    int inputNumber2 = promptInt();
    int[] list2 = new int[inputNumber2];
    for (int i = 0; i < inputNumber2; i++) {
      list2[i] = sc.nextInt();
    }
    findNumber(list1, list2);
  }
}
