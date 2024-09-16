package slisaasquatch;

import static slisaasquatch.Utils.generateCoins;

import java.util.IntSummaryStatistics;

public class Coin1834273354628424080 {

  public static int aliceAlgorithm(boolean[] coins) {
    boolean headSeen = false;
    int coinsSeen = 0;
    for (boolean coin : coins) {
      coinsSeen++;
      if (!coin) {
        continue;
      }
      if (headSeen) {
        return coinsSeen;
      } else {
        headSeen = true;
      }
    }
    return 0;
  }

  public static int bobAlgorithm(boolean[] coins) {
    boolean headSeen = false;
    int coinsSeen = 0;
    for (int i = 0; i < coins.length; i += 2) {
      coinsSeen++;
      final boolean coin = coins[i];
      if (!coin) {
        continue;
      }
      if (headSeen) {
        return coinsSeen;
      } else {
        headSeen = true;
      }
    }
    for (int i = 1; i < coins.length; i += 2) {
      coinsSeen++;
      final boolean coin = coins[i];
      if (!coin) {
        continue;
      }
      if (headSeen) {
        return coinsSeen;
      } else {
        headSeen = true;
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

