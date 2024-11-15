import java.util.ArrayList;

public class z4 {
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i] = (int) (Math.random() * (maxWartosc - minWartosc + 1)) + minWartosc;
            System.out.println(tablica[i]);
        }
        return tablica;
    }

    public static void wypiszTablice(int[] tab, int m, int n) {
        int k = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                k++;
                if (k < (tab.length)) {
                    System.out.print(tab[k]);

                } else {
                    System.out.print(0);
                }
                System.out.print('\t');


            }
            System.out.println();
        }
    }

    public static int ileNieparzystych(int[] tab) {
        int ile_np = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 1) {
                ile_np++;
            }

        }
        return ile_np;
    }

    public static int ileParzystych(int[] tab) {
        int ile_p = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                ile_p++;
            }

        }
        return ile_p;
    }

    public static int ileDodatnich(int[] tab) {
        int ile_dod = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                ile_dod++;
            }

        }
        return ile_dod;
    }

    public static int ileUjemnych(int[] tab) {
        int ile_uj = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                ile_uj++;
            }

        }
        return ile_uj;
    }

    public static int ileZerowycg(int[] tab) {
        int ile_zer = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                ile_zer++;
            }

        }
        return ile_zer;
    }

    public static int ileMaxymalnych(int[] tab) {
        int ile_max = 0;
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max) {
                ile_max++;
            }

        }
        return ile_max;
    }

    public static int ileMinimalnych(int[] tab) {
        int ile_min = 0;
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == min) {
                ile_min++;
            }

        }
        return ile_min;
    }

    public static int ileUnikalnych(int[] tab) {
        ArrayList<Integer> unikat = new ArrayList<Integer>();
        for (int i = 0; i < tab.length; i++) {
            if (checker(unikat, tab[i])) {
                unikat.add(tab[i]);
            }
        }
        return unikat.size();

    }

    public static boolean checker(ArrayList Al, int lookFor) {
        for (int i = 0; i < Al.size(); i++) {
            if ((int) Al.get(i) == lookFor) {
                return false;
            }
        }
        return true;
    }

    public static int sumaDodatnich(int[] tab) {
        int ile_dod = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                ile_dod += tab[i];
            }

        }
        return ile_dod;
    }

    public static int sumaUjemnych(int[] tab) {
        int ile_uj = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                ile_uj += tab[i];
            }

        }
        return ile_uj;
    }

    public static double sumaOdwrotnych(int[] tab) {
        int ile_uj = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                ile_uj += (1 / tab[i]);

            }

        }
        return ile_uj;
    }

    public static double sredniaHarmoniczna(int[] tab) {
        double sumaOdwrotnosci = sumaOdwrotnych(tab);
        double ile = tab.length;
        double sredniaHarmoniczna = ile / sumaOdwrotnosci;
        return sredniaHarmoniczna;
    }

    public static double sredniaArytmetyczna(int[] tab) {
        int suma = sumaDodatnich(tab) + sumaUjemnych(tab);
        return suma / tab.length;
    }

    public static double sredniaGeometryczna(int[] tab) {
        double iloczyn = 1;
        double ktoraPotega = 0;
        for (int el : tab) {

            iloczyn *= el;
            ktoraPotega++;

        }
        double srednia = 0;
        try {
            srednia = Math.pow(iloczyn, 1 / ktoraPotega);
        } catch (ArithmeticException e) {
            System.out.println("w tabeli są ujemne");
            return 0.0;
        }
        return srednia;
    }

    public static double[] funkcjaWykladnicza(int[] tab, double a) {
        double[] tablica = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tablica[i] = Math.pow(a, tab[i]);
        }
        return tablica;
    }

    public static double[] funkcjaKwadratowa(int[] tab, double a, double b, double c) {
        double[] tablica = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tablica[i] = Math.pow(a * tab[i], 2) + b * tab[i] + c;
        }
        return tablica;
    }

    public static double[] funkcjaLiniowa(int[] tab, double a, double b) {
        double[] tablica = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tablica[i] = a * tab[i] + b;
        }
        return tablica;
    }

    public static void wypiszTablice(double[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            System.out.print(", ");
        }
    }

    public static int[] odwrocTablice(int[] tab, int indexStart, int indexStop) {
        int[] tablicaOdwrocona = new int[tab.length];
        int j = indexStop;
        for (int i = 0; i < tab.length; i++) {
            //tablicaOdwrocona[i]=tab[i];
            if (i == indexStart) {
                while (j >= indexStart) {
                    tablicaOdwrocona[i] = tab[j];
                    i++;
                    j--;
                }
                i--;
            } else tablicaOdwrocona[i] = tab[i];
        }
        return tablicaOdwrocona;
    }

    public static int[] odwrocTablice(int[] tab) {
        int[] tablicaOdwrocona = new int[tab.length];
        for (int i = tab.length - 1, j = 0; i >= 0 && j <= tab.length; i--, j++) {
            tablicaOdwrocona[j] = tab[i];
        }
        return tablicaOdwrocona;
    }

    public static double[] generujZakres(int n, int minWartosc, int maxWartosc) {
        double[] tablica = new double[n];
        tablica[0] = minWartosc;
        tablica[n - 1] = maxWartosc;
        double podzielnik = ((double) (maxWartosc - minWartosc)) / (n - 1);
        for (int i = 1; i < n - 1; i++) {
            tablica[i] = minWartosc + podzielnik * i;
            System.out.println(tablica[i]);
        }
        return tablica;
    }

    public static int najdluzszyCiagUjemnych(int[] tab) {
        // Zmienna `najdluzszyCiag` przechowuje długość najdłuższego ciągu liczb ujemnych
        int najdluzszyCiag = 0;
        // Zmienna `ciagSprawdzany` śledzi aktualnie sprawdzany ciąg liczb ujemnych
        int ciagSprawdzany = 0;


        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {

                ciagSprawdzany++;
                if (ciagSprawdzany > najdluzszyCiag) {

                    najdluzszyCiag = ciagSprawdzany;


                }
            } else {

                ciagSprawdzany = 0;
            }
        }

        return (najdluzszyCiag);
    }

    public static int najdluzszyCiagDodatnich(int[] tab) {
        // Zmienna `najdluzszyCiag` przechowuje długość najdłuższego ciągu liczb ujemnych
        int najdluzszyCiag = 0;
        // Zmienna `ciagSprawdzany` śledzi aktualnie sprawdzany ciąg liczb ujemnych
        int ciagSprawdzany = 0;


        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {

                ciagSprawdzany++;
                if (ciagSprawdzany > najdluzszyCiag) {

                    najdluzszyCiag = ciagSprawdzany;


                }
            } else {

                ciagSprawdzany = 0;
            }
        }

        return (najdluzszyCiag);
    }

    public static int[] funkcjaSignum(int[] tab) {
        int[] tablica = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            ;
            if (tab[i] > 0) tablica[i] = 1;
            if (tab[i] == 0) tablica[i] = 0;
            if (tab[i] < 0) tablica[i] = -1;
        }
        return tablica;
    }

    public static void main(String[] args) {
//        int[]tablica=generujTablice(40, 2, 10);
//        wypiszTablice(tablica,10,20);
        double[] zakres = generujZakres(7, 5, 20);
        wypiszTablice(zakres);
    }
}

