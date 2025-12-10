public class nodeRuangan {
  int id;
  String namaRuangan;
  linkedDokter daftarDokter;
  nodeRuangan left, right, next;

  public nodeRuangan(int id, String namaRuangan) {
    this.id = id;
    this.namaRuangan = namaRuangan;
    this.daftarDokter = new linkedDokter();
    this.left = null;
    this.right = null;
    this.next = null;
  }
}