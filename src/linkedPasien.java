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
            pasien.darurat
        );

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
            String keteranganDarurat = current.darurat ? " (DARURAT - IGD)" : "";
            System.out.printf("%d. %s | Umur: %d | Penyakit: %s | TD: %d/%d%s%n",
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

    public void sortByName() {
        if (Head == null || Head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            nodePasien current = Head;
            while (current.next != null) {
                if (current.name.compareToIgnoreCase(current.next.name) > 0) {
                    swapData(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void sortByAge() {
        if (Head == null || Head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            nodePasien current = Head;
            while (current.next != null) {
                if (current.age > current.next.age) {
                    swapData(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void displaySortedByName() {
        sortByName();
        System.out.println("\n--- Daftar Pasien (Diurutkan Berdasarkan Nama) ---");
        display();
    }

    public void displaySortedByAge() {
        sortByAge();
        System.out.println("\n--- Daftar Pasien (Diurutkan Berdasarkan Usia) ---");
        display();
    }
}
