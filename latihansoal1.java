import java.util.Scanner;

public class latihansoal1 {
    public static void  main(String[] args) {
        //Membuat Scanner untuk mengambil input dari user
        Scanner input = new Scanner(System.in);

        //meminta input dari user
        System.out.println("Masukkan angka pertama: ");
        double num1 = input.nextDouble();

        System.out.println("Masukkan angka kedua: ");
        double num2 = input.nextDouble();

        //Menentukan nilai yang paling besar
        if(num1 > num2) {
        System.out.println("Nilai terbesar adalah:" + num2);
       }else if (num2 > num1) {
        System.out.println("Nilai terbesar adalah:"+ num2);
       }else{
        System.out.println("Kesua angka sama besar:");
    }

    //Menutup Scanne
     input.close();

    }
}
