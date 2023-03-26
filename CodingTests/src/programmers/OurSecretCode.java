package programmers;

import java.util.ArrayList;

public class OurSecretCode {
	public String solution(String s, String skip, int index) {
		String answer = "";
				// skip에 포함된 문자가 빠진 알파벳 배열 생성
				ArrayList<Character> alphabet = new ArrayList<>();
					for (int j = 0; j < 26; j++) {
						if (!skip.contains(Character.toString(j + 97))) {
							alphabet.add((char) (j + 97));
						}
					}
				for (int i = 0; i < s.length(); i++) {
					int tgtIdx = alphabet.indexOf(s.charAt(i));	// s의 i번째 문자의 알파벳 배열에서의 인덱스값
					//(tgtIdx+index) % alphabet.size() 로 변환된 문자열의 인덱스 값을 얻음
					char converted = (char)alphabet.get((tgtIdx+index) % alphabet.size());
					answer = answer.concat(Character.toString(converted));
				
				}
				return answer;
			
			}
}
