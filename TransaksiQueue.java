public class TransaksiQueue {
    TransaksiPengisian[] data;
    int front;
    int rear;
    int size;
    int max;

    public TransaksiQueue(int max) {
        data = new TransaksiPengisian[max];
        front = rear = size = 0;
        this.max = max; 
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }    

    public void enqueue(TransaksiPengisian dataTransaksi) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            if (rear == data.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }
        data[rear] = dataTransaksi;
        size++;
        System.out.println(">> Transaksi Berhasil dicatat");
    }

    public void getRiwayat() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian.");
            return;
        }
    
        System.out.println("-- Riwayat Transaksi --");
    
        int i = front;
    
        while (true) {
            data[i].tampil();
    
            if (i == rear) break;
    
            i = (i + 1) % max;
        }
    }    
}