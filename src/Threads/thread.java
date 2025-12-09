package Threads;

public class thread {
    static void main(){
        Thread t=new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
                try{
                    Thread.sleep(1);
                }
                catch (Exception _){}
            }
        });
        t.start();

        for(int i=0;i<10;i++){
            System.out.print("A ");
            try{
                Thread.sleep(1);
            }
            catch (Exception _){}
        }
    }
}
