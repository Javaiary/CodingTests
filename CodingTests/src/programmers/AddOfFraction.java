package programmers;

public class AddOfFraction {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {

		int numer = numer1 * denom2 + numer2 * denom1;
		int denom = denom1 * denom2;

		int big = 0; // 두 수 중 큰 수
		int gcd = 0; // 최대 공약수

		// 두 수의 최대 공약수는 둘 중 더 작은 수보다 작거나 같음
		if (numer > denom) {
			gcd = denom;
			big = numer;
		} else {
			gcd = numer;
			big = denom;
		}
		// 큰 수를 작은 수로 나누었을 때 나누어 떨어지지 않으면 gcd를 찾는 반복문 진입
		if (big % gcd != 0) {
			for (int i = gcd / 2; i > 0; i--) {
				// 분자, 분모가 모두 i로 나누어 떨어지면 i를 gcd에 할당하고 반복문 이탈
				if (numer % i == 0 && denom % i == 0) {
					gcd = i;
					break;
				}
				// 나누어 떨어지지 않으면 i를 1씩 감소하여 반복
			}
		}

		// 구한 최대 공약수(gcd)로 약분하기
		int[] answer = new int[] { numer / gcd, denom / gcd };
		return answer;
	}
}
