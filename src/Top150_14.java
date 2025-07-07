public class Top150_14 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int st = 0;
        int totalGas= 0;
        int curr = 0;
        for(int i=0;i<gas.length;i++){
            int fuelG = gas[i]-cost[i];
            totalGas +=fuelG;
            curr +=fuelG;
            if(curr<0){
                curr=0;
                st=i+1;
            }
        }
        return totalGas<0?-1:st;
    }
}
