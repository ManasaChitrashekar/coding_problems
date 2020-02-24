package hashTable;

/**
 * [[REPLACE WITH SHORT FILE DESC AND UPDATE WITH ADDITIONAL AUTHORS IF APPLICABLE]]
 * <p/>
 * Created on Feb 24, 2020
 * <br/>
 * Copyright 2020 Cedar CX Technologies
 * <br/>
 *
 * @author mchitrashekar
 */
public class HashTable {
    private static int INITIAL_SIZE = 8;
    private static Bucket[] bucketList = new Bucket[INITIAL_SIZE];

    private static void add(Bucket bucket) {
        // STEP ONE: Convert the string into a hash using hash function
        int hashCode = calculateHashCode(bucket.key);
        // STEP TWO: Get the position of the bucket in which we should insert our hashedValue by simply
        int position = hashCode % INITIAL_SIZE;
        //this is needed for custom hashcode implementation as hashcode can sometime return negative values
        position = Math.abs(position);
        // STEP THREE: INSERT THE VALUE IN THE CORRECT POSITION( If the value already exists, do not add it)
        if (bucketList[position] == null)
            bucketList[position] = bucket;
        else {
            Bucket tempBucket = bucketList[position];
            while (tempBucket.next != null) {
                tempBucket = tempBucket.next;
            }
            tempBucket.next = bucket;
        }
    }

    private static void retrieve(String key) {
        // Step one: calculate hashcode
        int hashCode = calculateHashCode(key);
        // STEP two: calculate position
        int position = hashCode % INITIAL_SIZE;
        position = Math.abs(position);
        // STEP THREE: Retrieve the value
        if (bucketList[position] != null) {
            Bucket tmp = bucketList[position];
            while (tmp!= null) {
                System.out.println(tmp.value);
                tmp = tmp.next;
            }
        }
        else
        {
            System.out.println("Value not found for the key !!");
        }

    }


    private static int calculateHashCode(String word) {
        // simply use the built-in hashCode function in java
        // or you can implement your own hashing mechanism.
        return word.hashCode();
    }



    public static void main(String[] args) {
        Bucket manasa = new Bucket("manasa", "2840 Montclair ct ");
        Bucket ganesh  = new Bucket("ganesh", "5072 Crowne chase parkway");
        Bucket manasa1 = new Bucket("manasa", "6917 Roswell Road");
        Bucket vignesh = new Bucket("vignesh", "6917 pete beedhi");
        HashTable.add(manasa);
        HashTable.add(ganesh);
        HashTable.add(manasa1);
        HashTable.add(vignesh);
        HashTable.retrieve("");
        HashTable.retrieve("manasa");
        HashTable.retrieve("ganesh");


    }
}
