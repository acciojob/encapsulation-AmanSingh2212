package com.driver;

public class Main {

    public static void main(String[] args) {

         RWOnly obj = new RWOnly();
//         obj.name = "Aman";
//      Error is  : java: name has private access in com.driver.RWOnly
         obj.setName("Aman");
        System.out.println(obj.getName());

    }
  
}