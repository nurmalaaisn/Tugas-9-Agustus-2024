public class BukuTester {
    public static void main(String[] args) {
        //object dengan constructor parameter
        
        Buku Mala = new Buku(345, "Alster Lake", "Aurie", 2022);
        Buku Alfi = new Buku(412, "Bumi", "Tere Liye", 2014);
        Buku Jeli = new Buku(686, "Malioboro at Midnight", "Skysphire", 2023);
        Buku Kyla = new Buku(167, "Butterflies", "Ale", 2021);
        Buku Ligia = new Buku(832, "Hello", "Tere Liye", 2023);

        System.out.println("Mala Meminjam Buku : ");
        System.out.println("Id = "+Mala.id);
        System.out.println("Judul = "+Mala.judul);
        System.out.println("Pengarang = "+Mala.pengarang);
        System.out.println("Tahun Terbit = "+Mala.tahunTerbit);
        
        System.out.println("Alfi Meminjam Buku : ");
        System.out.println("Id = "+Alfi.id);
        System.out.println("Judul = "+Alfi.judul);
        System.out.println("Pengarang = "+Alfi.pengarang);
        System.out.println("Tahun Terbit = "+Alfi.tahunTerbit);
        
        System.out.println("Jeli Meminjam Buku : ");
        System.out.println("Id = "+Jeli.id);
        System.out.println("Judul = "+Jeli.judul);
        System.out.println("Pengarang = "+Jeli.pengarang);
        System.out.println("Tahun Terbit = "+Jeli.tahunTerbit);
       
        System.out.println("Kyla Meminjam Buku : ");
        System.out.println("Id = "+Kyla.id);
        System.out.println("Judul = "+Kyla.judul);
        System.out.println("Pengarang = "+Kyla.pengarang);
        System.out.println("Tahun Terbit = "+Kyla.tahunTerbit);
        
        System.out.println("Ligia Meminjam Buku : ");
        System.out.println("Id = "+Ligia.id);
        System.out.println("Judul = "+Ligia.judul);
        System.out.println("Pengarang = "+Ligia.pengarang);
        System.out.println("Tahun Terbit = "+Ligia.tahunTerbit);
        


    }
}
