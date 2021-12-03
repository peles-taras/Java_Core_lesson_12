package ua.lviv.lgs.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		while (true) {
			menu();
			switch (sc.next()) {
			case "1":
				System.out.println("Значення, яке добавляємо:");
				list.add(sc.next());
				System.out.println(list);
				break;
			case "2":
				System.out.println("Доступні елементи: " + list);
				System.out.println("Вкажіть індекс:");
				sc = new Scanner(System.in);
				int deleting = sc.nextInt();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).equals(deleting)) {
						list.remove(deleting);
					}
				}

				try {
					list.remove(deleting);

				} catch (IndexOutOfBoundsException e) {
					System.out.println("Недопустиме значення індексу");
				}
				System.out.println(list);
				break;

			default:
				System.out.println("Помилка");
				break;
			}
		}

	}

	static void menu() {
		System.out.println("Виберіть опцію:");
		System.out.println("1 - додати в кінець списку");
		System.out.println("2 - видалити за індексом");
	}

}
