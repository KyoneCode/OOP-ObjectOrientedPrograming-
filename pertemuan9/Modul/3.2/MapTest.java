/**
 * File : MapTest.java
 * Nama : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi : Contoh penggunaan Map
 */
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        // mengambil elemen pertama
        System.out.println(map.get(1));

        // mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
    }
}
