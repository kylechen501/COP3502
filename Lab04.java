import java.util.Scanner; //New comment for Lab05 
public class Main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String input = "";
        long decValue = 0;

        System.out.println("Enter a hexadecimal number: ");
        input = scan.next();
        input = input.toUpperCase();

        if(input.charAt(1) == 'X')
        {
            int c = 0;
            for(int i=input.length()-1; i > 1; i--)
            {
                if(input.charAt(i) == 'A')
                {
                    decValue += 10*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'B')
                {
                    decValue += 11*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'C')
                {
                    decValue += 12*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'D')
                {
                    decValue += 13*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'E')
                {
                    decValue += 14*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'F')
                {
                    decValue += 15*(long)(Math.pow(16,c));
                }
                else
                {
                    decValue += Character.getNumericValue(input.charAt(i))*(long)(Math.pow(16,c));
                }
                c++;
            }

        }
        else
        {
            int c = 0;
            for(int i=input.length()-1; i >=0 ; i--)
            {
                if(input.charAt(i) == 'A')
                {
                    decValue += 10*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'B')
                {
                    decValue += 11*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'C')
                {
                    decValue += 12*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'D')
                {
                    decValue += 13*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'E')
                {
                    decValue += 14*(long)(Math.pow(16,c));
                }
                else if(input.charAt(i) == 'F')
                {
                    decValue += 15*(long)(Math.pow(16,c));
                }
                else
                {
                    decValue += Character.getNumericValue(input.charAt(i))*(long)(Math.pow(16,c));
                }
                c++;
            }

        }


        System.out.println("Your number is " + decValue + " in decimal");
    }
}
