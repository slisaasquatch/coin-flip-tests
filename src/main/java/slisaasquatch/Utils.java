package slisaasquatch;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {

  public static boolean[] generateCoins(int count) {
    final boolean[] coins = new boolean[count];
    for (int i = 0; i < coins.length; i++) {
      coins[i] = ThreadLocalRandom.current().nextBoolean();
    }
    return coins;
  }

}
