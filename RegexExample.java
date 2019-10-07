import java.util.regex.*;
import java.util.Scanner;

public class RegexExample
{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Gmail Id:- ");
        String email = sc.nextLine();
        Pattern emailRegex = Pattern.compile("^[a-zA-Z][a-zA-Z0-9\\._-]{2,20}(@)(gmail.com)$");
        Matcher match = emailRegex.matcher(email);
        if(match.matches())
        {
            System.out.println("Valid Email");
            
        }
        else{
            System.out.println("In Valid Email Password");
            
        }

        System.out.println("Enter the Password 1 small 1 capital 1 number 1 special charecter(.!@#$%^&*_-) length 8 or max and less 20");
        Boolean Number = false;
        Boolean Small = false;
        Boolean Capital = false;
        Boolean Special = false;
        Boolean length = true;
        String Password = sc.nextLine();

        Pattern passwordRegex = Pattern.compile("[0-9]");
        Matcher matchN = passwordRegex.matcher(Password);
        if(matchN.find())
        {
            Number = true;
        }
        else{
            System.out.println("Number Missing");
        }

        passwordRegex = Pattern.compile("[a-z]");
        Matcher matchS = passwordRegex.matcher(Password);
        if(matchS.find())
        {
            Small = true;
        }
        else{
            System.out.println("Small letter Missing");
        }

        passwordRegex = Pattern.compile("[A-Z]");
        Matcher matchC = passwordRegex.matcher(Password);
        if(matchC.find())
        {
            Capital = true;
        }
        else{
            System.out.println("Capital Letter  Missing");
        }

        passwordRegex = Pattern.compile("[.!@#$%^&*_-]");
        Matcher matchSp = passwordRegex.matcher(Password);
        if(matchSp.find())
        {
            Special = true;
        }
        else{
            System.out.println("Special Charecter Missing");
        }

       if(Password.length() <8 || Password.length()>20)
       {
        System.out.println("length invalid");
        length = false;
       }
       
       if(Number && Special && Small && Capital && length )
       {
        System.out.println("Password Valid");
       }
       else{
           System.out.println("Invalid Password");
           
       }


       System.out.println("Enter the Mobile N0:- ");
        String mobile = sc.nextLine();
        Pattern mobileRegex = Pattern.compile("^[6-9][0-9]{9}$");
        Matcher matchMobile = emailRegex.matcher(email);
        
        if(matchMobile.find())
        {
            System.out.println("valid Mobile number");
            
        }
        else{
            System.out.println("Invalid MObile Number");
        }
        sc.close();
    }
}
