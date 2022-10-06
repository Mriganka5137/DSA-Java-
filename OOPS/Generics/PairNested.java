package Generics;

import Generics.Pair;

public class PairNested {

  public static void main(String[] args) {
    Pair<Pair<String, Integer>, String> p = new Pair<Pair<String, Integer>, String>(
      null,
      null
    );
    Pair<String, Integer> pInner = new Pair<String, Integer>("Mriganka", 5137);
    p.setFirst(pInner);
    p.setSecond("Khumtai");
    pInner.setFirst("HelloWorld from Inside");
    pInner.setSecond(1998);
    System.out.println(
      p.getSecond() +
      " " +
      p.getFirst().getFirst() +
      " " +
      p.getFirst().getSecond()
    );
  }
}
