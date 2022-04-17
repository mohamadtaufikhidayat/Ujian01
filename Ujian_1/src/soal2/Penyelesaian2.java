/* Andi memiliki sejumlah uang.
 * Dengan uang itu, ia bermaksud membeli sebuah kacamata dan sepotong baju.
 * Jika Andi bermaksud menggunakan uangnya semaksimal mungkin,
 * tentukan berapa uang yang dapat Andi belanjakan.
 * Jika harga kedua barang di luar jangkauan Andi,
 * keluarkan pesan "Dana tidak mencukupi".
 * 
 * Input:
 * 1 integer(jumlah uang Andi)
 * 2 baris array berisi 3 data harga kacamata dan baju
 */

package soal2;

import java.util.Arrays;
import java.util.Scanner;

public class Penyelesaian2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] kacamata = new int[3];
		int[] baju = new int[3];
		int[] kodek = new int[9];
		int[] kodeb = new int[9];
		Integer[] total = new Integer[9];
		int k = 0;

		int hasilk = 0;
		int hasilb = 0;
		int hasilt = 0;

		System.out.print("Masukkan jumlah duit Andi: ");
		int duit = input.nextInt();

		for (int i = 0; i < 3; i++) {
			System.out.println("Masukkan daftar harga kacamata " + (i + 1) + " : ");
			kacamata[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(kacamata));
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				k++;
			}
			kodek[i] = k;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Masukkan daftar harga baju " + (i + 1) + " : ");
			baju[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(baju));
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				k = 1;
			}
			kodeb[i] = k++;
		}

		k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				total[k] = kacamata[i] + baju[j];
				k++;
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (total[i] > total[j]) {
					int tukar = total[i];
					total[i] = total[j];
					total[j] = tukar;

					tukar = kodek[i];
					kodek[i] = kodek[j];
					kodek[j] = tukar;

					tukar = kodeb[i];
					kodeb[i] = kodeb[j];
					kodeb[j] = tukar;
				}
			}
		}
		System.out.println(Arrays.toString(kodek));
		System.out.println(Arrays.toString(kodeb));
		System.out.println(Arrays.toString(total));

		for (k = 0; k < 9; k++) {
			if (total[k] < duit) {
				hasilk = kodek[k];
				hasilb = kodeb[k];
				hasilt = total[k];
			}
		}
		System.out.println(
				" Rekomendasi: Kacamata " + hasilk + " dan Baju " + hasilb + " dengan Total Belanja: " + hasilt);
		input.close();
	}

}
