package queue;

public class QueueDemo {
    public static void main(String args[])
    {
        Queue queueList = new Queue();
        queueList.add(1);
        queueList.add(2);
        queueList.add(3);
        queueList.delete();
        queueList.delete();
        queueList.delete();
        queueList.delete();
    }
}
