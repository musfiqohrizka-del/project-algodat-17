public class App {
    public static void main(String[] args) {
        // Inisialisasi Struktur Data
        linkedDokter rumahSakitDokter = new linkedDokter();
        QueuePasien antrianGlobal = new QueuePasien();
        treeRuangan rumahSakit = new treeRuangan();
        StackTindakan riwayatTindakan = new StackTindakan();

        // --- Tambah Ruangan ---
        rumahSakit.insert(1, "Poli Anak");
        rumahSakit.insert(2, "Poli Umum");
        rumahSakit.insert(3, "Poli Gigi");
        rumahSakit.insert(100, "Ruang Jantung");
        rumahSakit.insert(200, "Ruang IGD");

        // --- Inisialisasi Dokter (Menggunakan initializeDokter) ---
        rumahSakitDokter.initializeDokter(1, "Dr. Ani", "Poli Anak");
        rumahSakitDokter.initializeDokter(2, "Dr. Budi", "Poli Umum");
        rumahSakitDokter.initializeDokter(3, "Dr. Candra", "Poli Jantung");
        rumahSakitDokter.initializeDokter(4, "Dr. Deni", "IGD");
        rumahSakitDokter.initializeDokter(5, "Dr. Elsa", "Poli Gigi");

        // --- Tambah Pasien (Tanpa Array) ---
        // P1: William Carter (Gigi)
        nodePasien p1 = new nodePasien(1, "William Carter", 25, 118, 76, "gigi", false);
        rumahSakitDokter.tambahPasien(p1, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p1);

        // P2: Sophia Martinez (Anak)
        nodePasien p2 = new nodePasien(2, "Sophia Martinez", 10, 112, 72, "demam", false);
        rumahSakitDokter.tambahPasien(p2, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p2);

        // P3: James Anderson (Jantung)
        nodePasien p3 = new nodePasien(3, "James Anderson", 42, 130, 85, "jantung", false);
        rumahSakitDokter.tambahPasien(p3, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p3);

        // P4: Olivia Walker (Anak)
        nodePasien p4 = new nodePasien(4, "Olivia Walker", 8, 115, 72, "pilek", false);
        rumahSakitDokter.tambahPasien(p4, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p4);

        // P5: Benjamin Scott (Jantung)
        nodePasien p5 = new nodePasien(5, "Benjamin Scott", 54, 140, 90, "jantung", false);
        rumahSakitDokter.tambahPasien(p5, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p5);

        // P6: Mia Robinson (Anak)
        nodePasien p6 = new nodePasien(6, "Mia Robinson", 5, 110, 70, "demam", false);
        rumahSakitDokter.tambahPasien(p6, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p6);

        // P7: Noah Thompson (Umum)
        nodePasien p7 = new nodePasien(7, "Noah Thompson", 38, 126, 82, "pilek", false);
        rumahSakitDokter.tambahPasien(p7, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p7);

        // P8: Harper Lewis (Jantung)
        nodePasien p8 = new nodePasien(8, "Harper Lewis", 46, 135, 88, "jantung", false);
        rumahSakitDokter.tambahPasien(p8, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p8);

        // P9: Lucas White (Jantung)
        nodePasien p9 = new nodePasien(9, "Lucas White", 50, 145, 92, "jantung", false);
        rumahSakitDokter.tambahPasien(p9, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p9);

        // P10: Amelia Clark (Gigi)
        nodePasien p10 = new nodePasien(10, "Amelia Clark", 31, 120, 78, "gigi", false);
        rumahSakitDokter.tambahPasien(p10, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p10);

        // P11: Elijah Turner (Jantung)
        nodePasien p11 = new nodePasien(11, "Elijah Turner", 60, 150, 95, "jantung", false);
        rumahSakitDokter.tambahPasien(p11, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p11);

        // P12: Charlotte Hall (Umum)
        nodePasien p12 = new nodePasien(12, "Charlotte Hall", 23, 117, 75, "demam", false);
        rumahSakitDokter.tambahPasien(p12, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p12);

        // P13: Liam King (Umum)
        nodePasien p13 = new nodePasien(13, "Liam King", 27, 121, 79, "pilek", false);
        rumahSakitDokter.tambahPasien(p13, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p13);

        // P14: Evelyn Adams (Jantung)
        nodePasien p14 = new nodePasien(14, "Evelyn Adams", 44, 134, 86, "jantung", false);
        rumahSakitDokter.tambahPasien(p14, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p14);

        // P15: Mason Wright (Umum)
        nodePasien p15 = new nodePasien(15, "Mason Wright", 36, 125, 81, "demam", false);
        rumahSakitDokter.tambahPasien(p15, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p15);

        // P16: Abigail Nelson (Umum)
        nodePasien p16 = new nodePasien(16, "Abigail Nelson", 40, 129, 84, "pilek", false);
        rumahSakitDokter.tambahPasien(p16, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p16);

        // P17: Henry Baker (Jantung)
        nodePasien p17 = new nodePasien(17, "Henry Baker", 57, 148, 94, "jantung", false);
        rumahSakitDokter.tambahPasien(p17, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p17);

        // P18: Ella Mitchell (Umum)
        nodePasien p18 = new nodePasien(18, "Ella Mitchell", 22, 116, 73, "demam", false);
        rumahSakitDokter.tambahPasien(p18, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p18);

        // P19: Jackson Perez (Jantung)
        nodePasien p19 = new nodePasien(19, "Jackson Perez", 48, 138, 89, "jantung", false);
        rumahSakitDokter.tambahPasien(p19, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p19);

        // P20: Grace Ramirez (Gigi)
        nodePasien p20 = new nodePasien(20, "Grace Ramirez", 34, 124, 80, "gigi", false);
        rumahSakitDokter.tambahPasien(p20, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p20);

        // P21: John Doe (Darurat/IGD)
        nodePasien p21 = new nodePasien(21, "John Doe", 65, 180, 110, "stroke", true);
        rumahSakitDokter.tambahPasien(p21, antrianGlobal, rumahSakit);
        riwayatTindakan.push(p21);

        // --- DEMO UNDO (POP) PASIEN TERAKHIR ---
        riwayatTindakan.pop();

        // --- Tampilkan Output 1: Antrian Global ---
        System.out.println("===== Antrian Semua Pasien =====");
        antrianGlobal.displayQueue();

        // --- Tampilkan Output 2: Daftar Pasien Per Ruangan/Poli (Diperiksa) ---
        System.out.println("\n===== DAFTAR PASIEN PER RUANGAN =====");
        nodeRuangan current = rumahSakit.root;
        while (current != null) {
            System.out.println("=== Ruangan: " + current.namaRuangan + " ===");
            current.daftarDokter.display();
            current = current.next;
        }

        // --- Tampilkan Output 3: Rekapitulasi Pasien ---
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

        // --- Tampilkan Output 4: Riwayat Tindakan (Stack Final Display) ---
        riwayatTindakan.displayStack();
    }
}