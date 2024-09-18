public class modifikasi {
    private int nilai;
    private int pangkat;

    public modifikasi(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int nilai() {
        return nilai;
    }

    public int Pangkat() {
        return pangkat;
    }

    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    public int pangkatDC() {
        if (pangkat == 0) {
            return 1;
        } else {
            if (pangkat % 2 == 1)
                return (pangkatDC(nilai, pangkat / 2) * pangkatDC(nilai, pangkat / 2) * nilai);
            else
                return (pangkatDC(nilai, pangkat / 2) * pangkatDC(nilai, pangkat / 2));
        }
    }
}
