package programmers;

import java.util.ArrayList;

public class MaxAndMin {
    public String solution(String s) {
	    String answer = "";
	    String[] nums =s.split("\\s");
	    
	    
	    //int로 변환해 arrayList 에 담음
	    ArrayList<Integer> intarr = new ArrayList<Integer>();
	    for(String num: nums ) {
	    	intarr.add(Integer.parseInt(num));
	    }
	    
	    //최댓값, 최솟값 구하기
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    //1. 최댓값 최솟값 비교로 풀기
	    for(int intnum : intarr) {
	    	if (intnum > max) {
				max = intnum;
			}
	    	if (intnum < min) {
	    		min = intnum;
	    	}
	    }

	    
	    
	    answer = min +" "+max;
	    return answer;
    }
}
