
public class kolokwium1 {
    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int[] r) {
        if (m == 1) {
            return ciagArytmetycznyRodzaju1(n, a1, r[1]);
        } else if (m == 2) {
            return ciagArytmetycznyRodzaju2(n, a1, r);
        } else {
            return ciagArytmetycznyRodzaju3(n, a1, r);
        }
    }

    public static int[] ciagArytmetycznyRodzaju1(int n, int a1, int r) {
        int[] zwrotka = new int[n];
        zwrotka[0] = a1;
        for (int i = 1; i < n; i++) {
            a1 += r;
            zwrotka[i] = a1;
        }
        return zwrotka;
    }

    public static int[] ciagArytmetycznyRodzaju2(int n, int a1, int[] r) {
        int[] zwrotka = new int[n];
        zwrotka[0] = a1;
        for (int i = 1; i < n; i++) {

            zwrotka[i] = a1 + i * r[0] + i * i * r[1];
        }
        return zwrotka;
    }

    public static int[] ciagArytmetycznyRodzaju3(int n, int a1, int[] r) {
        int[] zwrotka = new int[n];
        zwrotka[0] = a1;
        for (int i = 1; i < n; i++) {
            zwrotka[i] = a1 + (i) * r[0] + (i * i) * r[1] + (i * i * i) * r[2];
        }
        return zwrotka;
    }

    public static boolean czyCiagArytmetyczny(int[] tab) {
        int r = tab[1] - tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] - tab[i - 1] == r) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean czyCiagArytmetyczny2(int[] tab) {

        int[] przekazanie = new int[tab.length - 1];
        for (int i = 1; i < tab.length; i++) {
            przekazanie[i - 1] = tab[i] - tab[i - 1];
        }
        return czyCiagArytmetyczny(przekazanie);
    }

    public static boolean czyCiagArytmetyczny3(int[] tab) {

        int[] przekazanie = new int[tab.length - 1];
        for (int i = 1; i < tab.length; i++) {
            przekazanie[i - 1] = tab[i] - tab[i - 1];
            ;
        }
        return czyCiagArytmetyczny2(przekazanie);
    }

    public static boolean czyCiagArytmetycznyMrodzaju(int[] tab, int m) {
        if (m == 1) {
            return czyCiagArytmetyczny(tab);
        } else if (m == 2) {
            return czyCiagArytmetyczny2(tab);
        }
        return czyCiagArytmetyczny3(tab);
    }

    public static int podciag(int[] tab) {
        int longest = 0, current = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > tab[i - 1]) {
                current++;
                if (current > longest) {
                    longest = current;
                }
            } else {
                current = 1;
            }
        }
        return longest;
    }
    public static int podciag(int[] tab,int r) {
        int longest = 0, current = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] - tab[i - 1]==r) {
                current++;
                if (current > longest) {
                    longest = current;
                }
            } else {
                current = 1;
            }

        }
        if(longest==1){longest=0;}
        return longest;
    }
    public static void sekwencjaCollatza(int n,int c){

        for(int i=1;i<=n;i++){
            System.out.print(c+", ");
            if(c%2==0){
                c/=2;
            }else{
                c=(c*3)+1;
            }
            if(i%10==0){
                System.out.println();
            }
        }
    }
    public static void minMaxSekwencjaCollatza(int n,int c){
        int min=c,max=c;
        for(int i=1;i<=n;i++){

            if(c%2==0){
                c/=2;
                if(c<min){min=c;}
            }else{
                c=(c*3)+1;
                if(c>max){max=c;}
            }
        }
        System.out.print("\nmin = "+min+"\n max = "+max);
    }

    public static void main(String[] args) {


        int[] tab = {2, 4, 8};
        ciagArytmetycznyRodzajuM(5,1,1, tab);
        ciagArytmetycznyRodzajuM(5,2, 1, tab);
        ciagArytmetycznyRodzajuM(5,3, 1, tab);
        int[] tab2 = {1, 2, 0, 3, 5, 1, 4};
        if (podciag(tab2,1) == 3) {
            System.out.printf("si2\n");
        }
        if (czyCiagArytmetycznyMrodzaju(ciagArytmetycznyRodzajuM(5, 2,1, tab), 2)) {
            System.out.printf("si\n");
        }
        sekwencjaCollatza(2, 129);
        minMaxSekwencjaCollatza(2, 129);
    }
}
