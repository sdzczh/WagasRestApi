package com.zh.program.Common.utils;

import java.util.UUID;


public class UUIDs {
  private UUIDs() {
  }

  public static String uuid() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }
  
  
  public static void main(String[] args) {
	  System.out.println(uuid());
}
}
