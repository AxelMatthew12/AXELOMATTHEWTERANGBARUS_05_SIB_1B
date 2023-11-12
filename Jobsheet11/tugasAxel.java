package Jobsheet11;
import java.util.*;

public class tugasAxel {
    public static void main(String[] asrgs) {
        // Membuat penyimpanan data untuk atlet-atlet
        Map<String, List<String>> dataAll = new HashMap<>();
        initializeData(dataAll);

        // Menampilkan menu
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Rekapan Data Cabang");
            System.out.println("2. Input Data Atlet Baru");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    lihatRekapan(dataAll);
                    break;
                case 2:
                    inputDataAtlet(dataAll, scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 3);
    }

    private static void initializeData(Map<String, List<String>> dataAll) {
        // Membuat penyimpanan data untuk atlet-atlet
        List<String> dataBadminton = new ArrayList<>();
        Collections.addAll(dataBadminton,
                "Atlet Badminton 1",
                "Atlet Badminton 2",
                "Atlet Badminton 3",
                "Atlet Badminton 4",
                "Atlet Badminton 5"
        );

        List<String> dataTenisMeja = new ArrayList<>();
        Collections.addAll(dataTenisMeja,
                "Atlet Tenis Meja 1",
                "Atlet Tenis Meja 2",
                "Atlet Tenis Meja 3",
                "Atlet Tenis Meja 4",
                "Atlet Tenis Meja 5"
        );

        List<String> dataBasket = new ArrayList<>();
        Collections.addAll(dataBasket,
                "Atlet Basket 1",
                "Atlet Basket 2",
                "Atlet Basket 3",
                "Atlet Basket 4",
                "Atlet Basket 5"
        );

        List<String> dataBolaVoly = new ArrayList<>();
        Collections.addAll(dataBolaVoly,
                "Atlet Bola Voly 1",
                "Atlet Bola Voly 2",
                "Atlet Bola Voly 3",
                "Atlet Bola Voly 4",
                "Atlet Bola Voly 5"
        );

        // Menggabungkan semua data ke dalam satu struktur data
        dataAll.put("Badminton", dataBadminton);
        dataAll.put("Tenis Meja", dataTenisMeja);
        dataAll.put("Basket", dataBasket);
        dataAll.put("Bola Voly", dataBolaVoly);
    }

    private static void lihatRekapan(Map<String, List<String>> dataAll) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan daftar cabang olahraga
        System.out.println("\nDaftar Cabang Olahraga:");
        for (String cabang : dataAll.keySet()) {
            System.out.println("- " + cabang);
        }

        // Meminta pengguna memilih cabang olahraga
        System.out.print("\nPilih cabang olahraga untuk melihat rekapan data: ");
        String selectedCabang = scanner.next();

        // Menampilkan rekapan data cabang yang dipilih
        if (dataAll.containsKey(selectedCabang)) {
            List<String> dataCabang = dataAll.get(selectedCabang);

            System.out.println("\nRekapan Data Cabang " + selectedCabang + ":\n");
            for (int i = 0; i < dataCabang.size(); i++) {
                System.out.println((i + 1) + ". " + dataCabang.get(i));
            }
        } else {
            System.out.println("Cabang olahraga tidak valid.");
        }
    }

    private static void inputDataAtlet(Map<String, List<String>> dataAll, Scanner scanner) {
        // Menampilkan daftar cabang olahraga
        System.out.println("\nDaftar Cabang Olahraga:");
        for (String cabang : dataAll.keySet()) {
            System.out.println("- " + cabang);
        }

        // Meminta pengguna memilih cabang olahraga
        System.out.print("\nPilih cabang olahraga untuk input data atlet: ");
        String selectedCabang = scanner.next();

        // Meminta pengguna memasukkan nama atlet baru
        System.out.print("\nMasukkan nama atlet baru: ");
        String newAtlet = scanner.next();

        // Menyimpan data atlet baru dalam array data cabang yang dipilih (maksimal 5 atlet)
        if (dataAll.containsKey(selectedCabang)) {
            List<String> dataCabang = dataAll.get(selectedCabang);
            if (dataCabang.size() < 5) {
                dataCabang.add(newAtlet);
                System.out.println("Data atlet berhasil disimpan.");
            } else {
                System.out.println("Data atlet sudah mencapai batas maksimal (5 atlet).");
            }
        } else {
            System.out.println("Cabang olahraga tidak valid.");
        }
    }
}
