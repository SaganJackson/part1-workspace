package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

  public static void main(String[] args) {

    Television tv = new Television();

    tv.setBrand("Samsung");
    System.out.println(tv.getBrand());

    tv.setBrand("LG");
    System.out.println(tv.getBrand());

    tv.setBrand("Sony");
    System.out.println(tv.getBrand());

    tv.setBrand("Toshiba");
    System.out.println(tv.getBrand());

    tv.setBrand("RCA");
    System.out.println(tv);

    tv.setBrand("Zenith");
    System.out.println(tv);

    tv.setVolume(Television.MIN_VOLUME);
    System.out.println(tv.getVolume());

    tv.setVolume(Television.MAX_VOLUME);
    System.out.println(tv.getVolume());

    tv.setVolume(Television.MIN_VOLUME -1);
    System.out.println(tv);

    tv.setVolume(Television.MAX_VOLUME +1);
    System.out.println(tv);




  }

}
