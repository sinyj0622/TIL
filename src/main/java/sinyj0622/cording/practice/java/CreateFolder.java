package sinyj0622.cording.practice.java;

import java.io.File;
import java.io.IOException;

public class CreateFolder {

  public static void main(String[] args) throws IOException {

    File file = new File("temp2/a/test.txt");

    File dir = file.getParentFile();

    if (dir.mkdirs()) {
      System.out.println("디렉토리 생성");
    } else {
      System.out.println("디렉토리 생성실패");
    }


    if (file.createNewFile()) {
      System.out.println("파일 생성");
    } else {
      System.out.println("파일 생성실패");
    }
  }

}
