package sinyj0622.cording.practice.java;

import java.io.FileInputStream;

public class StringIo {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test1.data");
    
    byte[] buf = new byte[100];
    
    int count = in.read(buf);
    
    String str = new String(buf, 0, count, "UTF-8");
    
    in.close();
    
    System.out.printf("%s\n", str);
   
  }

}
