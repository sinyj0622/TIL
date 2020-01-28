// 파일 디렉토리 생성,삭제 해보기

package sinyj0622.cording.practice;

import java.io.File;

public class FileClassTest {

  public static void main(String[] args) {

    File dir = new File("temp2/a");
    if (dir.delete()) {
      System.out.println("디렉토리를 삭제했습니다.");
    } else {
      System.out.println("디렉토리를 삭제할 수 없습니다.");
    }
  }

}
