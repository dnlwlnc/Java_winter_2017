package pl.waw.sgh;

public class Email {
    static char[] specialChars = new char[] {'!', '#', '$', '%', '^', '&', '*', '(', ')', '-', '/', '~', '[', ']'} ;

    public static void main(String[] args) {
        final String EMAIL = "abasdasd_@asaf.pl";
        checkEmail(EMAIL);
    }

    public static void checkEmail(String email) {
        int monkey = email.indexOf('@');

        if (monkey > 0) {
            String address = email.substring(0,monkey);
            String domain = email.substring(monkey + 1, email.length());

            if (checkAddress(address) && checkDomain(domain)){
                System.out.println(" Adres " + email + " jest prawidlowym adresem e-mail.");
            } else {
                System.out.println("Adres " + email + " jest nieprawidłowy");
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
        if (domain.charAt(0) != '.'
                && domain.indexOf('.') > 0
                && domain.charAt(domain.length()-1) != '.'
                && domain.indexOf('@') == 0) {
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