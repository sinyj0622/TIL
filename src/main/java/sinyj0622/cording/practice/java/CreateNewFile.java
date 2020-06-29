package sinyj0622.cording.practice.java;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

  public static void main(String[] args) throws IOException {

    File file = new File("temp2/test.txt");


    if (file.delete()) {
      System.out.println("파일을 삭제하였습니다.");
    } else {
      System.out.println("파일을 삭제할 수 없습니다.");
    }



    /*
     * if (file.createNewFile()) { System.out.println("파일을 생성하였습니다."); } else {
     * System.out.println("파일을 생성할 수 없습니다."); }
     */
  }

}
