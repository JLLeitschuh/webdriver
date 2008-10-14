package org.openqa.selenium.security;

public class BasicCredentials implements SecurityCredentials {
  private String userName;
  private String password;

  public BasicCredentials(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public String getName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }
}
