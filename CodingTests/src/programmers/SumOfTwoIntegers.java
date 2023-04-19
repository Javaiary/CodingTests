package programmers;

public class SumOfTwoIntegers {
	public double solution(int a, int b) {
		double max = Math.max(a, b);
		double min = Math.min(a, b);

        return (max + min) * ((max - min + 1)/2);
    }
}
