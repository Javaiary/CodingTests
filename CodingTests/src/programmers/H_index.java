package programmers;

import java.util.Arrays;

public class H_index {
	public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
		// 논문 수가 1일때
		if (citations.length == 1) {
			answer = citations[0] == 0 ? answer : answer+1 ;
			return answer;
		}
		// 인용 횟수가 h 이상인 논문이 h개 이상이어야 함
		while(citations.length >answer
				&& citations[(citations.length-1)-answer] > answer ) {
			answer++;
		}
        return answer;
    }
}
