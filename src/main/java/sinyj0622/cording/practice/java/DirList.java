package sinyj0622.cording.practice.java;

import java.io.File;

public class DirList {

  public static void main(String[] args) {

    File dir = new File(".");

    File[] files = dir.listFiles();

    for (File file : files) {
      System.out.printf("%s, %12d, %s\n", file.isDirectory(), file.length(), file.getName());
    }
  }

}
