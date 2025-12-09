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

  private void swapData(nodePasien a, nodePasien b) {
    int tempId = a.id;
    String tempName = a.name;
    int tempAge = a.age;
    int tempSystolic = a.systolic;
    int tempDiastolic = a.diastolic;
    String tempPenyakit = a.penyakit;
    boolean tempDarurat = a.darurat;

    a.id = b.id;
    a.name = b.name;
    a.age = b.age;
    a.systolic = b.systolic;
    a.diastolic = b.diastolic;
    a.penyakit = b.penyakit;
    a.darurat = b.darurat;

    b.id = tempId;
    b.name = tempName;
    b.age = tempAge;
    b.systolic = tempSystolic;
    b.diastolic = tempDiastolic;
    b.penyakit = tempPenyakit;
    b.darurat = tempDarurat;
  }

  public void sortQueueById() {
    if (front == null || front.next == null) {
      return;
    }

    boolean swapped;
    nodePasien current;
    nodePasien last = null;

    do {
      swapped = false;
      current = front;

      while (current.next != last) {
        if (current.id > current.next.id) {
          swapData(current, current.next);
          swapped = true;
        }
        current = current.next;
      }
      last = current;
    } while (swapped);
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