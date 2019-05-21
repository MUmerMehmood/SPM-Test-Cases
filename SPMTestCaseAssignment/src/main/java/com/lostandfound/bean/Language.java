package com.lostandfound.bean;

public class Language{

  private String name;
  private int id;
  public Language(String name, int id) {
    this.name = name;
    this.id = id;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int age) {
    this.id = id;
  }

  public boolean languageCountry(String country) {
    if(country.equals("ksa")) {
      System.out.println("The language country is " + country);
      return true;
    } else {
      System.out.println("the doesn't belongs " +   country);
      return false;
    }

  }

  public boolean country() {

    if(this.languageCountry("ksa")) {
      System.out.println("belongs to country");
      return true;
    }
    else {
      System.out.println("doesn't belongs");
      return false;
    }
  }
}