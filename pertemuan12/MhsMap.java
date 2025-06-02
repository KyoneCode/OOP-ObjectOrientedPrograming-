import java.util.*;

public class MhsMap {
    public static void main(String[] args) {
        Map<Integer, String> mhsMap = new HashMap<>();
        mhsMap.put(1, "Budi");
        mhsMap.put(2, "Siti");
        mhsMap.put(3, "Joko");

        mhsMap.forEach((nim,nama) -> System.out.println(nim + ": " + nama));
    }
}
