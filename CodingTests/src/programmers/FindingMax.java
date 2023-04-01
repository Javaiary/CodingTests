package programmers;

public class FindingMax {
	public int[] solution(int[] array) {
		int[] answer = new int[2];
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			max = Math.max(max, array[i]);
			if (max == array[i]) {
				answer[1] = i;
			}
		}
		answer[0] = max;

		return answer;
	}
}
