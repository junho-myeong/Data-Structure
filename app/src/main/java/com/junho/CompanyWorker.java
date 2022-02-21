package com.junho;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CompanyWorker {

  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int inputNum = Integer.parseInt(in.readLine());
    HashMap<String, String> map = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < inputNum; i++) {
      String[] command = in.readLine().split(" ");
      map.put(command[0], command[1]);
    }

    for (String key : map.keySet()) {
      if (map.get(key).equals("enter")) {
        list.add(key);
      }
    }
    Collections.sort(list);
    for (String i1 : list) {
      System.out.println(i1);
    }
  }

}
