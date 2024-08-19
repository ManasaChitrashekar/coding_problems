package searching;

public class TimeStampTest {
    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("alice", "happy", 1);
        System.out.println(timeMap.get("alice", 1));           // return "happy"
        System.out.println(timeMap.get("alice", 2));           // return "happy", there is no value stored for timestamp 2, thus we return the value at timestamp 1.
        timeMap.set("alice", "sad", 3);    // store the key "alice" and value "sad" along with timestamp = 3.
        System.out.println(timeMap.get("alice", 3));
    }
}
