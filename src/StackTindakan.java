public class StackTindakan {
    nodePasien Top;

    public void push(nodePasien pasien) {
        nodePasien tindakan = new nodePasien(
            pasien.id, pasien.name, pasien.age,
            pasien.systolic, pasien.diastolic,
            pasien.penyakit, pasien.darurat
        );

        if (Top == null) {
            Top = tindakan;
        } else {
            tindakan.next = Top;
            Top = tindakan;
        }
    }

    public nodePasien pop() {
        if (Top == null) return null;

        nodePasien tindakanDiundo = Top;
        Top = Top.next;
        tindakanDiundo.next = null;

        return tindakanDiundo;
    }

    // Pencarian dalam stack
    public nodePasien searchRiwayatById(int idCari) {
        nodePasien current = Top;

        while (current != null) {
            if (current.id == idCari) return current;
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
        System.out.printf("| %-4s | %-20s | %-15s | %-10s |%n",
                "ID", "Nama Pasien", "Penyakit", "TD");
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


    // swap pointer antar node 
    private nodePasien swapNode(nodePasien head, nodePasien prev, nodePasien current, nodePasien next) {
        current.next = next.next;
        next.next = current;

        if (prev != null) {
            prev.next = next;
        } else {
            head = next; 
        }

        return head;
    }


    // Sorting menggunakan Bubble Sort (swap by node)
    public void displaySortedLinkedList(String sortBy) {
        if (Top == null) {
            System.out.println("Riwayat tindakan (Stack) kosong.");
            return;
        }

        nodePasien tempHead = null;
        nodePasien currentStack = Top;

        // Salin Stack ke LinkedList sementara
        while (currentStack != null) {
            nodePasien newNode = new nodePasien(
                currentStack.id, currentStack.name, currentStack.age,
                currentStack.systolic, currentStack.diastolic,
                currentStack.penyakit, currentStack.darurat
            );

            newNode.next = tempHead;
            tempHead = newNode;

            currentStack = currentStack.next;
        }

        // Balikkan list agar urutan original (BOTTOM → TOP)
        nodePasien prev = null;
        nodePasien current = tempHead;
        nodePasien next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        tempHead = prev; // head akhir dari list yang sudah di-flip

        // Bubble Sort dengan swap node
        boolean swapped;
        nodePasien last = null;

        if (tempHead == null || tempHead.next == null) return;

        do {
            swapped = false;
            current = tempHead;
            prev = null; 

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
                    tempHead = swapNode(tempHead, prev, current, current.next);
                    swapped = true;

                    // update prev setelah swap
                    if (prev == null) {
                        prev = tempHead;
                    } else {
                        prev = prev.next;
                    }

                } else {
                    prev = current;
                    current = current.next;
                }
            }
            last = current;

        } while (swapped);


        System.out.println("\n--- Riwayat Tindakan (Diurutkan berdasarkan "
                + sortBy.toUpperCase() + ") ---");

        System.out.printf("| %-4s | %-20s | %-5s | %-15s | %-10s |%n",
                "ID", "Nama Pasien", "Usia", "Penyakit", "TD");
        System.out.println("-----------------------------------------------------------------");

        nodePasien temp = tempHead;

        while (temp != null) {
            System.out.printf("| %-4d | %-20s | %-5d | %-15s | %d/%-6d |%n",
                    temp.id, temp.name, temp.age, temp.penyakit,
                    temp.systolic, temp.diastolic);
            temp = temp.next;
        }

        System.out.println("-----------------------------------------------------------------");
    }
}
