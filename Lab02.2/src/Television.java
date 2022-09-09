public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;

  private String brand; //field
  private int volume;
  private DisplayType display = DisplayType.LED;
//Name the field display, and initialize it to an LED display type

  //constructors are located after the fields and before the methods
  public Television() {
    instanceCount++;
  }

  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    //this.brand = brand;
    this(brand);
    setVolume(volume);

  }

  public Television(String brand, int volume, DisplayType display) {
    //this.brand = brand;
    this(brand, volume);

    setDisplay(display);

  }


  //business methods first and then setters and getters
  public void turnOn() {

    boolean isConnected = verifyInternetConnection();
    //sout = System.out.println();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() {

    System.out.println("The " + brand + " television is off");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {

   switch(brand) {
     case "Samsung":
     case "LG":
     case "Sony":
     case "Toshiba":
       this.brand = brand;
       break;
     default:
       System.out.printf("%s is not a valid brand; only Samsung, LG, Sony, and Toshiba are allowed. %n", brand);
   }
//s is a placeholder for a string. d is for a decimal representation of an integer. %n is new line
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {

    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume,
          MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {
    return "Television: brand=" + brand + ", volume=" + volume + ", display=" + display;
  }
}
