package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		List<String> material = new <String>ArrayList();
		material.add("����");
		material.add("�����������");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		List<Car> c = new ArrayList(getRandomValue(10, 100));

		while (true) {
			menu();
			switch (sc.next()) {

			case "1": {
				sc = new Scanner(System.in);

				c.add(new Car(getRandomValue(20, 80), getRandomValue(10, 20), material.get(getRandomValue(0, 1)),
						getRandomValue(150, 700), getRandomValue(1971, 2021)));

				System.out.println(c);
				break;
			}

			case "2": {
				sc = new Scanner(System.in);

				c.clear();
				c.add(new Car(1, 1, "1", 1, 1));
				System.out.println("��� ��������:");
				System.out.println(c);
			}
				break;

			default:
				System.out.println("\n����� �������");

			}

		}

	}

	public static void menu() {
		System.out.println("������ �����:");
		System.out.println("1: ��� ������� ����� �������");
		System.out.println("2: ��� ������������� ����������  ��`��� ����� ����");
	}

	public static int getRandomValue(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value have to be lower than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;

	}
}