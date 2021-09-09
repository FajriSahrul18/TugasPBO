package FajriSahrulQ_202410101046;
import java.util.Scanner;

public class BilanganPrima {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int Angka, cek = 0;

        System.out.println("Menentukan Bilangan Prima Atau Bukan");
        System.out.print("Masukkan angka : ");
        Angka = input.nextInt();
    
        System.out.println("---------------------------------------");
        for (int x = 2; x<=Angka; x++) {
            if (Angka%x==0) {
                cek++;
            }
        }
        if (cek == 1) {
            System.out.println("Angka "+Angka+" Adalah Bilangan prima");
        }
        else {
            System.out.println("Angka "+Angka+" Adalah Bukan Bilangan Prima");
        }
    }
}


