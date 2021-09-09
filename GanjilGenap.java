package FajriSahrulQ_202410101046;

public class GanjilGenap {
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 123124235, 4364123, 5436236, 263464585, 295803463, 1382460938, 628950735,
        328947, 5, 4566, 7, 8, 9, 10};
    System.out.println("Menentukan bilangan Ganjil dan Genap pada Array");
    System.out.print("Bilangan Genap : ");
    for(int i=0; i<arr.length; i++) {
        if(arr[i]% 2 == 0) {
            System.out.print(arr[i] + ", ");
        }
    }
    System.out.println("");
    System.out.print("Bilangan Ganjil : ");
    for(int i=0; i<arr.length; i++) {
        if(arr[i] % 2!=0) {
            System.out.print(arr[i] +", ");
        }
    }
    System.out.println("");
    System.out.println("-------------------------------------------");
}
}
