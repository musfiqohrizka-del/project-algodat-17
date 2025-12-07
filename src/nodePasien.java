public class nodePasien {
  int id;
  String name;
  int age;
  int systolic;
  int diastolic;
  String penyakit;
  boolean darurat;
  nodePasien next;

  public nodePasien(int id, String name, int age, int systolic, int diastolic, String penyakit, boolean darurat) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.systolic = systolic;
    this.diastolic = diastolic;
    this.penyakit = penyakit;
    this.darurat = darurat;
    this.next = null;
  }
}