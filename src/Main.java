import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double average;
        int gecerliDersSayısı = 0;
        int gecerliNotToplamı = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = scanner.nextInt();

        if (mat >= 0 && mat <= 100) {
            gecerliDersSayısı++;
            gecerliNotToplamı += mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            gecerliDersSayısı++;
            gecerliNotToplamı += fizik;
        }
        if (turkce >= 0 && turkce <= 100) {
            gecerliDersSayısı++;
            gecerliNotToplamı += turkce;
        }
        if (kimya >= 0 && kimya <= 100) {
            gecerliDersSayısı++;
            gecerliNotToplamı += kimya;
        }
        if (muzik >= 0 && muzik <= 100) {
            gecerliDersSayısı++;
            gecerliNotToplamı += muzik;
        }

        average = gecerliNotToplamı / gecerliDersSayısı;

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye terar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, geçtiniz");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
