
public class Document {
	private String name;
	private double mark;
	private double dohod;
	private String facultet;
	private String facultetenNum;
	private int typeStip;
	
	public Document(String name, double mark, double dohod, String facultet, String facultetenNum, int typeSpip){
		this.dohod = dohod;
		this.name = name;
		this.mark = mark;
		this.facultet = facultet;
		this.facultetenNum = facultetenNum;
		this.typeStip = typeStip;
	}
	
	public int getTypeStip() {
		return typeStip;
	}
	public void setTypeStip(int typeStip) {
		this.typeStip = typeStip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public double getDohod() {
		return dohod;
	}
	public void setDohod(double dohod) {
		this.dohod = dohod;
	}
	public String getFacultet() {
		return facultet;
	}
	public void setFacultet(String facultet) {
		this.facultet = facultet;
	}
	public String getFacultetenNum() {
		return facultetenNum;
	}
	public void setFacultetenNum(String facultetenNum) {
		this.facultetenNum = facultetenNum;
	}
	
	
}
