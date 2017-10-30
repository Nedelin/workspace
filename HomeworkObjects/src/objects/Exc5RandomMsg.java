package objects;
public class Exc5RandomMsg {

	public static void main(String[] args) {
		String[] frazi = { "Продуктът е отличен.", "Това е страхотен продукт.", "Постоянно ползвам този продукт.",
				"Това е най-добрият продукт от тази категория." };
		String[] sluchki = { "Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.",
				"Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна." };

		String[] autorFirstName = {"Диана", "Петя", "Стела", "Елена", "Катя"};
		String[] autorScondName = {"Иванова", "Петрова", "Кирова"};
		String[] cities = {"София", "Пловдив", "Варна", "Русе", "Бургас"};
		int a = (int) (Math.random()*4);
		int b = (int) (Math.random()*5);
		int c = (int) (Math.random()*5);
		int d = (int) (Math.random()*3);
		int e = (int) (Math.random()*5);
		System.out.println(frazi[a]+sluchki[b]+" == " +autorFirstName[c]+ " "+autorScondName[d]+", " + cities[e]);
	}

}
