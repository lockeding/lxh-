package coins;

import java.util.HashMap;

public class Coin {
    private HashMap<Integer ,String>coinnames = new HashMap<Integer, String>();
    //哈希表，一值对一数
    public Coin(){
        //coinnames.put(key,value);
        coinnames.put(1,"penny");
        coinnames.put(10,"dime");
        coinnames.put(25,"quarter");
        coinnames.put(50,"half-dolar");
        coinnames.put(50,"五毛");
        System.out.println(coinnames.keySet().size());//输出数目
        System.out.println(coinnames);
        for (Integer k : coinnames.keySet()) {
            String s = coinnames.get(k);
            System.out.println(s);
        }
        }


    public String getName(int amount){
        if (coinnames.containsKey(amount))
            return coinnames.get(amount);
        else
            return "NOT FOUND";
    }

}
