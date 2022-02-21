package com.junho;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
  static Scanner keyScan = new Scanner(System.in);
  @SuppressWarnings("rawtypes")
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

  @SuppressWarnings("rawtypes")
  static int size(ArrayList list) {
    return list.size();
  }
  @SuppressWarnings("rawtypes")
  static int empty(ArrayList list) {
    if (list.size() <= 0) {
      return 1;
    } else {
      return 0;
    }
  }
  @SuppressWarnings("rawtypes")
  static int top(ArrayList list) {
    int temp = 0;
    if (list.size() <= 0) {
      return -1;
    } else {
      for (int i = 0; i < list.size(); i++) {
        if ((int) list.get(i) > temp) {
          temp = (int) list.get(i);
        }
      }
      return temp;
    }
  }
  @SuppressWarnings("rawtypes")
  static int pop(ArrayList list) {
    int temp = 0;
    int cursor;
    int count = 0;
    if (list.size() <= 0) {
      return -1;
    } else {
      for (cursor = 0; cursor < list.size(); cursor++) {
        if ((int) list.get(cursor) >= temp) {
          temp = (int) list.get(cursor);
          count = cursor;
        }
      }
      list.remove(count);
      return temp;
    }
  }

  @SuppressWarnings("rawtypes")
  public static void main(String[] args) throws Exception {
    int commandCount = inputCount();
    list = new ArrayList();
    for (int i = 0; i < commandCount ; i++) {
      String input = keyScan.nextLine();
      String[] strlist = input.split(" ");
      if (strlist.length == 2) {
        add(Integer.parseInt(strlist[1]));
      } else {
        switch (strlist[0]) {
          case "pop": {
            System.out.println(pop(list));
            break;
          }
          case "size": System.out.println(size(list)); break;
          case "empty": System.out.println(empty(list)); break;
          case "top": System.out.println(top(list)); break;
          default: throw new Exception();
        }
      }


    }
  }

}
