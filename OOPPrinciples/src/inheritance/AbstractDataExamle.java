package inheritance;

public class AbstractDataExamle {

	public static void main(String[] args) {
		Lion lion = new Lion(true,150);
		Felidea bigCat1 = lion;
		
		AfricanLion africanLion = new AfricanLion(false,130);
		Felidea bigCat2 = africanLion;
		
		bigCat1.setMale(true);
		bigCat2.setMale(false);

	}

}
