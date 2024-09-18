
/**
 * BankFakhira10
 */
public class BankFakhira10 {
    class Akun {
        private String nomorRekening;
        private String nama;
        private String phone;
        private String email;
        private double saldo;

        public Akun(String nomorRekening, String nama, String phone, String email, double saldo) {
            this.nomorRekening = nomorRekening;
            this.nama = nama;
            this.phone = phone;
            this.email = email;
            this.saldo = saldo;
        }

        public void tampilkanData() {
            System.out.println("Nomor Rekening: " + nomorRekening);
            System.out.println("Nama: " + nama);
            System.out.println("Nomor Telepon: " + phone);
            System.out.println("Email: " + email);
            System.out.println("Saldo: " + saldo);
        }

        public String getNomorRekening() {
            return nomorRekening;
        }

        public String getNama() {
            return nama;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public double getSaldo() {
            return saldo;
        }

        public Object daftarAkun;
    }
}