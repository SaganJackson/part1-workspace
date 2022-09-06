public class Television {

  private String brand; //field
  private int volume;

//constructors are located after the fields and before the methods
  /* public Television(String brand){
    this.brand = brand;
  }*/
  //business methods first and then setters and getters
  public void turnOn(){
    // TODO: 9/1/2022
    boolean isConnected = verifyInternetConnection();
    //sout = System.out.println();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() {

    System.out.println("The " + brand + " television is off");
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString(){
    return "Television: brand=" + brand + ", volume=" + volume;
  }
}
