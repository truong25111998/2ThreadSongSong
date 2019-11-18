/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldthread;

import java.util.logging.Level;
import java.util.logging.Logger;


public class HelloWorldThread extends Thread{
        
    private int [] array;
    private int dem1 = 0;
    
    public HelloWorldThread (int [] Array){
        this.array = Array;
    }

    public int getDem1() {
        return dem1;
    }
    
   

    @Override
    public void run(){
        for(int i = 0; i<array.length/2 ; i++){
            if(array[i] % 2 == 0){
                dem1 ++;
                System.out.println("So chan cua Thread 1 la: " + array[i]);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(HelloWorldThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class HelloWorldThread2 extends Thread{
        private int[] array;
        private int dem = 0;
        
        public HelloWorldThread2(int [] Array){
            this.array = Array;
        }

        public int getDem() {
            return dem;
        }
        @Override
        public void run(){
        for(int i = array.length - 1; i> array.length/2 + 1; i--){
            if(array[i] % 2 == 0){
                dem ++;
                System.out.println("So chan cua Thread 2 la: " + array[i]);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(HelloWorldThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        
    }
    
    

