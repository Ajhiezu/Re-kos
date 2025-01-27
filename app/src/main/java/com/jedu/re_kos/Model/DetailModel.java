package com.jedu.re_kos.Model;

import com.jedu.re_kos.R; // Pastikan path ini sesuai dengan struktur proyek Anda
import com.jedu.re_kos.Adapter.Fasilitas; // Pastikan kelas Fasilitas sudah didefinisikan

import java.util.ArrayList;
import java.util.List;

public class DetailModel {
    private int id_kos;
    private String nama_kos;
    private String alamat;
    private Double rating_kamar;
    private int kamar_tersedia;
    private int harga_bulan;
    private int harga_minggu;
    private int harga_hari;
    private String waktu_penyewaan;
    private String jenis_fasilitas;
    private String peraturan_kos;
    private String fasilitas_kos;
    private String kos_deskripsi;

    public int getId_pemilik() {
        return id_pemilik;
    }

    public void setId_pemilik(int id_pemilik) {
        this.id_pemilik = id_pemilik;
    }

    private int id_pemilik;

    private int id_kamar;

    public int getId_kamar() {
        return id_kamar;
    }

    public void setId_kamar(int id_kamar) {
        this.id_kamar = id_kamar;
    }

    private int jumlah_rating;

    // Getters dan Setters
    public int getHarga_minggu() {
        return harga_minggu;
    }

    public void setHarga_minggu(int harga_minggu) {
        this.harga_minggu = harga_minggu;
    }

    public int getId_kos() {
        return id_kos;
    }

    public void setId_kos(int id_kos) {
        this.id_kos = id_kos;
    }

    public String getNama_kos() {
        return nama_kos;
    }

    public void setNama_kos(String nama_kos) {
        this.nama_kos = nama_kos;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Double getRating_kamar() {
        return rating_kamar;
    }

    public void setRating_kamar(Double rating_kamar) {
        this.rating_kamar = rating_kamar;
    }

    public int getKamar_tersedia() {
        return kamar_tersedia;
    }

    public void setKamar_tersedia(int kamar_tersedia) {
        this.kamar_tersedia = kamar_tersedia;
    }

    public int getHarga_bulan() {
        return harga_bulan;
    }

    public void setHarga_bulan(int harga_bulan) {
        this.harga_bulan = harga_bulan;
    }

    public int getHarga_hari() {
        return harga_hari;
    }

    public void setHarga_hari(int harga_hari) {
        this.harga_hari = harga_hari;
    }

    public String getWaktu_penyewaan() {
        return waktu_penyewaan;
    }

    public void setWaktu_penyewaan(String waktu_penyewaan) {
        this.waktu_penyewaan = waktu_penyewaan;
    }

    public String getJenis_fasilitas() {
        return jenis_fasilitas;
    }

    public void setJenis_fasilitas(String jenis_fasilitas) {
        this.jenis_fasilitas = jenis_fasilitas;
    }

    public String getPeraturan_kos() {
        return peraturan_kos;
    }

    public void setPeraturan_kos(String peraturan_kos) {
        this.peraturan_kos = peraturan_kos;
    }

    public String getFasilitas_kos() {
        return fasilitas_kos;
    }

    public void setFasilitas_kos(String fasilitas_kos) {
        this.fasilitas_kos = fasilitas_kos;
    }

    public String getKos_deskripsi() {
        return kos_deskripsi;
    }

    public void setKos_deskripsi(String kos_deskripsi) {
        this.kos_deskripsi = kos_deskripsi;
    }

    public int getJumlah_rating() {
        return jumlah_rating;
    }

    public void setJumlah_rating(int jumlah_rating) {
        this.jumlah_rating = jumlah_rating;
    }

    // Metode untuk mendapatkan daftar fasilitas
    public List<Fasilitas> getFasilitasList() {
        List<Fasilitas> fasilitasList = new ArrayList<>();
        if (fasilitas_kos != null && !fasilitas_kos.isEmpty()) {
            String[] fasilitasArray = fasilitas_kos.split(",");
            for (String fasilitas : fasilitasArray) {
                switch (fasilitas.trim().toLowerCase()) {
                    case "wifi":
                        fasilitasList.add(new Fasilitas("WiFi", R.drawable.wifi));
                        break;
                    case "parkiran":
                        fasilitasList.add(new Fasilitas("Parkiran", R.drawable.parkiran));
                        break;
                    case "ac":
                        fasilitasList.add(new Fasilitas("AC", R.drawable.ac));
                        break;
                    case "kamar mandi dalam":
                        fasilitasList.add(new Fasilitas("Kamar Mandi Dalam", R.drawable.kamar_mandi_dalam));
                        break;
                    case "tv":
                        fasilitasList.add(new Fasilitas("TV", R.drawable.tv));
                        break;
                    case "mesin cuci":
                        fasilitasList.add(new Fasilitas("Mesin Cuci", R.drawable.mesin_cuci));
                        break;
                    case "kulkas":
                        fasilitasList.add(new Fasilitas("Kulkas", R.drawable.kulkas));
                        break;
                    case "dapur bersama":
                        fasilitasList.add(new Fasilitas("Dapur Bersama", R.drawable.dapur_bersama));
                        break;
                    case "kamar mandi umum":
                        fasilitasList.add(new Fasilitas("Kamar Mandi Umum", R.drawable.kamar_mandi_umum));
                        break;
                    case "listrik dan air":
                        fasilitasList.add(new Fasilitas("Listrik Dan Air", R.drawable.listrik_dan_air));
                        break;
                    case "kipas":
                        fasilitasList.add(new Fasilitas("Kipas", R.drawable.kipas));
                        break;
                    case "lemari":
                        fasilitasList.add(new Fasilitas("Lemari", R.drawable.lemari));
                        break;
                    case "meja":
                        fasilitasList.add(new Fasilitas("Meja", R.drawable.meja));
                        break;
                    case "kasur":
                        fasilitasList.add(new Fasilitas("Kasur", R.drawable.kasur));
                        break;
                    case "air hangat":
                        fasilitasList.add(new Fasilitas("Air Hangat", R.drawable.air_hangat));
                        break;
                    case "bantal":
                        fasilitasList.add(new Fasilitas("Bantal", R.drawable.bantal));
                        break;

                    // Tambahkan mapping lainnya sesuai kebutuhan
                    default:
                        fasilitasList.add(new Fasilitas(fasilitas.trim(), R.drawable.baseline_bathtub_24));
                        break;
                }
            }
        }
        return fasilitasList;
    }
}
