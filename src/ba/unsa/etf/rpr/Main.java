package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    private static int sumaCifara(int n){
        int suma=0;
        do{
            suma=suma+n%10;
            n=n/10;
        }while(n!=0);
        return  suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite cijeli broj: ");

        Scanner ulaz=new Scanner(System.in);
       int  n = ulaz.nextInt();
        System.out.println("Brojevi od 1 do " + n + "su djeljivi sa sumom sbvojih cifara");
       for(int i=1; i<=n; i++){
           int suma=sumaCifara(i);
           if(i%suma==0){
               System.out.print(i+ " ");
           }
       }


    }
}
