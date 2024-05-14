
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;


class carpmaExtection extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("İki sayıda çok büyük lütfen kücük sayi girin");
    }
    
}
public class Main {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String islemler ="HESAP MAKİNESİNE HOŞGELDİNİZ\n"
                + "1.Toplama işlemi\n"
                + "2.Çıkarma işlemi\n"
                + "3.Çarpma işlemi\n"
                + "4.Bölme işlemi\n";
        
        
            
            System.out.println(islemler);
            
            System.out.println("Bir adet işlem sayisi giriniz");
            int cevap = input.nextInt();
            
            System.out.println("2 adet sayi giriniz");
            int a=input.nextInt();
            int b=input.nextInt();
            
            try{
                
            switch(cevap){
                case 1:
                    System.out.println("sonuc:"+(a+b));
                    break;
                case 2:
                    System.out.println("sonuc:"+(a-b));
                    break;
                case 3:
                    if(a>10000 && b>10000){
                        throw new carpmaExtection();
                    }
                    System.out.println("sonuc:"+(a*b));
                    break;
                case 4:
                    System.out.println("sonuc:"+(a/b));
                    break;
                 default:
                     System.out.println("hatalı giriş");
                     break;
                }
            }
            
            catch(ArithmeticException e){
                System.out.println("Hiç bir sayi 0 a bölünemez");
            }
          
            catch (carpmaExtection e){
                e.printStackTrace();
            }
    }
}
