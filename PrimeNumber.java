/** 素数 */
public class PrimeNumber {

  public static void main(String[] args) {

    // 仕様上、2は出力されない

    // 上限
    int max = 100;

    for (int baseA = 1; baseA < max; baseA++) {
      int a = baseA * 2 + 1;

      boolean isPrimeNumber = true;

      for (int baseB = 3; baseB <= baseA; baseB++) {
        int ans = a % baseB;
        if (ans == 0) {
          isPrimeNumber = false;
          break;
        }
      }

      if (isPrimeNumber) {
        System.out.println(a);
      }
    }
  }
}
