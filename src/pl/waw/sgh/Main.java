package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witam!!!");

        int a = 5;
        Integer aa = 10;

        Double d;
        d = 5d; // Ważne d na końcu

        d = d + a + aa; // OK
        // a = d + a; // NOK; double jest szerszym typem niz Integer

        System.out.println("d = " + d);
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1.concat(s2);

        System.out.println(s3);

        boolean b = false;
        boolean c = true;
        boolean r = b ^ c;
        //AND &&
        //OR ||
        //XOR ^

        // BLOKI

        int j = 8;
        {
            int i = 6;
            System.out.println(i);
            System.out.println(j);
        }

        //System.out.println(i); // błąd bo i jest zmienną lokalną w powyższym bloku
        //System.out.println(j);

        if (r) {
            System.out.println("R jest prawdą");
        } else {
            System.out.println("R jest falszem");
        }

        // switch można użwać również na Stringu

        String s = "AB";

        switch (s) {
            case "AC":
                System.out.println("AC");
                break;
            case "AB":
                System.out.println("AB");
                break;
            case "EF":
                System.out.println("EF");
                break;
            default:
                System.out.println("DEF");
        }

        //int jj = 5;
        int jj = 3;
        int ii = jj > 4 ? 10 : 20; // WARUNEK ? PRAWDA: NIEPRAWDA
        System.out.println(ii);

        System.out.println("****** OPERACJE NA STRINGACH ********");

        String ss1 = "abc";
        //String ss2 = "abc";
        String ss2 = new String("abc");

        //if (ss1 == ss2) {
        if (ss1.equals(ss2)) { // equals porównuje zawartość obiektów, == natomiast porównuje wskaźniki
            System.out.println("Ss1 jest taki sam jak ss2");
        } else {
            System.out.println("ss1 i ss2 są różne");
        }

        String ss = "abcdfrghijklmnr";
        System.out.println(ss.length());
        System.out.println(ss.charAt(2));
        System.out.println(ss.indexOf("f"));

        System.out.println(ss.indexOf("r"));
        System.out.println(ss.lastIndexOf("r"));
        System.out.println(ss.substring(2, 5));


    }
}

