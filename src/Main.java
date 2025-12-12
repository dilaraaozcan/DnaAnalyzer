import java.util.Scanner;
public class DnaAnalyzer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("DNA dizisini girin: ");
        String dna = input.nextLine();
        dna = dna.trim();

        if(dna.length() == 0){
            System.out.println("Geçersiz DNA! Boş giriş yapıldı. ");
            return;
        }

        int countA = 0;
        int countG = 0;
        int countT = 0;
        int countC = 0;

        boolean gecerli = true;
        char gecersizKarakter = ' ';
        int hataIndex = -1;

        for(int i = 0; i < dna.length(); i++){
            char ch = dna.charAt(i);
            ch = Character.toUpperCase(ch);

            if(ch == 'A'){
                countA++;
            } else if(ch == 'G'){
                countG++;
            } else if(ch == 'T'){
                countT++;
            } else if(ch == 'C'){
                countC++;
            } else {
                gecerli = false;
                gecersizKarakter = ch;
                hataIndex = i;
                break;
            }
        }

        if(!gecerli){
            System.out.println("Geçersiz DNA dizisi.");
            System.out.println("Geçersiz karakter: " + gecersizKarakter);
            System.out.println("Hata İndeksi: " + hataIndex);
            return;
        }

        System.out.println("\nDNA Dizisi geçerlidir.");
        System.out.println("Toplam Uzunluk: " + dna.length());
        System.out.println("A bazı sayısı: " + countA);
        System.out.println("G bazı sayısı: " + countG);
        System.out.println("T bazı sayısı: " + countT);
        System.out.println("C bazı sayısı: " + countC);

        int maxCount = countA;
        char maxBase = 'A';

        if (countC > maxCount){
            maxCount = countC;
            maxBase = 'C';
        }
        if (countG > maxCount){
            maxCount = countG;
            maxBase = 'G';
        }
        if (countT > maxCount){
            maxCount = countT;
            maxBase = 'T';
        }

        System.out.println("En fazla görülen baz: " + maxBase + " (" + maxCount + " adet)");

        int gcToplam = countG + countC;
        double gcYuzde = (gcToplam * 100.0) / dna.length();

        int atToplam = countA + countT;
        double atYuzde = (atToplam * 100.0) / dna.length();

        System.out.printf("G-C baz içeriği: %.2f%%\n", gcYuzde);
        System.out.printf("A-T baz içeriği: %.2f%%\n", atYuzde);

        input.close();
    }
}
