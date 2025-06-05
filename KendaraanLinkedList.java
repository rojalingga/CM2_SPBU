public class KendaraanLinkedList {
    KendaraanNode head;
    KendaraanNode tail;
    int size;

    public KendaraanLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addLast(Kendaraan input) {
        KendaraanNode ndInput = new KendaraanNode(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println(">> Kendaraan masuk ke dalam antrian.");
    }

    public Kendaraan removeFirst() {
        KendaraanNode keluar = head;
        if (isEmpty()) {
            System.out.println("Antrian Kendaraan masih Kosong, tidak ada yang dapat dilayani");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return keluar.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void displayAntrian() {
        if (!isEmpty()) {
            KendaraanNode temp = head;
            System.out.println("-- Antrian Kendaraan --");
            System.out.println("Antrian Kendaraan:");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Kendaraan kosong");
        }
    }
}