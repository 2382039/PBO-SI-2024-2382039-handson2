public class Ternaryoperator {
    public static void main(String[] args) {
        int nilaiLulusMinimum = 70;
        int nilaiMahasiswa = 70;
        String hasil = nilaiMahasiswa >= nilaiLulusMinimum ? "Lulus" : "Tidak Lulus";
        if (nilaiMahasiswa >= nilaiLulusMinimum) {
            hasil = "Lulus";
        } else {
            hasil = "Tidak Lulus";
        }
    }
}
