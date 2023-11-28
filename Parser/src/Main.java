import java.io.File;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("lütfan dosyanin adı girin : ");
    String dosyaAdı = scanner.nextLine();

    try {
      File file = new File(dosyaAdı);
      Scanner dosyaScanner = new Scanner(file);

      int satirNumarasi = 0;

      while (dosyaScanner.hasNextLine()) {
        satirNumarasi++;
        String line = dosyaScanner.nextLine().trim();
        AssemblerChecker.checkSyntax(line, satirNumarasi);
      }


    } catch (Exception e) {
      System.out.println("Dosya bulunamadı veya bir hata oluştu.");
    }
  }
}