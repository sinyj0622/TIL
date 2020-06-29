package sinyj0622.cording.practice.java;

import java.io.File;

public class JavaFilterex {

  public static void main(String[] args) {


    File dir = new File(".");

    File[] files =
        dir.listFiles(file -> (file.isFile() && file.getName().endsWith(".java")) ? true : false);



    for (File file : files) {
      System.out.printf("%s %s\n", file.isDirectory(), file.getName());
    }

  }

}
