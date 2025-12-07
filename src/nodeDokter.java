public class nodeDokter {
  int id;
  String name;
  String poli;
  linkedPasien linkedPasien;
  nodeDokter next;

  public nodeDokter(int id, String name, String poli) {
    this.id = id;
    this.name = name;
    this.poli = poli;
    this.linkedPasien = new linkedPasien();
    this.next = null;
  }
}