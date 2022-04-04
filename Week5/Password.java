public class Password {//Implement quickly

    private String pass;

    public Password(String pass) {
        if (checkPassword(pass)) {
            this.pass = pass;
        } else {
            this.pass = "1a2b3cde";
        }
    }

    private boolean checkPassword(String pass) {
        if (pass.length() != 8 || pass.charAt(0) == 0) {//length 8, can not start with 0
            return false;
        }
        //no two chars are the same
        for (int i = 0; i < pass.length() - 1; i++) {
            for (int j = i+1; j < pass.length(); j++) {
                if (pass.charAt(i) == pass.charAt(j)) {
                    return false;
                }
            }
        }
        int numDigits = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                numDigits++;
            }
        }
        return numDigits == 3;
    }

    public void resetPassword(String pass) {
        if (checkPassword(pass)) {
            this.pass = pass;
        } else {
            System.out.println("Your password is not valid!");
        }
    }

    public boolean login(String pass) {
        return this.pass.equals(pass);
    }
}
