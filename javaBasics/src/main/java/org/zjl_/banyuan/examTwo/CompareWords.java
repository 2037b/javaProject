package org.zjl_.banyuan.examTwo;

import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class CompareWords {

  public static void main(String[] args) {
    TreeSet words = new TreeSet();
    String[] strArr = new Scanner(System.in).nextLine().split(" ");
    for (String str : strArr
    )
      words.add(new NewString(str));
    System.out.println(words);
  }
}

class NewString implements Comparable<NewString> {

  String str;

  NewString(String str) {
    this.str = str;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    NewString newString = (NewString) o;
    return str.equals(newString.str);
  }

  @Override
  public int hashCode() {
    return Objects.hash(str);
  }

  @Override
  public String toString() {
    return "{" +
        str +
        '}';
  }

  @Override
  public int compareTo(NewString o) {
    return this.str.compareTo(o.str);
  }
}
