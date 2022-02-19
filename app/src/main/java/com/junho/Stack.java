package com.junho;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
  static Scanner keyScan = new Scanner(System.in);
  static ArrayList list;

  static int inputCount() throws Exception {
    int commandCount = Integer.parseInt(keyScan.nextLine());
    if (commandCount >= 1 && commandCount <= 10000) {
      return commandCount;
    } else {
      throw new Exception();
    }
  }
  @SuppressWarnings("unchecked")
  static void add(int i) {
    list.add(i);
  }

  static int size(ArrayList list) {
    return list.size();
  }

  public static void main(String[] args) throws Exception {
    int commandCount = inputCount();
    list = new ArrayList(commandCount);
    for (int i = 0; i < commandCount ; i++) {
      String input = keyScan.nextLine();
      String[] strlist = input.split(" ");
      if (strlist.length == 2) {
        add(Integer.parseInt(strlist[1]));
      } else {
        switch (strlist[0]) {
          //          case "pop": pop();
          case "size": System.out.println(size(list));
          //          case "empty": empty();
          //          case "top": top():
          //          default: throw new Exception();
        }
        //      }
      }


    }
  }

}
