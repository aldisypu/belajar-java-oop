package programmer.zaman.now.application;

public class EqualsApp {
  public static void main(String[] args) {


    String first = "Aldi";
    first = first + " " + "Putra";

    System.out.println(first);

    String second = "Aldi Putra";
    System.out.println(second);

    System.out.println(first == second);
    System.out.println(first.equals(second));

    String third = "Aldi Putra";

    System.out.println(second == third);
    System.out.println(second.equals(third));

  }
}
