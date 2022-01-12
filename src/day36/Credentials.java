package day36;

public class Credentials {

    private String username;
    private String password;


    public Credentials(String username, String password) {
         setUsername(username);
         setPassword(password);
    }


    public boolean isStrongPassWord(){
        boolean isLetter = false;
        boolean isDigit = false;
        boolean isSpecial = false;


        for (int i = 0; i <= password.length()-1; i++) {
            if (Character.isLetter(password.charAt(i))){

                isLetter = true;
            }
            if (Character.isDigit(password.charAt(i))){
                isDigit = true;
            }
            if (!(Character.isDigit(password.charAt(i))&&Character.isLetter(password.charAt(i)))){
                isSpecial = true;
            }

            if (isLetter && isDigit && isSpecial){
                return true;
            }


        }
        return false;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8 || password.contains(" ")) {
           // return;
            System.exit(0);
        }
        if (!isStrongPassWord())
            return;
        this.password = password;
    }





    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                           1. Password MUST be at least have 8 characters long, and should not contain space
                           2. PassWord should at least contain one letter
                           3. Password should at least contain one special characters
                           4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */