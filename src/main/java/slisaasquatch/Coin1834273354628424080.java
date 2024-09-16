package slisaasquatch;

public class Coin1834273354628424080 {

  public static int aliceAlgorithm(boolean[] coins) {
    boolean headSeen = false;
    int trials = 0;
    for (boolean coin : coins) {
      trials++;
      if (!coin) {
        continue;
      }
      if (headSeen) {
        return trials;
      } else {
        headSeen = true;
      }
    }
    return 0;
  }

  public static int bobAlgorithm(boolean[] coins) {
    boolean headSeen = false;
    int trials = 0;
    for (int i = 0; i < coins.length; i += 2) {
      trials++;
      final boolean coin = coins[i];
      if (!coin) {
        continue;
      }
      if (headSeen) {
        return trials;
      } else {
        headSeen = true;
      }
    }
    for (int i = 1; i < coins.length; i += 2) {
      trials++;
      final boolean coin = coins[i];
      if (!coin) {
        continue;
      }
      if (headSeen) {
        return trials;
      } else {
        headSeen = true;
      }
    }
    return 0;
  }

}

