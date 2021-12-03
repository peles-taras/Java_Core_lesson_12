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

		// консольна програма дл€ роботи з Enums
		while (true) {
			Monthes.menu();

			switch (sc.next()) {

			// чи Ї такий м≥с€ць
			case "1": {
				System.out.println("¬вед≥ть назву м≥с€ц€");
				sc = new Scanner(System.in);
				String Monthes = sc.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : mas) {
					if (m.name().equals(Monthes)) {
						System.out.println("ћ≥с€ць ≥снуЇ");
						flag = true;
					}
				}

				if (!flag) {
					String ExceptionMessage = "ћ≥с€ць не ≥снуЇ";
					throw new WrongInputException(ExceptionMessage);
				}
				break;
			}

			// вс≥ м≥с€ц≥ з такою ж порою року
			case "2": {
				System.out.println("¬вед≥ть назву пори року");
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
							System.out.println("“ака ж пора року у: " + m);
						}
					}
				}
				if (!flag2) {
					String ExceptionMessage = "ѕори року не ≥снуЇ";
					throw new WrongInputException(ExceptionMessage);
				}

			}
				break;

			// вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в
			case "3": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() == days) {
						System.out.println("“аку саму к≥льк≥сть дн≥в мають: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					String ExceptionMessage = "ЌемаЇ м≥с€ц€ з такою к≥льк≥стю дн≥в";
					throw new WrongInputException(ExceptionMessage);

				}
			}
				break;

			// вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в
			case "4": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() < days) {
						System.out.println("ћеншу к≥льк≥сть дн≥в маЇ: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					String ExceptionMessage = "ЌемаЇ м≥с€ц€ з такою к≥льк≥стю дн≥в";
					throw new WrongInputException(ExceptionMessage);

				}
			}
				break;

			// вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в
			case "5": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() > days) {
						System.out.println("Ѕ≥льшу к≥льк≥сть дн≥в маЇ: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					String ExceptionMessage = "ЌемаЇ м≥с€ц€ з такою к≥льк≥стю дн≥в";
					throw new WrongInputException(ExceptionMessage);
				}
			}

				break;

			// наступна пора року
			case "6": {
				System.out.println("¬вед≥ть назву пори року");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag2 = true;

				if (flag2) {
					Seasons s = Seasons.valueOf(seasons);
					int ordinal = s.ordinal();

					if (ordinal == mas3.length - 1) {
						ordinal = 0;
						System.out.println("Ќаступна пора року: " + mas3[ordinal]);
					} else {
						System.out.println("Ќаступна пора року: " + mas3[ordinal] + 1);
					}
				}
				if (!flag2) {
					String ExceptionMessage = "ѕори року не ≥снуЇ";
					throw new WrongInputException(ExceptionMessage);
				}
				break;

			}

//			 попередн€ пора року
			case "7": {
				System.out.println("¬вед≥ть назву пори року");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag2 = true;

				if (flag2) {
					Seasons s = Seasons.valueOf(seasons);
					int ordinal = s.ordinal();

					if (ordinal == 0) {
						ordinal = mas3.length - 1;
						System.out.println("ѕопередн€ пора року: " + mas3[ordinal]);
					} else {
						System.out.println("ѕопередн€ пора року: " + mas3[ordinal - 1]);
					}
				}
				if (!flag2) {
					String ExceptionMessage = "ѕори року не ≥снуЇ";
					throw new WrongInputException(ExceptionMessage);
				}
				break;
			}

			// вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в
			case "8": {
				System.out.println("ѕарну к≥льк≥сть дн≥в мають: ");
				sc = new Scanner(System.in);

				for (Monthes m : mas) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m.name());

					}

				}
				break;
			}

			// вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в
			case "9": {
				System.out.println("Ќепарну к≥льк≥сть дн≥в мають: ");
				sc = new Scanner(System.in);

				for (Monthes m : mas) {
					if (m.getDays() % 2 != 0) {
						System.out.println(m.name());
					}

				}
				break;
			}

			// парна\непарна к≥льк≥сть дн≥в
			case "10": {
				System.out.println("¬вед≥ть назву м≥с€ц€");
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
								System.out.println("ћ≥с€ць маЇ парну к≥льк≥сть дн≥в");

							} else {
								System.out.println("ћ≥с€ць маЇ непарну к≥льк≥сть дн≥в");
							}
						}
					}

				}

				if (!flag) {
					String ExceptionMessage = "ЌемаЇ такого м≥с€ц€";
					throw new WrongInputException(ExceptionMessage);

				}

				break;

			}

			}
		}

	}

}
