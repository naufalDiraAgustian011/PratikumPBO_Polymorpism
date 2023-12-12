public class Simulator  {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Raja OP Damanik", 5);
        Mahasiswa mahasiswa1 = new Mahasiswa("Firman", 20);
        Asdos asdos1 = new Asdos("Fairuzikun", 15, 8);

        Dosen dosen2 = new Dosen("Nivotko", 3);
        Mahasiswa mahasiswa2 = new Mahasiswa("Nid to pass this sem", 23);
        Asdos asdos2 = new Asdos("Angel-chan", 18, 46);

        System.out.println(asdos1.getNama() + " adalah seorang asdos dengan jam sibuk " + asdos1.getJamSibuk());
        System.out.println(dosen1.getNama() + " adalah seorang dosen dengan jam sibuk " + dosen1.getJamSibuk());
        System.out.println(asdos2.getNama() + " adalah seorang asdos dengan jam sibuk " + asdos2.getJamSibuk());

        System.out.println(mahasiswa1.getNama() + " adalah seorang mahasiswa dengan jam sibuk " + mahasiswa1.getJamSibuk());
        System.out.println(mahasiswa2.getNama() + " adalah seorang mahasiswa dengan jam sibuk " + mahasiswa2.getJamSibuk());

        System.out.println(dosen2.getNama() + " adalah seorang dosen dengan jam sibuk " + dosen2.getJamSibuk());

        int totalJamSibuk = asdos1.getJamSibuk() + dosen1.getJamSibuk() + asdos2.getJamSibuk() + mahasiswa1.getJamSibuk() + mahasiswa2.getJamSibuk() + dosen2.getJamSibuk();

        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);
    }
}
