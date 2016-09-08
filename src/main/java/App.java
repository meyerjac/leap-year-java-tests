import java.io.Console;

public class App {
  public static void main (String[] args) {
    Console myConsole = System.console();
    System.out.println(" Enter a year and we'll tell you if its a leap year!!");
    String stringYear = myConsole.readLine();
    int intYear = Integer.parseInt(stringYear);
    LeapYear leapYear = new LeapYear();
    boolean leapYearResult = leapYear.isLeapYear(intYear);
    System.out.println("it is " + leapYearResult + " that your number is a leap year!!");
  }
}
