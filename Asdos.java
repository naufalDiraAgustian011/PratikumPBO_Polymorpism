class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos(String nama, int SKS, int jamNgasdos) {
        super(nama, SKS);
        this.jamNgasdos = jamNgasdos;
    }

    @Override
    public int getJamSibuk() {
        return super.getJamSibuk() + jamNgasdos;
    }
}
