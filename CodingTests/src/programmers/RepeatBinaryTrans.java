package programmers;

public class RepeatBinaryTrans {
	public static int[] solution(String s) {
		int zeroCnt = 0;
		int cnt = 0;

		while (!s.equals("1")) {
			int num = 0; // 1 개수 == 숫자
			// 0 제거
			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == '1') {
					num += 1;
				} else {
					zeroCnt++;
				}
			}
			StringBuffer sb = new StringBuffer();
			// 2진수로 변환
			while (num / 2 != 0) {
				if (num % 2 == 0) {
					sb.append('0');
				} else {
					sb.append('1');
				}
				num /= 2;
			}
			sb.append('1');
			// 뒤집어서 s에 재할당
			s = sb.reverse().toString();
			cnt++;
		}

		int[] answer = { cnt, zeroCnt };
		return answer;
	}
}
