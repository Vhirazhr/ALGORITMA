
import java.util.Stack;

/**
 * Praktikum7
 */
public class Praktikum7 {

    int data[];
    int size;
    int top;

    public Praktikum7(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
            System.out.println("Data yang dimasukkan ke dalam stack: " + dt);
        } else {
            System.out.println("Stack sudah penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang dikeluarkan dari stack: " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas stack: " + data[top]);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
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
}