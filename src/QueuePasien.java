public class QueuePasien {
    nodePasien front, rear;
    int nomor = 1;

    public void enqueue(nodePasien pasien) {
        if (front == null) {
            front = rear = pasien;
        } else {
            rear.next = pasien;
            rear = pasien;
        }
    }
    public nodePasien dequeue(nodePasien pasien) {
        if (front == null) {
            System.out.println("Antrian kosong, tidak bisa diperiksa!");
            return null;
        } else {
            System.out.println("\n================ Pemeriksaan ===============");
            System.out.println("Data dengan nama " + front.name + " telah diperiksa");
        }

        nodePasien removed = front;  
        front = front.next;          

        if (front == null) {
            rear = null;
        }

        removed.next = null; 
        return removed;
    }

    public void displayQueue() {
        nodePasien current = front;
        while (current != null) {
            System.out.printf("A%03d | %s | Umur: %d | Penyakit: %s%n", nomor++, current.name, current.age, current.penyakit);
            current = current.next;
        }
        nomor = 1;
        System.out.println("--------------------------------");
    }
}
