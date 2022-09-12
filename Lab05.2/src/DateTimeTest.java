/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */

import java.time.*;
import java.time.format.*;
import javax.swing.text.DateFormatter;

class DateTimeTest {

  /**
   * main() calls each of the test methods in turn (currently commented out). To run one test method
   * at a time, uncomment the call to the one you want to execute.
   */
  public static void main(String[] args) {
    testNow();
    testCreate();
    testParse();
    testFormat();
  }

  /**
   * TASK: create current date, time, and date-time via now() and then print them.
   */
  public static void testNow() {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    // TODO
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testCreate() {
    // TODO: create your birthday via of(). What day of the week were you born on?
    LocalDate birthday = LocalDate.of(1989, 7, 5);
    System.out.println(birthday);

    //System.out.println(DayOfWeek.from(LocalDate.of(1989, 7, 5)));

    // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.
    System.out.println(LocalDateTime.of(1969, 7, 20, 15, 18));
    // NOTE: ignore time-zone, just assume Eastern Time is the local time.
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testParse() {
    // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
//Date time formatter - SJ
    // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
    LocalDate birthday = LocalDate.parse("1989-07-05");
    //System.out.println(LocalDate.parse("1989-07-05"));
    System.out.println(birthday);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
    birthday = LocalDate.parse("7/5/1989", formatter);
    System.out.println(birthday);
  }

  /**
   * TASK: create formatted display strings for the date below, in the specified formats.
   */
  public static void testFormat() {
    LocalDate hastings = LocalDate.of(1066, 10, 14);
// date time formatter - SJ
    // TODO: 10/14/1066
    DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    System.out.println(usDateFormat.format(hastings));


    // TODO: 14-10-1066
    DateTimeFormatter intlFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println(intlFormat.format(hastings));

    // OPTIONAL: October 14, 1066
    DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    System.out.println(longFormat.format(hastings));
  }
}