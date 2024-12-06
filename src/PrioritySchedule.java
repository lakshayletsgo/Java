import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PrioritySchedule {
    public static void main(String[] args) {
        System.out.println("This is Priority Scheduling in which higher the priority higher its chances to get selected");
        System.out.println("Enter the length of the array:");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[]arrivalTime = new int[length];
        int[]burstTime = new int[length];
        int[]priority = new int[length];
        int[]completionTime = new int[length];

        System.out.println("Enter the arrival time: ");
        Scanner arr = new Scanner(System.in);
        for (int i=0;i<length;i++){
            arrivalTime[i] = arr.nextInt();
        }

        System.out.println("Enter the burst time: ");
        Scanner bur = new Scanner(System.in);
        for (int i=0;i<length;i++){
            burstTime[i] = bur.nextInt();
        }

        System.out.println("Enter the priority: ");
        Scanner prio = new Scanner(System.in);
        for (int i=0;i<length;i++){
            priority[i] = prio.nextInt();
        }
        int maxTemp =0;

        int []tempPri= Arrays.copyOf(priority,length);
        int min=0;
        for (int i=0;i<length;i++){
            if(priority[min]>priority[i]){
                min = i;
            }
//            min = Math.min(min,priority[i]);
        }

        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if(i==0){
                    maxTemp=min;
                    break;
                }
                if(priority[maxTemp]<priority[j]){
                    maxTemp=j;
                }
            }
            int sum = getMax(completionTime);
            completionTime[maxTemp] = sum+burstTime[maxTemp];
            priority[maxTemp]=0;
        }


        HashMap<Integer,Integer> map = new HashMap<>();
        for (int k=0;k<length;k++){
            map.put(completionTime[k],k);
        }
        int[]temp = Arrays.copyOf(completionTime,length);
        Arrays.sort(temp);
        System.out.println("Gannt Chart: ");
        for (int i=0;i<length;i++){
            System.out.print("    "+"P"+(map.get(temp[i])+1)+"  |");
        }

        System.out.println();
        System.out.print("0");
        for (int i=0;i<length;i++){
            System.out.print("       "+temp[i]);
        }


        System.out.println();
        System.out.println("Output Table:");
        System.out.println("Pid\t\tBT\t\tPY\t\tAT\t\tCT\t\tTAT\t\tWT");
        for (int i=0;i<length;i++){
            System.out.println("P"+(i+1)+"\t\t"+burstTime[i]+"\t\t"+tempPri[i]+"\t\t"+arrivalTime[i]+"\t\t"+completionTime[i]+"\t\t"+(completionTime[i]-arrivalTime[i])+"\t\t"+(completionTime[i]-burstTime[i]) );
        }

    }
    public static int getMax(int[]arr){
        int sum = 0;
        for (int a:arr){
            sum = Math.max(a,sum);
        }
        return sum;
    }

}
