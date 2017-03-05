import java.util.*;
import java.io.*;

class ujian{
	public static void main(String[] args) {
		
		char Tabungan;
		int isi=0;
		int tabungan;
		String totalbaru;
		int total;

		try{

			//cari file	
			File baca = new File("soal.txt");
			File tulis = new File("jawaban.txt");

			//input file
			Scanner fileinput = new Scanner(baca);
			//tulis file
			FileWriter simpan = new FileWriter(tulis);
			//input ketik
			Scanner ketik = new Scanner(System.in);

			//buat baca
			while(fileinput.hasNextLine()){
				isi = fileinput.nextLine();
				System.out.println(isi);
				jawab = ketik.nextLine();
				simpan.write(jawab + "\n");
			}

			fileinput.close();
			simpan.close();

		}catch(Exception ex){
			ex.printStackTrace();
		}
		

		Scanner fileinput = new Scanner(System.in);

		Scanner ketik=new Scanner (System.in);

		System.out.print ("Masukan Pin Anda : ");
		String pin = ketik.nextLine();

		if (pin.equals(123)) {

			System.out.print("=================");
			System.out.print("1. Cek Saldo");
			System.out.print("2. Menabung ");
			System.out.print("3. Ambil ");
			System.out.print("=================");
			System.out.print("Masukan Pilihan Anda : ");

			int menu = ketik.nextInt();

			String pilih;

			switch(pilih){
				case 1 : pilih=("Cek Saldo");

				try{

					File file=new File("Saldo.txt");
					Scanner fileinput = new Scanner(file);

					while(fileinput.hasNextLine()){
						isi=fileinput.nextInt();
					}
					fileinput.close();


					System.out.print("Saldo anda adalah "+isi );


				}catch(Exception ex){
					ex.printStackTrace();
				}
				break;
				case 2 : pilih=("Menabung");

					try{
						File file=new File("Saldo.txt");
						Scanner fileinput=new Scanner(file);

						while(fileinput.hasNextLine()){
							isi=fileinput.nextInt();
						}
						fileinput.close();
					}catch(Exception ex){
			ex.printStackTrace();
		}
				break;

				case 3:
				break;

			}
		}		
	}
}