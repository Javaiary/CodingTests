package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PickTwoAndSum {
	public ArrayList<Integer> solution(int[] numbers) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (!answer.contains(numbers[i] + numbers[j])) {
					answer.add(numbers[i] + numbers[j]);
				}
			}
		}
		Collections.sort(answer);
		return answer;
	}
}
