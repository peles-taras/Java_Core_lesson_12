package ua.lviv.lgs.task2;

public enum Monthes {
	JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.FALL), OCTOBER(31, Seasons.FALL), NOVEMBER(30, Seasons.FALL), DECEMBER(31, Seasons.WINTER);

	private int days;
	Seasons seasons;

	Monthes(int days, Seasons seasons) {
		this.days = days;
		this.seasons = seasons;

	}

	public int getDays() {
		return days;
	}

	public Seasons getSeasons() {
		return seasons;
	}

	static void menu() {
		System.out.println("�������� 1 � ��������� �� � ����� �����");
		System.out.println("�������� 2 � ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3 � ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4 � ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5 � ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6 � ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7 � ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8 � ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9 � ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10 � ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}

	
	
}
