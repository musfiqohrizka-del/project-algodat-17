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
}
