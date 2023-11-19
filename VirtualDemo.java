public class VirtualDemo 
{
    public static void main(String[] args) 
    {

                Pegawai[] dataPegawai = new Pegawai[2]; 
                //Polimorpisme
                dataPegawai[0] = new Gaji("Radiatul", "Padang", 3, 200000.00); 
                dataPegawai[1] = new Gaji("Mutmainnah", "Bukittinggi", 2, 250000.00); 
                System.out.println("Memanggil mailCheck menggunakan polimorfisme---");
                for (Pegawai pegawai : dataPegawai) {
                    pegawai.mailCheck(); 
                }
            }
}
        
