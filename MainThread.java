
package helloworldthread;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainThread  implements Runnable{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int [] Array;
        Array = new int[n];
        for(int i = 0; i<n ; i++){
            Random rd = new Random();
            int j = rd.nextInt(100);
            Array[i] = j;
            System.out.println("Phan tu trong mang A la: "+Array[i] + " ");
        }
        HelloWorldThread helloWorldThread = new HelloWorldThread(Array);
        helloWorldThread.start();
        HelloWorldThread2 heloWorldThread2 = new HelloWorldThread2(Array);
        heloWorldThread2.start();
        try {
            helloWorldThread.join();
            heloWorldThread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("tong so chan : " + (helloWorldThread.getDem1() + heloWorldThread2.getDem()));
    }

    @Override
    public void run() {
    }
    
}
