package programmers;

public class ReverseNumber {
	public static int[] solution(long n) {
		String s = String.valueOf(n);
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb = sb.reverse();
		System.out.println(sb);
		int[] answer = new int[s.length()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
		}
		return answer;
	}
}
