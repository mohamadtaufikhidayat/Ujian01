/* n = 7
 * 1 3 5 7 9 11 13
 * 13 11 9 7 5 3 1
 * 
 * n = 9
 * 1 3 5 7 9 11 13 15 17
 * 17 15 13 11 9 7 5 3 1
 */

package soal1;

import java.util.Scanner;

public class Penyelesaian1 {

	public class Penyelesaian1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean coba = true,konfirmasi=true;

		do {
			System.out.print("Masukkan nilai n: ");
			int n = input.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.print((2 * i + 1) + " ");
			}
			System.out.println();
			for (int i = n - 1; i >= 0; i--) {
				System.out.print((2 * i + 1) + " ");
			}
			
			do{// berfungsi supaya jawaban yang falid hanya y atau n selai itu akan mengulang
				System.out.println();
				System.out.print("Ingin mencoba lagi? (Y/N) ");
				String cobalagi = input.next();
				if (cobalagi.equalsIgnoreCase("Y")) {
					coba = true;
					konfirmasi=false;	
				} else if(cobalagi.equalsIgnoreCase("N")) {
					coba = false;
					konfirmasi=false;
				}else{
					konfirmasi=true;
				}
			}while(konfirmasi==true);

		} while (coba == true);
		
		input.close();
		System.out.print("Terima kasih. :)");
	}


}
