public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int[] cash=new int[3];
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                cash[0]=cash[0]+1;
            }

            if(bills[i]==10){
                if(cash[0]>0){
                cash[1]=cash[1]+1;
                cash[0]=cash[0]-1;}
                else{
                    return false;
                }
            }

            if(bills[i]==20){
                if(cash[1]>0 && cash[0]>0){
                    cash[1]--;
                    cash[0]--;
                }else if(cash[0]>3){
                    cash[0]=cash[0]-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {5,5,10,10,20};
        System.out.println(lemonadeChange(nums));
    }
}
