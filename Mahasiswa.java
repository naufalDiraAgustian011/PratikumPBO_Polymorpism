class Mahasiswa extends Elemen {
    protected int SKS;

    public Mahasiswa(String nama, int SKS) {
        super(nama);
        this.SKS = SKS;
    }

    public int getJamSibuk() {
        return SKS * 3;
    }
}
