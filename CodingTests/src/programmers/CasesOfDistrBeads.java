package programmers;

import java.math.BigInteger;

public class CasesOfDistrBeads {
	public BigInteger solution(int intBalls,  int intShare) {
		// balls! / ((balls-share)! * share!)
		String strBalls = Integer.toString(intBalls);
		String strShare = Integer.toString(intShare);
		
		BigInteger balls = new BigInteger(strBalls);
		BigInteger share = new BigInteger(strShare);
		
		BigInteger st= balls.subtract(share);
		return factorial(balls).divide((factorial(st).multiply(factorial(share))) );
	}

	public static BigInteger factorial(BigInteger a) {
		if (a.compareTo(BigInteger.ZERO) == 1 ) {
			return factorial(a.subtract(BigInteger.ONE)).multiply(a);
		}
		return BigInteger.ONE;
	}
}
