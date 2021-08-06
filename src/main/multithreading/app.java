public class app {
int say;
    public synchronized void increment(){
        System.out.println(say++);
    }
}