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

    static int[] arrInsert(int n,int[] arr, int liczba,boolean poczatek){
        int newarr[]=new int[n+1];
        if (poczatek){
            newarr[0]=liczba;
            for(int i=0;i<n;i++){
                newarr[i+1]=arr[i];
            }
        }
        else{
            for(int i=0;i<n;i++){
                newarr[i]=arr[i];
            }
            newarr[n]=liczba;
        }
        return newarr;
    }
    static int[] wpisywanie(int i){
    }
    static void trojkatPascala(int n) {
        if (n>=1){
            System.out.println(1);
        }
        if (n>=2){
            System.out.println(11);
        }
        if (n>2){
            int[] wiersz = {},poprzedni_wiersz= {1,1},holder={};
            for (int i=0;i<n-2;i++){
                for (int j=0;j<=i;j++){
                    wiersz=arrInsert(poprzedni_wiersz.length,wiersz,poprzedni_wiersz[j]+poprzedni_wiersz[j+1],false);
                }
                arrInsert(wiersz.length,wiersz,1,true);
                arrInsert(wiersz.length,wiersz,1,false);
                poprzedni_wiersz=wiersz;
                wiersz=holder;
                System.out.println(poprzedni_wiersz);
            }
        }
    }
public static void main(String[] args){
    System.out.println(czyPalindrom(123321));
    trojkatPascala(9);
}
}
