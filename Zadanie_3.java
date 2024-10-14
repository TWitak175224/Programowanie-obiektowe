public class Zadanie_3 {
    static boolean czyPalindrom (String napis){
        for(int i = 0;i<napis.length()/2;i++)
        {
            if(napis.charAt(i)!=napis.charAt(napis.length()-1-i)){
              return false;
            }
        }
        return true;
    }
    static boolean czyPalindrom (int liczba){
        String zmiana = "";
        for(;liczba>0;liczba=liczba/10)
        {
            zmiana=liczba%10+zmiana;
        }

        return czyPalindrom(zmiana);
    }
    static long silnia(int n){
        long factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
    static int dwumianNewtona(int n, int k){

        long n_fact= silnia(n),k_fact= silnia(k),n_k_fact= silnia(n-k);
        return (int)(n_fact/(k_fact*n_k_fact));
    }
    static void ciagFibbonaciego(int n){
        int suma=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=(i+1)/2;j++){
                suma+=dwumianNewtona(i-j,j-1);
            }
            System.out.print(suma);
            System.out.print(" ");
            suma=0;
        }
    }
    static void trojkatPascala(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(dwumianNewtona(i,j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    System.out.println(czyPalindrom(123321));
    trojkatPascala(9);
    ciagFibbonaciego(20);
}
}
