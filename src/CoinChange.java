class CoinChange {

   public  int coinChange(int[] coins, int amount) {

        int result = coinChangeUtil( coins,  amount, new int[amount+1]);
        return result;

    }

    private  int coinChangeUtil(int[] coins, int amount, int count[]){
        if (amount ==-1){
            return -1;
        }
        if (amount ==0 )
            return 0;
        if (coins.length==0)
            return 0;
        if (count[amount]!=0)
            return count[amount];
        int mincoin = Integer.MAX_VALUE;
        for(int coinvar : coins){
            if(coinvar <= amount){
                int coin = coinChangeUtil(coins, amount-coinvar,count);
                if(coin!= -1 && coin+1 < mincoin){
                    mincoin = coin+1;
                }
            }
        }
        if (mincoin == Integer.MAX_VALUE){
            mincoin =-1;
        }
        count[amount] = mincoin;
        return mincoin;
    }

}