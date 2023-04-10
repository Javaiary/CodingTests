package programmers;

public class CuttingArrays {
	public long[] solution(int n, long left, long right) {

		long[] answer = new long[(int) (right - left + 1)];
		
		long rw = left /n; 	// 시작 행
		long clmn = left % n;	// 시작 열
        int i = 0;
		// 시작 clmn이 0일 경우 반복문에서 바로 행이 증가되기 때문에 우선 1회 실행
			answer[i] = Math.max(rw, clmn) + 1;
            clmn++;
			i++;
		 while (i < right - left + 1) {
			clmn = clmn == n? 0 : clmn;	// 0 열로 초기화
			rw = clmn ==0? rw+1 : rw;	// clmn이 0일 경우 다음 행으로 이동
			answer[i] = Math.max(rw, clmn) + 1;
			clmn++;
			i++;
		}

		return answer;
	}
}
