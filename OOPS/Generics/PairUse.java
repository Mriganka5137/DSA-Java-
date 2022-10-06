package Generics;

import Generics.Pair;

public class PairUse {

  public static void main(String[] args) {
    Pair<Integer, String> pI = new Pair<Integer, String>(5137, "Mriganka");
    System.out.println(pI.getFirst() + " " + pI.getSecond());

    Pair<String, Integer> pS = new Pair<String, Integer>("Mriganka", 5137);
    System.out.println(pS.getFirst() + " " + pS.getSecond());
  }
}
