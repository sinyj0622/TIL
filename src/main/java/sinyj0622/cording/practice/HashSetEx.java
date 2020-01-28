package sinyj0622.cording.practice;

import java.util.HashSet;

public class HashSetEx {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = "bbb";
    String s3 = "ccc";
    String s4 = "ddd";
    String s5 = "ccc";

    HashSet set = new HashSet();
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);
    set.add(s5);

    System.out.println(s3 == s5);
    System.out.println(s3.equals(s5));
    System.out.println(s3.hashCode() + "," + s5.hashCode());

    print(set);
  }

  static void print(HashSet set) {
    Object[] values = set.toArray();
    for (Object value : values) {
      System.out.println(value + ", ");
    }
    System.out.println();
  }
}
