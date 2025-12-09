public class linkedDokter {
  nodeDokter Head;

  public void initializeDokter(int id, String name, String poli) {
    nodeDokter dokter = new nodeDokter(id, name, poli);
    if (Head == null)
      Head = dokter;
    else {
      nodeDokter current = Head;
      while (current.next != null)
        current = current.next;
      current.next = dokter;
    }
  }

  public void addDokter(nodeDokter dokter) {
    if (Head == null)
      Head = dokter;
    else {
      nodeDokter current = Head;
      while (current.next != null)
        current = current.next;
      current.next = dokter;
    }
  }

  public nodeDokter cariPoli(nodePasien pasien) {
    if (pasien.darurat) {
      nodeDokter current = Head;
      while (current != null) {
        if (current.poli.equalsIgnoreCase("IGD"))
          return current;
        current = current.next;
      }
    }
    if (pasien.penyakit.equalsIgnoreCase("jantung")) {
      nodeDokter current = Head;
      while (current != null) {
        if (current.poli.equalsIgnoreCase("Poli Jantung"))
          return current;
        current = current.next;
      }
    }
    if (pasien.penyakit.equalsIgnoreCase("gigi")) {
      nodeDokter current = Head;
      while (current != null) {
        if (current.poli.equalsIgnoreCase("Poli Gigi"))
          return current;
        current = current.next;
      }
    }
    if (pasien.age < 12) {
      nodeDokter current = Head;
      while (current != null) {
        if (current.poli.equalsIgnoreCase("Poli Anak"))
          return current;
        current = current.next;
      }
    } else if (pasien.age >= 12) {
      nodeDokter current = Head;
      while (current != null) {
        if (current.poli.equalsIgnoreCase("Poli Umum"))
          return current;
        current = current.next;
      }
    }
    return null;
  }

  public void tambahPasien(nodePasien pasien, QueuePasien antrianGlobal, treeRuangan rumahSakit) {
    nodeDokter dokter = cariPoli(pasien);

    if (dokter != null) {
      antrianGlobal.enqueue(pasien);

      int ruanganId;
      if (pasien.darurat) {
        ruanganId = 200;
      } else if (pasien.penyakit.equalsIgnoreCase("jantung")) {
        ruanganId = 100;
      } else if (dokter.poli.equalsIgnoreCase("Poli Anak")) {
        ruanganId = 1;
      } else if (dokter.poli.equalsIgnoreCase("Poli Umum")) {
        ruanganId = 2;
      } else if (dokter.poli.equalsIgnoreCase("Poli Gigi")) {
        ruanganId = 3;
      } else {
        return;
      }

      nodeRuangan ruangTujuan = rumahSakit.search(ruanganId);

      if (ruangTujuan != null) {
        boolean dokterDitemukanDiRuangan = false;
        nodeDokter tempDokter = ruangTujuan.daftarDokter.Head;

        while (tempDokter != null) {
          if (tempDokter.id == dokter.id) {
            tempDokter.linkedPasien.addPasien(pasien);
            dokterDitemukanDiRuangan = true;
            break;
          }
          tempDokter = tempDokter.next;
        }

        if (!dokterDitemukanDiRuangan) {
          nodeDokter uniqueDokter = new nodeDokter(dokter.id, dokter.name, dokter.poli);
          uniqueDokter.linkedPasien.addPasien(pasien);
          ruangTujuan.daftarDokter.addDokter(uniqueDokter);
        }
      }
    }
  }

  public void display() {
    nodeDokter current = Head;
    while (current != null) {
      System.out.println("Dokter: " + current.name + " | Poli: " + current.poli);
      current.linkedPasien.display();
      System.out.println();
      current = current.next;
    }
  }
}