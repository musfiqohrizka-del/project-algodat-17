public class App {
    public static void main(String[] args) {
        // 1. Inisialisasi Struktur Data Utama
        linkedDokter rumahSakitDokter = new linkedDokter();
        QueuePasien antrianGlobal = new QueuePasien();
        treeRuangan rumahSakit = new treeRuangan();
        StackTindakan riwayatTindakan = new StackTindakan();

        // 2. Inisialisasi Ruangan & Dokter
        rumahSakit.insert(1, "Poli Anak");
        rumahSakit.insert(2, "Poli Umum");
        rumahSakit.insert(3, "Poli Gigi");
        rumahSakit.insert(100, "Ruang Jantung");
        rumahSakit.insert(200, "Ruang IGD");
        rumahSakitDokter.initializeDokter(1, "Dr. Ani", "Poli Anak");
        rumahSakitDokter.initializeDokter(2, "Dr. Budi", "Poli Umum");
        rumahSakitDokter.initializeDokter(3, "Dr. Candra", "Poli Jantung");
        rumahSakitDokter.initializeDokter(4, "Dr. Deni", "IGD");
        rumahSakitDokter.initializeDokter(5, "Dr. Elsa", "Poli Gigi");

        // 3. Data Pasien dan Alokasi
        nodePasien p1 = new nodePasien(1, "William Carter", 25, 118, 76, "gigi", false);
        rumahSakitDokter.tambahPasien(p1, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p1);
        nodePasien p2 = new nodePasien(2, "Sophia Martinez", 10, 112, 72, "demam", false);
        rumahSakitDokter.tambahPasien(p2, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p2);
        nodePasien p3 = new nodePasien(3, "James Anderson", 42, 130, 85, "jantung", false);
        rumahSakitDokter.tambahPasien(p3, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p3);
        nodePasien p4 = new nodePasien(4, "Olivia Walker", 8, 115, 72, "pilek", false);
        rumahSakitDokter.tambahPasien(p4, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p4);
        nodePasien p5 = new nodePasien(5, "Benjamin Scott", 54, 140, 90, "jantung", false);
        rumahSakitDokter.tambahPasien(p5, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p5);
        nodePasien p6 = new nodePasien(6, "Mia Robinson", 5, 110, 70, "demam", false);
        rumahSakitDokter.tambahPasien(p6, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p6);
        nodePasien p7 = new nodePasien(7, "Noah Thompson", 38, 126, 82, "pilek", false);
        rumahSakitDokter.tambahPasien(p7, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p7);
        nodePasien p8 = new nodePasien(8, "Harper Lewis", 46, 135, 88, "jantung", false);
        rumahSakitDokter.tambahPasien(p8, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p8);
        nodePasien p9 = new nodePasien(9, "Lucas White", 50, 145, 92, "jantung", false);
        rumahSakitDokter.tambahPasien(p9, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p9);
        nodePasien p10 = new nodePasien(10, "Amelia Clark", 31, 120, 78, "gigi", false);
        rumahSakitDokter.tambahPasien(p10, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p10);
        nodePasien p11 = new nodePasien(11, "Elijah Turner", 60, 150, 95, "jantung", false);
        rumahSakitDokter.tambahPasien(p11, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p11);
        nodePasien p12 = new nodePasien(12, "Charlotte Hall", 23, 117, 75, "demam", false);
        rumahSakitDokter.tambahPasien(p12, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p12);
        nodePasien p13 = new nodePasien(13, "Liam King", 27, 121, 79, "pilek", false);
        rumahSakitDokter.tambahPasien(p13, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p13);
        nodePasien p14 = new nodePasien(14, "Evelyn Adams", 44, 134, 86, "jantung", false);
        rumahSakitDokter.tambahPasien(p14, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p14);
        nodePasien p15 = new nodePasien(15, "Mason Wright", 36, 125, 81, "demam", false);
        rumahSakitDokter.tambahPasien(p15, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p15);
        nodePasien p16 = new nodePasien(16, "Abigail Nelson", 40, 129, 84, "pilek", false);
        rumahSakitDokter.tambahPasien(p16, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p16);
        nodePasien p17 = new nodePasien(17, "Henry Baker", 57, 148, 94, "jantung", false);
        rumahSakitDokter.tambahPasien(p17, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p17);
        nodePasien p18 = new nodePasien(18, "Ella Mitchell", 22, 116, 73, "demam", false);
        rumahSakitDokter.tambahPasien(p18, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p18);
        nodePasien p19 = new nodePasien(19, "Jackson Perez", 48, 138, 89, "jantung", false);
        rumahSakitDokter.tambahPasien(p19, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p19);
        nodePasien p20 = new nodePasien(20, "Grace Ramirez", 34, 124, 80, "gigi", false);
        rumahSakitDokter.tambahPasien(p20, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p20);
        nodePasien p21 = new nodePasien(21, "John Doe", 65, 180, 110, "stroke", true);
        rumahSakitDokter.tambahPasien(p21, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p21);
        riwayatTindakan.pop();
        antrianGlobal.sortQueueById();


        System.out.println("\n===== Antrian Semua Pasien (Sudah Diurutkan) =====");
        antrianGlobal.displayQueue();

        System.out.println("\n===== DAFTAR PASIEN PER RUANGAN =====");
        nodeRuangan current = rumahSakit.root;
        while (current != null) {
            System.out.println("=== Ruangan: " + current.namaRuangan + " ===");
            current.daftarDokter.display();
            current = current.next;
        }

        System.out.println("\n===== REKAPITULASI PASIEN PER RUANGAN/POLI =====");
        nodeRuangan rekapCurrent = rumahSakit.root;
        while (rekapCurrent != null) {
            int totalPasienDiRuangan = 0;
            nodeDokter dokterCurrent = rekapCurrent.daftarDokter.Head;

            while (dokterCurrent != null) {
                nodePasien pasienCurrent = dokterCurrent.linkedPasien.Head;
                while (pasienCurrent != null) {
                    totalPasienDiRuangan++;
                    pasienCurrent = pasienCurrent.next;
                }
                dokterCurrent = dokterCurrent.next;
            }

            System.out.printf("Ruangan: %s | Total Pasien: %d%n", rekapCurrent.namaRuangan, totalPasienDiRuangan);
            rekapCurrent = rekapCurrent.next;
        }
        rumahSakit.insert(50, "Ruang Kepala RS (Pusat)"); //root
        rumahSakit.insert(30, "Ruang IGD");       // < 50, masuk Kiri
        rumahSakit.insert(70, "Ruang Poliklinik"); // > 50, masuk Kanan
        rumahSakit.insert(20, "Ruang Parkir");    // < 30, masuk Kiri dari IGD
        rumahSakit.insert(80, "Ruang Bedah");     // > 70, masuk Kanan dari Poli
        rumahSakit.displayTree();

        riwayatTindakan.displayStack();
        riwayatTindakan.displaySortedLinkedList("nama");
        riwayatTindakan.displaySortedLinkedList("usia");
        antrianGlobal.dequeue(p1);
        antrianGlobal.dequeue(p2);
        antrianGlobal.dequeue(p3);
        System.out.println("\n===== Antrian Setelah Pemeriksaan =====");
        antrianGlobal.displayQueue();
        int idCariStackDitemukan = 8;
        int idCariStackTidakAda = 21;

        System.out.println("\n===== 🔎 PENCARIAN PASIEN DENGAN LINEAR SEARCH (RIWAYAT/STACK) =====");

        nodePasien hasilStack1 = riwayatTindakan.searchRiwayatById(idCariStackDitemukan);
        riwayatTindakan.tampilkanHasilPencarianRiwayat(hasilStack1, idCariStackDitemukan); // Dipanggil dari objek Stack

        // Pasien ID 21 (Tidak Ditemukan)
        nodePasien hasilStack2 = riwayatTindakan.searchRiwayatById(idCariStackTidakAda);
        riwayatTindakan.tampilkanHasilPencarianRiwayat(hasilStack2, idCariStackTidakAda); // Dipanggil dari objek Stack
    }
}