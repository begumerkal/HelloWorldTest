

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

       System.out.println("Helloooo")
    }

}




public class kutu {
 double genislik;
 double yukseklik;
 double derinlik;
 public kutu(double a, double b, double c) {
 this.genislik = a;
 this.yukseklik = b;
 this.derinlik = c
 }
 public double hacimhesapla() {
 double hacim = genislik * yukseklik * derinlik;
 return hacim;
 }
}
public class Main {
 public static void main(String[] args) {
 kutu kutum = new kutu(10,20,15);
 System.out.println("Kutu hacmi :"+ kutum.hacimhesapla());
 }
}