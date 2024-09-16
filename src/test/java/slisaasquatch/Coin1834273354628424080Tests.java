package slisaasquatch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static slisaasquatch.Coin1834273354628424080.aliceAlgorithm;
import static slisaasquatch.Coin1834273354628424080.bobAlgorithm;

import org.junit.jupiter.api.Test;

public class Coin1834273354628424080Tests {

  @Test
  public void testAliceAlgorithm() {
    assertEquals(0, aliceAlgorithm(new boolean[]{}));
    assertEquals(0, aliceAlgorithm(new boolean[]{true}));
    assertEquals(0, aliceAlgorithm(new boolean[]{false}));
    assertEquals(0, aliceAlgorithm(new boolean[]{true, false}));
    assertEquals(2, aliceAlgorithm(new boolean[]{true, true}));
    assertEquals(4, aliceAlgorithm(new boolean[]{true, false, false, true}));
    assertEquals(3, aliceAlgorithm(new boolean[]{true, false, true, false}));
    assertEquals(5, aliceAlgorithm(new boolean[]{true, false, false, false, true}));
    assertEquals(4, aliceAlgorithm(new boolean[]{true, false, false, true, false}));
  }

  @Test
  public void testBobAlgorithm() {
    assertEquals(0, bobAlgorithm(new boolean[]{}));
    assertEquals(0, bobAlgorithm(new boolean[]{true}));
    assertEquals(0, bobAlgorithm(new boolean[]{false}));
    assertEquals(0, bobAlgorithm(new boolean[]{true, false}));
    assertEquals(2, bobAlgorithm(new boolean[]{true, true}));
    assertEquals(4, bobAlgorithm(new boolean[]{true, false, false, true}));
    assertEquals(2, bobAlgorithm(new boolean[]{true, false, true, false}));
    assertEquals(3, bobAlgorithm(new boolean[]{true, false, false, false, true}));
    assertEquals(5, bobAlgorithm(new boolean[]{true, false, false, true, false}));
  }

}
