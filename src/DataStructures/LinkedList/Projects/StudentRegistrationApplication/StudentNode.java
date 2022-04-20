package DataStructures.LinkedList.Projects.StudentRegistrationApplication;

public class StudentNode {
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin; //final notu
    double ortalama;
    String durum;

    StudentNode next;

    public StudentNode(int numara, String ad, String soyad, int vize, int fin) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.fin = fin;

        ortalama = vize *0.4 + fin * 0.6;
        if (ortalama >= 50)
            durum = "Gecti";
        else
            durum = "Kaldi";

        next = null;
    }


}
