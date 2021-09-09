package FajriSahrulQ_202410101046;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {4,6,8,10,18,39,45,65,78};
        int kunci = 78;
        int hasil = Arrays.binarySearch(arr,kunci);
        if (hasil < 0) {
            System.out.println("angka tidak ditemukan");
        } else {
            System.out.println("angka ditemukan pada index : "+hasil);
        }
    }
}
