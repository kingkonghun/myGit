package ch05;

public class ScoreAverage {

	public static void main(String[] args) {
		//4행 2열
		double score[][]= {{3.3, 3.4},{3.5, 3.6},{3.7, 3.8},{3.9, 4.0}};//1학년 1,2학기 평점...

		double sum=0.0;
		for(int year=0; year<score.length; year++) {//각 학년별로 반복
			for(int term=0; term<score[year].length; term++) {//각 학기별 반복
				sum += score[year][term];//전체 평점 합
			
			}
		}
		int n=score.length;//배열의 행 갯수
		int m=score[0].length;//배열의 열 갯수 2
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
	}

}