package programmers;

public class SearchingPrimeNumber {
	public int solution(int n) {
		int cnt = 1;
		if (n < 4) {

		} else {
			for (int i = 4; i <= n; i++) {
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						cnt++;
						break;
					}
				}
			}
		}

		return n - cnt;
	}
}
