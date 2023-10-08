package programmers;

public class Parallel {
	// 기울기가 같으면 됨! + x, y 는 모두 양수 (2사분면)
	public int solution(int[][] dots) {
		int answer = 0;
		for (int i = 1; i < dots.length; i++) {
			double x = dots[0][0] - dots[i][0];
			double y = dots[0][1] - dots[i][1];
			double incl1 = y / x;

			int j = i == 3 ? 1 : 0;
			double x1 = dots[3 - j][0] - dots[3 - i + j][0];
			double y1 = dots[3 - j][1] - dots[3 - i + j][1];
			double incl2 = y1 / x1;

			System.out.println(x1);
			System.out.println(y1);
			System.out.println("incl1 : " + incl1 + "incl2 : " + incl2);
			if (Math.pow(incl1, 2) == Math.pow(incl2, 2)) {

				answer = 1;
				break;
			}
		}
		return answer;
	}
}
