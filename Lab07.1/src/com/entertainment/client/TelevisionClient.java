package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {
//psvm = public static void main
  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);
    tv1.setDisplay(DisplayType.CRT);


    tv1.turnOn();
    tv1.turnOff();

    System.out.println(tv1);
    System.out.printf("%d television instance created. %n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 50);
    //tv2.setBrand("Sony");
    //tv2.setVolume(32);

    tv2.turnOn();
    tv2.turnOff();

    System.out.println(tv2);
    System.out.printf("%d television instances created. %n", Television.getInstanceCount());

    Television tv3 = new Television("LG");

    tv3.turnOn();
    tv3.turnOff();

    //System.out.println(tv1.toString());
Television tv = new Television("Sony", 40, DisplayType.OLED);
    System.out.println(tv);

    System.out.println(tv3);
    System.out.printf("%d television instances created", Television.getInstanceCount());
  }

}
