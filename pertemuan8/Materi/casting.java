public class casting {
    public static void main(String[] args){
        // 1
        int output1 = 'a';
        System.out.println("1. int output = 'a'; → " + output1);

        // 2
        double x = 15.5;
        //int output2 = x;      ini gabisa 
        // harusnya begini
        int output2 = (int)x;
        System.out.println("2. int output = (int)x; " + output2);

        // 3
        int y = 25;
        double output3 = y;
        System.out.println("3. double output = y; " + output3);

        // 4
        int z = 78;
        char output4 = (char) z;
        System.out.println("4. char output = (char)z; '" + output4 + "'");

        // 5
        char a = 'a';
        double output5 = a;
        System.out.println("5. double output = a; " + output5);
    }
}
