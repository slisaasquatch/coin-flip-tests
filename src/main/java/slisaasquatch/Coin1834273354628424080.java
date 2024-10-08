package slisaasquatch;

import static slisaasquatch.Utils.generateCoins;

import java.util.IntSummaryStatistics;

public class Coin1834273354628424080 {

  private static final int HEADS_SEEN_REQUIRED = 2;

  public static int aliceAlgorithm(boolean[] coins) {
    return bobAlgorithm(coins, 1);
  }

  public static int bobAlgorithm(boolean[] coins) {
    return bobAlgorithm(coins, 2);
  }

  public static int bobAlgorithm(boolean[] coins, int skips) {
    int headsSeen = 0;
    int coinsSeen = 0;
    for (int skip = 0; skip < skips; skip++) {
      for (int i = skip; i < coins.length; i += skips) {
        coinsSeen++;
        if (!coins[i]) {
          continue;
        }
        headsSeen++;
        if (headsSeen >= HEADS_SEEN_REQUIRED) {
          return coinsSeen;
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    final int trials = 1000000;
    int aliceWins = 0;
    int bobWins = 0;
    int ties = 0;
    final IntSummaryStatistics aliceStats = new IntSummaryStatistics();
    final IntSummaryStatistics bobStats = new IntSummaryStatistics();
    for (int i = 0; i < trials; i++) {
      final boolean[] coins = generateCoins(100);
      final int aliceResult = aliceAlgorithm(coins);
      final int bobResult = bobAlgorithm(coins);
      aliceStats.accept(aliceResult);
      bobStats.accept(bobResult);
      if (aliceResult < bobResult) {
        aliceWins++;
      } else if (bobResult < aliceResult) {
        bobWins++;
      } else {
        ties++;
      }
    }
    System.out.println("Alice wins count: " + aliceWins);
    System.out.println("Bob wins count: " + bobWins);
    System.out.println("ties count: " + ties);
    System.out.println("Alice coins stats: " + aliceStats);
    System.out.println("Bob coins stats: " + bobStats);
  }

}

