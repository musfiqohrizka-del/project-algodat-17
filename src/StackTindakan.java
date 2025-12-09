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

  public nodePasien searchRiwayatById(int idCari) {
    nodePasien current = Top;

    while (current != null) {
      if (current.id == idCari) {
        return current;
      }
      current = current.next;
    }
    return null;
  }

  public void tampilkanHasilPencarianRiwayat(nodePasien pasien, int idCari) {
    if (pasien != null) {
      System.out.println(" ID Pasien " + idCari + " DITEMUKAN dalam Riwayat Tindakan (Stack)!");
      System.out.println("------------------------------------------");
      System.out.printf("  Nama Pasien : %s%n", pasien.name);
      System.out.printf("  Usia        : %d tahun%n", pasien.age);
      System.out.printf("  Penyakit    : %s%n", pasien.penyakit);
      System.out.printf("  Tekanan Darah: %d/%d%n", pasien.systolic, pasien.diastolic);
      System.out.println("------------------------------------------");
    } else {
      System.out.println(" ID Pasien " + idCari + " TIDAK DITEMUKAN dalam Riwayat Tindakan (Stack).");
    }
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

  public void displaySortedLinkedList(String sortBy) {
    if (Top == null) {
      System.out.println("Riwayat tindakan (Stack) kosong.");
      return;
    }

    nodePasien tempHead = null;
    nodePasien currentStack = Top;

    while (currentStack != null) {
      nodePasien newNode = new nodePasien(currentStack.id, currentStack.name, currentStack.age, currentStack.systolic,
      currentStack.diastolic, currentStack.penyakit, currentStack.darurat);
      if (tempHead == null) {
        tempHead = newNode;
      } else {
        newNode.next = tempHead;
        tempHead = newNode;
      }
      currentStack = currentStack.next;
    }


    nodePasien prev = null;
    nodePasien current = tempHead;
    nodePasien next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    tempHead = prev;

    boolean swapped;
    nodePasien last = null;

    if (tempHead == null || tempHead.next == null)
      return;

    do {
      swapped = false;
      current = tempHead;

      while (current.next != last) {
        boolean performSwap = false;

        if (sortBy.equalsIgnoreCase("nama")) {
          if (current.name.compareToIgnoreCase(current.next.name) > 0)
            performSwap = true;
        } else if (sortBy.equalsIgnoreCase("usia")) {
          if (current.age > current.next.age)
            performSwap = true;
        } else {
          System.out.println("Kriteria sorting tidak valid.");
          return;
        }

        if (performSwap) {
          swapData(current, current.next);
          swapped = true;
        }
        current = current.next;
      }
      last = current;
    } while (swapped);

    System.out.println("\n--- Riwayat Tindakan (Diurutkan berdasarkan " + sortBy.toUpperCase() + ") ---");
    System.out.printf("| %-4s | %-20s | %-5s | %-15s | %-10s |%n", "ID", "Nama Pasien", "Usia", "Penyakit", "TD");
    System.out.println("-----------------------------------------------------------------");

    nodePasien temp = tempHead;
    while (temp != null) {
      System.out.printf("| %-4d | %-20s | %-5d | %-15s | %d/%-6d |%n",
          temp.id,
          temp.name,
          temp.age,
          temp.penyakit,
          temp.systolic,
          temp.diastolic);
      temp = temp.next;
    }
    System.out.println("-----------------------------------------------------------------");
  }
}