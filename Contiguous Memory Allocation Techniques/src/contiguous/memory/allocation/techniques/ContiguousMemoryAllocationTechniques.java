
package contiguous.memory.allocation.techniques;
import java.util.Scanner;

/**
 *
 * @author Mostafa Khaled
 **/

public class ContiguousMemoryAllocationTechniques 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int choice;
        
        System.out.println("==============Menu==============");
        System.out.println("1.First Fit\n2.Best Fit\n3.Worst Fit");
        System.out.println("================================");
        
        System.out.print("Enter The no. of your choice : ");
        choice = input.nextInt();
        System.out.println("================================");
        
        switch(choice)
        {
            case 1 : FirstFit firstFit = new FirstFit();
            break;
            case 2 : BestFit bestFit = new BestFit();
            break;
            case 3 : WorstFit worstFit = new WorstFit();
            break;
            default : System.err.println("Error, Select one of the menu");
        }
        
    }
    
}
