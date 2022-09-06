public class TelevisionClient {
//psvm = public static void main
  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);


    tv1.turnOn();
    tv1.turnOff();

    System.out.println(tv1);
    System.out.printf("%d television instances created", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 50);
    //tv2.setBrand("Sony");
    //tv2.setVolume(32);

    tv2.turnOn();
    tv2.turnOff();
    System.out.printf("%d television instances created", Television.getInstanceCount());
    System.out.println(tv2);

    Television tv3 = new Television("LG");

    tv3.turnOn();
    tv3.turnOff();

    //System.out.println(tv1.toString());


    System.out.println(tv3);
    System.out.printf("%d television instances created", Television.getInstanceCount());
  }

}
