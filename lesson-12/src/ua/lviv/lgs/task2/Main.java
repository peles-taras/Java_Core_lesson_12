/**
 * lesson 09
 **/

package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @since java 1.8
 * @version 1.2
 * @author www
 **/

@SuppressWarnings("serial")
public class Main extends Exception {

	/**
	 * @param No input parameters
	 * @exception WrongInputException
	 * @return null
	 * 
	 **/

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		List<Monthes> mas = Arrays.asList(Monthes.values());
		List<Seasons> mas2 = Arrays.asList(Seasons.values());
		Seasons[] mas3 = Seasons.values();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// ��������� �������� ��� ������ � Enums
		while (true) {
			Monthes.menu();

			switch (sc.next()) {

			// �� � ����� �����
			case "1": {
				System.out.println("������ ����� �����");
				sc = new Scanner(System.in);
				String Monthes = sc.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : mas) {
					if (m.name().equals(Monthes)) {
						System.out.println("̳���� ����");
						flag = true;
					}
				}

				if (!flag) {
					String ExceptionMessage = "̳���� �� ����";
					throw new WrongInputException(ExceptionMessage);
				}
				break;
			}

			// �� ����� � ����� � ����� ����
			case "2": {
				System.out.println("������ ����� ���� ����");
				String Monthes2 = sc.next().toUpperCase();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getSeasons().name().equals(Monthes2)) {
						flag2 = true;
					}

				}
				if (flag2) {
					for (Monthes m : mas) {
						if (m.getSeasons().toString().equalsIgnoreCase(Monthes2)) {
							System.out.println("���� � ���� ���� �: " + m);
						}
					}
				}
				if (!flag2) {
					String ExceptionMessage = "���� ���� �� ����";
					throw new WrongInputException(ExceptionMessage);
				}

			}
				break;

			// �� ����� �� ����� ���� ���� ������� ���
			case "3": {
				System.out.println("������ ������� ��� (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() == days) {
						System.out.println("���� ���� ������� ��� �����: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					String ExceptionMessage = "���� ����� � ����� ������� ���";
					throw new WrongInputException(ExceptionMessage);

				}
			}
				break;

			// �� ����� �� ����� ����� ������� ���
			case "4": {
				System.out.println("������ ������� ��� (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() < days) {
						System.out.println("����� ������� ��� ��: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					String ExceptionMessage = "���� ����� � ����� ������� ���";
					throw new WrongInputException(ExceptionMessage);

				}
			}
				break;

			// �� ����� �� ����� ����� ������� ���
			case "5": {
				System.out.println("������ ������� ��� (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() > days) {
						System.out.println("������ ������� ��� ��: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					String ExceptionMessage = "���� ����� � ����� ������� ���";
					throw new WrongInputException(ExceptionMessage);
				}
			}

				break;

			// �������� ���� ����
			case "6": {
				System.out.println("������ ����� ���� ����");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag2 = true;

				if (flag2) {
					Seasons s = Seasons.valueOf(seasons);
					int ordinal = s.ordinal();

					if (ordinal == mas3.length - 1) {
						ordinal = 0;
						System.out.println("�������� ���� ����: " + mas3[ordinal]);
					} else {
						System.out.println("�������� ���� ����: " + mas3[ordinal] + 1);
					}
				}
				if (!flag2) {
					String ExceptionMessage = "���� ���� �� ����";
					throw new WrongInputException(ExceptionMessage);
				}
				break;

			}

//			 ��������� ���� ����
			case "7": {
				System.out.println("������ ����� ���� ����");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag2 = true;

				if (flag2) {
					Seasons s = Seasons.valueOf(seasons);
					int ordinal = s.ordinal();

					if (ordinal == 0) {
						ordinal = mas3.length - 1;
						System.out.println("��������� ���� ����: " + mas3[ordinal]);
					} else {
						System.out.println("��������� ���� ����: " + mas3[ordinal - 1]);
					}
				}
				if (!flag2) {
					String ExceptionMessage = "���� ���� �� ����";
					throw new WrongInputException(ExceptionMessage);
				}
				break;
			}

			// �� ����� �� ����� ����� ������� ���
			case "8": {
				System.out.println("����� ������� ��� �����: ");
				sc = new Scanner(System.in);

				for (Monthes m : mas) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m.name());

					}

				}
				break;
			}

			// �� ����� �� ����� ������� ������� ���
			case "9": {
				System.out.println("������� ������� ��� �����: ");
				sc = new Scanner(System.in);

				for (Monthes m : mas) {
					if (m.getDays() % 2 != 0) {
						System.out.println(m.name());
					}

				}
				break;
			}

			// �����\������� ������� ���
			case "10": {
				System.out.println("������ ����� �����");
				sc = new Scanner(System.in);
				String Monthes2 = sc.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : mas) {
					if (m.name().equals(Monthes2)) {
						flag = true;

					}
				}
				if (flag) {
					for (Monthes m : mas) {
						if (m.name().equals(Monthes2)) {
							if (m.getDays() % 2 == 0) {
								System.out.println("̳���� �� ����� ������� ���");

							} else {
								System.out.println("̳���� �� ������� ������� ���");
							}
						}
					}

				}

				if (!flag) {
					String ExceptionMessage = "���� ������ �����";
					throw new WrongInputException(ExceptionMessage);

				}

				break;

			}

			}
		}

	}

}
