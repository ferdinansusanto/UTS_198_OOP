public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Ferdinan Susanto");
        System.out.println("NIM     : 2100018198");
        System.out.println("Kelas   : D");
        System.out.println("UTS OOP");
        System.out.println("\n");

        Tendik t = new Tendik();
        Dosen d = new Dosen();

        t.setNama("Ferdinan Susanto");
        t.setNip(210909198);
        t.setTglLahir("07-02-1982");
        t.setAlamat("TANGERANG");
        t.setJk("Laki-Laki");
        t.setTahunMasuk(2008);

        d.setNama("Rio Ferdinand");
        d.setNip(210909198);
        d.setJurusan("Informatika");
        d.setNidn(210909198);
        d.setTglLahir("07-02-1988");
        d.setJk("Laki-Laki");
        d.setAlamat("Rio");
        d.setTahunMasuk(2011);

        System.out.println("Nama Tendik             : "+ t.getNama());
        System.out.println("NIP  Tendik             : "+ t.getNip());
        System.out.println("Tanggal Lahir           : "+ t.getTglLahir());
        System.out.println("Jenis Kelamin           : "+ t.getJk());
        System.out.println("Alamat                  : "+ t.getAlamat());
        System.out.println("Tahun masuk             : "+ t.getTahunMasuk());
        System.out.println("Gaji pokok              : "+ t.gajiTotal());
        System.out.println("Jam Lembur              : 20 Jam");
        System.out.println("Bonus lembur(50k/jam)   : "+ t.lembur(20));
        System.out.println("Gaji total              : "+ t.gajiTotal(20));

        System.out.println("\n");
        System.out.println("Nama Dosen              : "+ d.getNama());
        System.out.println("NIDN                    : " + d.getNidn());
        System.out.println("Jurusan                 : " + d.getJurusan());
        System.out.println("NIP  Dosen              : "+ d.getNip());
        System.out.println("Tanggal Lahir           : "+ d.getTglLahir());
        System.out.println("Jenis Kelamin           : "+ d.getJk());
        System.out.println("Alamat                  : "+ d.getAlamat());
        System.out.println("Tahun masuk             : "+ d.getTahunMasuk());
        System.out.println("Gaji pokok              : "+ d.gajiTotal());
        System.out.println("SKS Lebih               : 6 SKS");
        System.out.println("Bonus Gaji (100k/SKS)   : "+ d.mengajarLebih(6));
        System.out.println("Gaji total              : "+ d.gajiTotal(6));

    }
}