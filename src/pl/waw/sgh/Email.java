package pl.waw.sgh;

public class Email {
    static char[] specialChars = new char[] {'!', '#', '$', '%', '^', '&', '*', '(', ')', '-', '/', '~', '[', ']'} ;

    public static void main(String[] args) {
        final String EMAIL = "abasdasd@asaf.pl";
        checkEmail(EMAIL);
    }

    public static void checkEmail(String email) {
        int malpa = email.indexOf('@');

        if (malpa > 0) {
            String address = email.substring(0,malpa);
            String domain = email.substring(malpa + 1, email.length());

            if (checkAddress(address) && checkDomain(domain)){
                System.out.println(address + "@" + domain + " jest prawidlowym adresem e-mail");
            } else {
                System.out.println("Adres e-mail jest nieprawidłowy");
            }
        }
    }

    public static boolean checkAddress(String address){
        for (int i=0; i<specialChars.length; i++) {
            if (address.indexOf(specialChars[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDomain(String domain){
        if ((domain.charAt(0) != '.') && domain.indexOf('.') > 0 && domain.charAt(domain.length()-1) != '.') {
            for (int i=0; i<specialChars.length; i++) {
                if (domain.indexOf(specialChars[i]) > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
