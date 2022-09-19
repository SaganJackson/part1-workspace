/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.data.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PersonDataClient {

  /**
   * To run one method at a time, uncomment the call to the one you want to execute.
   */
  public static void main(String[] args) {
    // writeData();
    readData();
  }

  /**
   * TASK: write the following data (as Strings and Java primitives) to file 'person.dat': your-name
   * (String)  your-age (int)  your-shoe-size (double)  marital-status (boolean)
   * <p>
   * Here's a sample: Java Programmer     54              9.5                      true
   * <p>
   * Use a DataOutputStream wrapped around a FileOutputStream. Use a try-with-resources to
   * initialize the stream and auto-close it.
   */
  private static void writeData() {
    try (DataOutputStream out = new DataOutputStream(new FileOutputStream("person.dat"))) {
      out.writeUTF("Java Programmer");
      out.writeInt(54);
      out.writeDouble(9.5);
      out.writeBoolean(true);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
  // TODO


  /**
   * TASK: read the data written to 'person.dat' back in to the appropriate Java datatypes.
   * <p>
   * You need to read it in the same sequence as it was written. Then print to stdout to see it.
   * <p>
   * Use a DataInputStream wrapped around a FileInputStream. Use a try-with-resources to initialize
   * the stream and auto-close it.
   */
  private static void readData() {

    try (DataInputStream in = new DataInputStream(new FileInputStream("person.dat"))) {
      String name = in.readUTF();
      int age = in.readInt();
      double shoeSize = in.readDouble();
      boolean maritalStatus = in.readBoolean();

//      String data = new StringBuilder()
//          .append("name: ").append(name).append("\n")
//          .append("age: ").append(age).append("\n")
//          .append("shoeSize: ").append(shoeSize).append("\n")
//          .append("maritalStatus: ").append(maritalStatus).append("\n")
//          .toString();
//
//      System.out.println(data);
      System.out.println("name: " +  name + "\n" + "age: " + age + "\n" + "shoeSize: " + shoeSize + "\n" + "maritalStatus: " + maritalStatus);;
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
