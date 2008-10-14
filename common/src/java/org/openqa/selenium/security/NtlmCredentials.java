package org.openqa.selenium.security;

public class NtlmCredentials implements SecurityCredentials {
  private String userName;
  private String password;
  private String host;
  private int port;
  private String clientHost;
  private String domain;

  public NtlmCredentials(String userName, String password, String host, int port, String clientHost, String domain) {
    this.userName = userName;
    this.password = password;
  }

  public String getName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }
  
  public String getHost(){
	  return host;
  }
  
  public int getPort(){
	  return port;
  }
  
  public String getClientHost(){
	  return clientHost;
  }
  
  public String getDomain(){
	  return domain;
  }
}
