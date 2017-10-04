package logica.neppo;

import java.util.Scanner;

public class logica1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		Long cont = 0L;
		char atual;

		int i = 0;
		atual = str.charAt(0);
		while (true) {
			if (i >= str.length()) {
				System.out.print(cont + "" + atual);
				break;
			} else {
				if (atual == str.charAt(i)) {
					cont++;
					i++;
				} else {
					System.out.print(cont + "" + atual);
					cont = 0L;
					atual = str.charAt(i);
				}
			}
		}

		sc.close();
	}

}
