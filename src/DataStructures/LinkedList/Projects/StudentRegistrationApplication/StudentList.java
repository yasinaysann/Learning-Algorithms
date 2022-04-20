package DataStructures.LinkedList.Projects.StudentRegistrationApplication;

import java.util.Scanner;

public class StudentList {

    StudentNode head = null;
    StudentNode tail = null;
    StudentNode temp = null;
    StudentNode temp2= null;

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin; //final notu
    double ortalama;
    String durum;

    Scanner scanner = new Scanner(System.in);
    public void ekle(){
        System.out.println("Bilgisayar Bolumune kayit olacak ogrenci bilgilerini girin: ");
        System.out.println("Numara : ");
        numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ad     : ");
        ad = scanner.nextLine();
        System.out.println("Soyad  : ");
        soyad = scanner.nextLine();
        System.out.println("Vize   : ");
        vize = scanner.nextInt();
        System.out.println("Final  : ");
        fin = scanner.nextInt();

        StudentNode studentNode = new StudentNode(numara,ad,soyad,vize,fin);

        if (isEmpty()) {
            head = studentNode;
            tail = studentNode;
            System.out.println("Yapi olustu ilk ogrenci kayit edildi");
        }else {
            studentNode.next = head;
            head = studentNode;
            System.out.println(numara + " numarali ogrenci eklendi");
        }
    }

    public void sil(){
        if (isEmpty()){
            System.out.println("Liste Bos, ogrenci yok");
        }else {
            System.out.println("Silinecek ogrencinin numarasini giriniz: ");
            numara = scanner.nextInt();
            // listede tek kayit varsa
            if (numara == head.numara && head.next == null){
                head = null;
                tail = null;
                System.out.println(numara + " numarali ogrenci silindi, listede kayit bulunamadi");
            // listede birden fazla kayit varsa ama ilk eleman silinecekse
            }else if (numara == head.numara && head.next != null){
                head = head.next;
                System.out.println(numara + " numarali ogrenci silindi");
            }else {
                temp = head;
                temp2 = head;
                while (temp.next != null){
                    if (numara == temp.numara){
                        temp2.next = temp.next;
                        System.out.println(numara + " numarali ogrenci silindi");
                    }
                    temp2 = temp;
                    temp= temp.next;
                }
                // en son node girmeyecegi icin disarida kontrol ediyoruz
                // kuyrugu silme islemi
                if (numara == temp.numara){
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(numara + " numarali ogrenci silindi");
                }
            }

        }
    }

    public void yazdir(){
        if (isEmpty()){
            System.out.println("Liste bos !!!");
        }else {
            temp = head;
            // son dugume kadar dolasacak
            while (temp !=null){
                System.out.println("----------------------------------------------");
                System.out.println(temp.numara + " numarali ogrencinin bilgileri ");
                System.out.println("Ad       : " + temp.ad);
                System.out.println("Soyad    : " + temp.soyad);
                System.out.println("Vize     : " + temp.vize);
                System.out.println("Final    : " + temp.fin);
                System.out.println("Ortalama : " + temp.ortalama);
                System.out.println("Durum    : " + temp.durum);

                System.out.println("----------------------------------------------");

                temp = temp.next;

            }
        }
    }

    public void enBasariliOgrenci(){
        if (isEmpty()){
            System.out.println("Liste bos !!!");
        }else {
            temp = head;
            double buyuk = temp.ortalama;
            // son dugume kadar dolasacak
            while (temp !=null){

                if (buyuk < temp.ortalama){
                    buyuk = temp.ortalama;

                    numara = temp.numara;
                    ad = temp.ad;
                    soyad = temp.soyad;
                    vize = temp.vize;
                    fin = temp.fin;
                    ortalama = temp.fin;
                    durum = temp.durum;
                }

                temp = temp.next;
            }
                System.out.println("----------------------------------------------");
                System.out.println("En basarili ogrencinin bilgileri ");
                System.out.println("Ad       : " + ad);
                System.out.println("Soyad    : " + soyad);
                System.out.println("Vize     : " + vize);
                System.out.println("Final    : " + fin);
                System.out.println("Ortalama : " + ortalama);
                System.out.println("Durum    : " + durum);

                System.out.println("----------------------------------------------");

        }
    }

    private boolean isEmpty(){
        return head == null;
    }
}
