public class array2dimensi {
    public static void main(String[] args){
        String[][] nilaiMahasiswa = {
                {"A","90"},
                {"B","85"},
                {"C","75"}
        };

        for(int i=0; i<= nilaiMahasiswa.length; i++){
            System.out.print("Nilai Huruf : " + nilaiMahasiswa[i][0]);
            System.out.print(" Nilai Angka : " + nilaiMahasiswa[i][1]);
            System.out.println("");
        }
    }
}
