
package contiguous.memory.allocation.techniques;
import java.util.Scanner;

/**
 *
 * @author Mostafa Khaled
 **/

public class FirstFit 
{
    private Scanner input = new Scanner(System.in);
    private int[] blockSize = new int[5], processSize = new int[5], temp = new int[5];
    private int countOfProcesses, countOfBlockSize;
    
    public FirstFit()
    {
        System.out.print("Enter the no. of processes : ");
        countOfProcesses = input.nextInt();
        System.out.print("Enter the no. of block : ");
        countOfBlockSize = input.nextInt();
        
        int num = 1;
        for(int i = 0; i < countOfProcesses; i++)
        {
            System.out.print("Enter the process size of process no. " + num + " : ");
            processSize[i] = input.nextInt();
            num += 1;
        }
        
        num = 1;
        for(int i = 0; i < countOfBlockSize; i++)
        {
            System.out.print("Enter the block size no. "  + num +  " : " );
            blockSize[i] = input.nextInt();
            num += 1;
        }
        
        for(int i = 0; i < countOfProcesses; i++)
        {
            temp[i] = -1;
        }
        
        /* First Fit Algorithm */
        for(int i = 0; i < countOfProcesses; i++)
        {
            for(int j = 0; j < countOfBlockSize; j++)
            {
                if(processSize[i] <= blockSize[j] && blockSize[j] != 0)
                {
                    temp[i] = j;
                    blockSize[j] -= processSize[i];
                    break;
                }
            }
        }
        
        num = 1;
        System.out.println("================================");
        System.out.println("Process no.\t  Process Size\t   Block no.");
        for(int i = 0; i < countOfProcesses; i++)
        {
            System.out.print("    " + num + "\t\t\t" + processSize[i] + "\t\t");
            num += 1;
            if(temp[i] != -1)
            {
                System.out.print(temp[i] + 1);
            }
            else
            {
                System.out.print("Not Allocated");
            }
            System.out.println();
        }
    }
    
}
