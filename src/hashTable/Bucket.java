package hashTable;

/**
 * @author mchitrashekar
 */
class Bucket {
    String key ;
    Bucket next;
    String value;


     Bucket(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
