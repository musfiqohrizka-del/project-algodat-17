public class nodeRuangan {
  int id;
  String namaRuangan;
  linkedDokter daftarDokter;
  nodeRuangan next;

  public nodeRuangan(int id, String namaRuangan) {
    this.id = id;
    this.namaRuangan = namaRuangan;
    this.daftarDokter = new linkedDokter();
    this.next = null;
  }
}