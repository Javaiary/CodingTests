package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class LifeBoat {
	public int solution(int[] people, int limit) {
	       int answer = 0; // 사용된 구명보트의 수
			Arrays.sort(people);
			// people 배열을 ArrayList 형식으로 변환
			ArrayList<Integer> peopleAl = new ArrayList<>();
			for (int person : people) {
				peopleAl.add(person);
			}
			// people 배열의 원소가 남지 않을 때까지(모두 탈출할 때까지) 반복
			while (peopleAl.size() > 1) {
				int i = peopleAl.size() - 1;
				// 무조건 혼자 타야하는 경우
				if (peopleAl.get(i) > limit - 40) {
					peopleAl.remove(i);
					answer++;
				}
				// 몸무게를 더해서 limit이하인 승객이 있으면 2명 내보냄
				else if (limit - peopleAl.get(0) >= peopleAl.get(i)) {
					peopleAl.remove(i);
					peopleAl.remove(0);
					answer++;
				}
				// 더해서 limit 이하인 승객이 없으면 승객1명만 태워서 내보냄
				else {
					peopleAl.remove(i);
					answer++;
				}
			}
			answer = peopleAl.size() == 1 ? answer += 1 : answer;

			return answer;
		}
}
