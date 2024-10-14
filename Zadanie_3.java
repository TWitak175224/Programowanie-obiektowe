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
    static int sumaNaturalnych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma+=i;
        }
        return suma;
    }
    static int sumaParzystych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma+=i*2;
        }
        return suma;
    }
    static int sumaNieparzystych(int n){
        int suma=0;
        for(int i=0;i<n;i++){
            suma+=2*i+1;
        }
        return suma;
    }
    static int sumaKwaNaturalnych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma+=(i*i);
        }
        return suma;
    }
    static int sumaSzeNaturalnych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma+=(i*i*i);
        }
        return suma;
    }
    static double sumaOdwNaturalnych(int n){
        double suma=0;
        for(double i=1;i<=n;i++){
            suma=(1/i)+suma;
        }
        return suma;
    }
    static void podzbiory(int[] tab){
        for(int i =0;i<tab.length;i++){
            for(int j=tab.length-1;j>=i;j--){
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(tab[k]);
                }
                System.out.print("),");

            }
        }
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
    System.out.println();
    ciagFibbonaciego(20);
    System.out.println();
    System.out.println(sumaNaturalnych(3));
    System.out.println(sumaParzystych(3));
    System.out.println(sumaNieparzystych(3));
    System.out.println(sumaKwaNaturalnych(3));
    System.out.println(sumaSzeNaturalnych(3));
    System.out.println(sumaOdwNaturalnych(10));
    int[] tablica={1,2,3,4};
    podzbiory(tablica);
}
}
