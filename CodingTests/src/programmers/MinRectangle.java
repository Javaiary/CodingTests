package programmers;

public class MinRectangle {
	public int solution(int[][] sizes) {
		int h= 0;	//최소 가로
		int v= 0;	//최소 세로
		
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][1] >= sizes[i][0]) {
				// 가로, 세로 둘 중 큰 숫자가 앞에 위치하도록 조정
				int temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}
			// 현재 행과 비교하여 둘 중 더 큰 수로 할당 
			h= Math.max(h, sizes[i][0]);
			v= Math.max(v, sizes[i][1]);
		}
        return h*v;
    }
}
