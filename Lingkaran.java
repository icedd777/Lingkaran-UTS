public class Lingkaran {
    double phi = 3.141592;

    void hitungLuas(double r) {
        double luas = phi * r * r;

        System.out.println("\n=== Hasil Perhitungan Luas Lingkaran ===");
        System.out.println("Luas (bilangan pecahan) : " + luas);
        System.out.println("Luas (bilangan bulat)   : " + (int)luas);
        System.out.println("Luas (pembulatan)       : " + Math.round(luas));
    }
}
