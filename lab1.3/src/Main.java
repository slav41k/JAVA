import java.util.Scanner;

public class Main
{
    public static boolean validateEmail (final String email) {
        if (email.isEmpty())
            return false;

        String[] parts = email.split("@");

        if (parts.length != 2)
            return false;

        String username = parts[0];
        String mailserverAndDomain = parts[1];

        String[] serverAndDomainParts = mailserverAndDomain.split("\\.");

        if(serverAndDomainParts.length != 2)
            return false;

        String mailserver = serverAndDomainParts[0];
        String domain = serverAndDomainParts[1];

        char[] symbols = username.toCharArray();

        char firstSymbol = symbols[0];
        if (!Character.isLetter(firstSymbol)) {
            return false;
        }

        char lastSymbol = symbols[symbols.length - 1];
        if (!Character.isLetterOrDigit(lastSymbol)) {
            return false;
        }

        for (char symbol : username.toCharArray())
        {
            if ((!Character.isLetterOrDigit(symbol) && symbol != '+' && symbol != '-' && symbol != '_' && symbol != '.') || username.length() > 64)
                return false;
        }

        for (char symbol : mailserver.toCharArray())
        {
            if ((!Character.isLetterOrDigit(symbol) && symbol != '+' && symbol != '-' && symbol != '_') || mailserver.length() > 253)
                return false;
        }

        for (char symbol : domain.toCharArray())
        {
            if ((!Character.isLetter(symbol)) || username.length() > 12)
                return false;
        }


        return true;
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email: ");
        final String email = scan.nextLine();
        validateEmail(email);
        if(!validateEmail(email))
            System.out.println("Email cannot exist");
        else
            System.out.println("Email can exist");
    }
}