package com.example.student;

public class Greeting {
  private String message;
  private int age;

  public Greeting() {}
  public Greeting(String message, int age) {
    this.message = message;
    this.age = age;
  }

  public String getMessage() { return message; }
  public void setMessage(String message) { this.message = message; }

  public int getAge() { return age; }
  public void setAge(int age) { this.age = age; }
}
