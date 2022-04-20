package DataStructures.LinkedList.Projects.StudentRegistrationApplication;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secim = -1;

        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        while (secim != 0){
            System.out.println("Kayit Islemi");
            System.out.println("1- yeni kayit");
            System.out.println("2- kayit sil");
            System.out.println("3- kayitlari listele");
            System.out.println("4- en basarili ogrenci bilgileri");
            System.out.println("0- Cikis");
            System.out.print("Seciminiz : ");

            secim = scanner.nextInt();

            if (secim == 1)
                studentList.ekle();
            else if (secim == 2)
                studentList.sil();
            else if (secim == 3)
                studentList.yazdir();
            else if (secim == 4)
                studentList.enBasariliOgrenci();
            else if (secim == 0)
                System.out.println("program sonlandirildi");
            else
                System.out.println("Hatali secim yaptiniz");
        }

    }
}
