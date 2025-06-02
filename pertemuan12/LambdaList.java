import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mhslist = new ArrayList<>();

        mhslist.add("Budi");
        mhslist.add("Siti");
        mhslist.add("Joko");

        mhslist.forEach((mhs) -> System.out.println(mhs));
    
    }


}
