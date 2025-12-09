public class linkedPasien {
  nodePasien Head;

  public void addPasien(nodePasien pasien) {
    nodePasien newNode = new nodePasien(
        pasien.id,
        pasien.name,
        pasien.age,
        pasien.systolic,
        pasien.diastolic,
        pasien.penyakit,
        pasien.darurat);

    if (Head == null) {
      Head = newNode;
    } else {
      nodePasien current = Head;
      while (current.next != null)
        current = current.next;
      current.next = newNode;
    }
  }

  public void display() {
    nodePasien current = Head;
    int nomorUrut = 1;
    while (current != null) {
      String keteranganDarurat = "";
      if (current.darurat) {
        keteranganDarurat = " (DARURAT - IGD)";
      }
      System.out.printf("%d. %s | Umur: %d | Penyakit: %s | TD: %d/%d %s%n",
          nomorUrut++,
          current.name,
          current.age,
          current.penyakit,
          current.systolic,
          current.diastolic,
          keteranganDarurat);
      current = current.next;
    }
  }
}