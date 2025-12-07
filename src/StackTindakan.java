public class StackTindakan {
  nodePasien Top;

  public void push(nodePasien pasien) {
    nodePasien tindakan = new nodePasien(pasien.id, pasien.name, pasien.age, pasien.systolic, pasien.diastolic,
        pasien.penyakit, pasien.darurat);

    if (Top == null) {
      Top = tindakan;
    } else {
      tindakan.next = Top;
      Top = tindakan;
    }
  }

  public nodePasien pop() {
    if (Top == null) {
      return null;
    }

    nodePasien tindakanDiundo = Top;
    Top = Top.next;
    tindakanDiundo.next = null;

    return tindakanDiundo;
  }

  public void displayStack() {
    nodePasien current = Top;
    if (current == null) {
      System.out.println("Riwayat tindakan (Stack) kosong.");
      return;
    }
    System.out.println("\n--- Riwayat Tindakan (Stack TOP ke BOTTOM) ---");
    System.out.printf("| %-4s | %-20s | %-15s | %-10s |%n", "ID", "Nama Pasien", "Penyakit", "TD");
    System.out.println("---------------------------------------------------------");

    while (current != null) {
      System.out.printf("| %-4d | %-20s | %-15s | %d/%-6d |%n",
          current.id,
          current.name,
          current.penyakit,
          current.systolic,
          current.diastolic);
      current = current.next;
    }
    System.out.println("---------------------------------------------------------");
  }
}