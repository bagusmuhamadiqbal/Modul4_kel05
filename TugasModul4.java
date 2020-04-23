
package tugasmodul4;
import java.util.Scanner;
public class TugasModul4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       Starlight data = new Starlight();
       String beli;
       int pin, pilih, exit=0;
       do{
           System.out.print("\nApakah anda ingin membeli Starlight Member?");
           System.out.print("Pilihan anda [ya/tidak] : ");
           beli =input.next();
           if (beli.equalsIgnoreCase("ya"))
                {System.out.println("Selamat, Anda berhasil masuk ke menu payment. ");
                 System.out.println("Silahkan Masukkan PIN Passord Anda:");
                 pin = input.nextInt();
                 System.out.println("Silahkan pilih paket pembelian ");
                 System.out.println("[1] Starlight Standar");
                 System.out.println("[2] Starlight Plus");
                 System.out.println("[3] Starlight Season");
                 System.out.println("Masukkan pilihan anda : ");
                pilih = input.nextInt();
                switch(pilih){
            case 1:
                data.hargaStandar();
                break;
            case 2:
                data.hargaPlus();
                break;
            case 3 :
                data.hargaSeason();
                break;
            default:
            System.out.println("Salah Input Angka");
            
            }
           }else if (beli.equalsIgnoreCase("tidak"))
           {
               System.out.println("Terima Kasih");
               exit=1;
           }else {System.out.println("Inputkan YA/TIDAK!");}
       }while(exit==0);
    }
}