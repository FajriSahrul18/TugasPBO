package FajriSahrulQ_202410101046;
import java.util.Arrays;
public class DragonKnight {
    


    public static void main(String[] args) {
        
        //input knight        
        int[] H = { 7,8,4 };
        Arrays.sort(H);
        int y = 0;

        //input dragon
        int[] D = { 5, 4 };
        Arrays.sort(D);
        int indeksD  = 0;
        for (int x : H ){
            if (indeksD < D.length){
                if (x >= D[indeksD]){
                    y += x;
                    indeksD++;
                }
            }
        }
        if (indeksD == D.length){
            System.out.println( y);
        } 
        else {
            System.out.println("Knight Fall");
        }
    }

}

