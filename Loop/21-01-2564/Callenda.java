import java.util.Scanner;
class Callenda
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i = 1 , n = 0 ;
        System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.print("Name day Start : ");
        String name = in.nextLine();       // free input 
        System.out.print("Enter Start num of Satur day : ");
        n = in.nextInt();
        System.out.println("\nSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        
    ///Loop Tab
        for(int j = 1; j <= (7-n);j++)
            {
                System.out.print("\t");
            }
    /// Loop count day
        if(name.equals("SUN") ||name.equals("sun") || n == 7) 
        // Becuase olny Sunday hava bugging 
        {
            for( ;i <= 31 ;i++ )
            {
                System.out.print( i + "\t"); // print day 
                if(i % 7 == 0 ) // cut row
                {
                    System.out.println(); 
                }
            }
        System.out.println(); 
        }
        else //  Use Every Day Except Sunday 
        {
            for( ;i <= 31 ;i++ )
            {
                System.out.print( i + "\t"); // print day 
                if(i % 7 == n ) // cut row
                {
                    System.out.println(); 
                }  
            }
        System.out.println(); 
        } 
     }
 }
