package programmers;

import java.util.Arrays;

public class SecretMap {
	public static String[] solution(int n, int[] arr1, int[] arr2) {

		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			StringBuffer map1 = new StringBuffer();
			StringBuffer map2 = new StringBuffer();
			String completedMap = "";

			// map1 생성
			map1.append(toBinary(arr1[i]));
			// 0이 부족한지 체크
			while (map1.length() < n) {
				map1.append(0);
			}
			map1.reverse();
			System.out.println(map1);

			// map2 생성
			map2.append(toBinary(arr2[i]));
			// 0이 부족한지 체크
			while (map2.length() < n) {
				map2.append(0);
			}
			map2.reverse();
			System.out.println(map2);

			for (int j = 0; j < n; j++) {
				if (map1.charAt(j) == '1' || map2.charAt(j) == '1') {
					completedMap += "#";
				} else {
					completedMap += " ";
				}
			}
			answer[i] = completedMap;
		}

		return answer;
	}

	public static StringBuffer toBinary(int n) {
		StringBuffer sb = new StringBuffer();
		while (n > 0) {
			sb.append(n % 2);
			n /= 2;
		}
		System.out.println(sb);
		return sb;
	}

	public static void main(String[] args) {
//			6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10]
		int n = 6;
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}
}
