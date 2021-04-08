package day40_exceptions;

public class RunnerCheckedException {

    public static void main(String[] args) throws InvalidEmailIdCheckedException {

        String eMail = "rasit@gomail.com";

            mailDogrula(eMail);
    }

    public static void mailDogrula(String eMail) throws InvalidEmailIdCheckedException {

        if (eMail.contains("@gmail.com") || eMail.contains("@hotmail.com")) {

            System.out.println("Mail adresiniz basarili bir sekilde kayit edilmistir.");

        } else {

            throw new InvalidEmailIdCheckedException("Girdiginiz ifade mail olamaz.");

        }

    }

}
