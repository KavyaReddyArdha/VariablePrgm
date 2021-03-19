public class Volatile {
    boolean Run=true;
    public void run(){
        while(Run){
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

    void stop() {

    }

    void start() {
    }
}

