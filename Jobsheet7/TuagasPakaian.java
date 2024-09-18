import java.util.Scanner;

public class TuagasPakaian {

    String jenis, warna, merk, ukuran;
    double harga;

    TuagasPakaian(String jenis, String warna, String merk, String ukuran, double harga) {
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    static class Stack {
        int size;
        int top;
        TuagasPakaian data[];

        public Stack(int size) {
            this.size = size;
            data = new TuagasPakaian[size];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == size - 1;
        }

        public void push(TuagasPakaian pkn) {
            if (!isFull()) {
                top++;
                data[top] = pkn;
            } else {
                System.out.println("Isi stack penuh!");
            }
        }

        public void pop() {
            if (!isEmpty()) {
                TuagasPakaian x = data[top];
                top--;
                System.out.println(
                        "Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
            } else {
                System.out.println("Stack masih kosong");
            }
        }

        public void peek() {
            if (!isEmpty()) {
                System.out.println(
                        "Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " "
                                + data[top].ukuran + " " + data[top].harga);
            } else {
                System.out.println("Stack masih kosong");
            }
        }

        public void print() {
            System.out.println("Isi stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
                        + data[i].harga);
            }
            System.out.println("");
        }

        public void clear() {
            if (!isEmpty()) {
                top = -1;
                System.out.println("Stack sudah dikosongkan");
            } else {
                System.out.println("Stack sudah kosong");
            }
        }

        public void getMax() {
            if (!isEmpty()) {
                TuagasPakaian maxPakaian = data[0];
                for (int i = 1; i <= top; i++) {
                    if (data[i].harga > maxPakaian.harga) {
                        maxPakaian = data[i];
                    }
                }
                System.out.println("Data pakaian dengan harga tertinggi:");
                System.out.println(maxPakaian.jenis + " " + maxPakaian.warna + " " + maxPakaian.merk + " "
                        + maxPakaian.ukuran + " " + maxPakaian.harga);
            } else {
                System.out.println("Stack masih kosong");
            }
        }

    }
}
