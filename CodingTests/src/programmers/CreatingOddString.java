package programmers;

public class CreatingOddString {
	public static String solution(String s) {
        String answer = "";
        String[] removeBlank = s.split(" ",-1);
       
        for (String string : removeBlank) {
			String[] word = string.split("");
			 Boolean tf = true;

			for (int i = 0; i < word.length; i++) {
				if(tf) {
					word[i] = word[i].toUpperCase();
					answer += word[i];
					tf= !tf;
				}else {
				word[i] = word[i].toLowerCase();
				tf = !tf;
				answer += word[i];
				}
			}
			answer += " ";
		}
        return answer.substring(0, answer.length()-1);
    }
}

