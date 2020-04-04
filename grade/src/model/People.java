package model;
import resource.Repository;

public class People {
	
	private int idx;
	private String name;
	private String scoreK;
	private String scoreM;
	private String scoreE;
	private int total;
	private int avg;
	
	public People() {
		this(0,"","","","",0,0);
	}
	
	public People(int idx, String name, String scoreK, String scoreM, String scoreE, int total, int avg){
		this.idx = idx;
		this.name = name;
		this.scoreK = scoreK;
		this.scoreM = scoreM;
		this.scoreE = scoreE;
		this.total = total;
		this.avg = avg;
		}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScoreK() {
		return scoreK;
	}

	public void setScoreK(String scoreK) {
		this.scoreK = scoreK;
	}

	public String getScoreM() {
		return scoreM;
	}

	public void setScoreM(String scoreM) {
		this.scoreM = scoreM;
	}

	public String getScoreE() {
		return scoreE;
	}

	public void setScoreE(String scoreE) {
		this.scoreE = scoreE;
	}

	public int getTotal() {
		Integer.parseInt(scoreK + scoreM + scoreE);
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
		total =  Integer.parseInt(scoreK + scoreM + scoreE);
	}

	public int getAvg() {
		avg = total / 3;
		return avg;
	}

	public void setAvg(int avg) {
		avg = total / 3;
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "[학번: " + idx + ", 이름: " + name + ", 국어: " + scoreK + ", 수학: " + scoreM + ", 영어: "
				+ scoreE + ", 총점:" + total +  ", 평균: " +avg + "]";
		


	
	

}
	
}
