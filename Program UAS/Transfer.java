import java.util.Scanner;
class Transfer{
	void welcome() {
		System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------Selamat datang Di Internet banking bank BRI---------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
	}
    void trf() {
        String rek;
		String nominal;

		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Nomor rekening Tujuan transfer anda:");
		rek= scan.nextLine();

		System.out.print("Jumlah yang akan di transfer:");
		nominal = scan.nextLine();
	}

	
}