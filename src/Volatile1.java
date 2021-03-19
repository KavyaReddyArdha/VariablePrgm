public class Volatile1 {
    private volatile boolean active;
    public void run(){
        active=true;
        while(active){
        }
        System.out.println("System Running");

    }
    public static void main(String args[])throws Exception{
        Volatile v= new Volatile();
        v.start();
        v.Run=false;
        System.out.println("System Running set to false");

        v.stop();
        v.Run=true;
        System.out.println("System Running set to true");
    }

    private void stop() {
        active=false;

    }

    private void start() {
        active=true;

    }
}


