package objects;
public class Exc5RandomMsg {

	public static void main(String[] args) {
		String[] frazi = { "��������� � �������.", "���� � ��������� �������.", "��������� ������� ���� �������.",
				"���� � ���-������� ������� �� ���� ���������." };
		String[] sluchki = { "���� �� �������� �����.", "����� �� �� �������.", "��� ������� ����.",
				"�� ���� �� ��������, �� ���� �� �������� ���������.", "�������� � ���. �� ��� ����� �������." };

		String[] autorFirstName = {"�����", "����", "�����", "�����", "����"};
		String[] autorScondName = {"�������", "�������", "������"};
		String[] cities = {"�����", "�������", "�����", "����", "������"};
		int a = (int) (Math.random()*4);
		int b = (int) (Math.random()*5);
		int c = (int) (Math.random()*5);
		int d = (int) (Math.random()*3);
		int e = (int) (Math.random()*5);
		System.out.println(frazi[a]+sluchki[b]+" == " +autorFirstName[c]+ " "+autorScondName[d]+", " + cities[e]);
	}

}
