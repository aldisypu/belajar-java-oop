package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;

public class RecordApp {
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("aldi", "rahasia");

    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
    System.out.println(loginRequest);

    System.out.println(new LoginRequest());
    System.out.println(new LoginRequest("aldi"));
    System.out.println(new LoginRequest("aldi", "rahasia"));

  }
}
