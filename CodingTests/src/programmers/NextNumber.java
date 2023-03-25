package programmers;

public class NextNumber {
	public int solution(int[] common) {
		int answer = 0;
		// 1. 수열의 길이는 항상 3 이상
		// 2. 등차수열인지 확인
			if (common[1]-common[0]==common[2]-common[1]) {
				answer= common[common.length-1]+(common[1]-common[0]);
			}
		// 3. 그렇지 않은 경우 등비수열
			else {
				answer = common[common.length-1]*(common[1]/common[0]);
			}
		return answer;
	}
}
