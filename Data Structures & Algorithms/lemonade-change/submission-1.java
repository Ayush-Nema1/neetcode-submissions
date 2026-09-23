class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0;
        int t = 0;
        int tw = 0;
        for(int i = 0;i<bills.length;i++){
          if(bills[i] == 5){
            f++;
            continue;
          } 

          else if(bills[i] == 10){
            if(f <= 0){
                return false;
            }
            f--;
            t++;
          }

          else{
            if(f > 0 && t > 0){
                f--;
                t--;
            }
            else if(f < 3 ){
                return false;
            }else{
                f = f -3;
            }
          }
        }
        return true;
    }
}