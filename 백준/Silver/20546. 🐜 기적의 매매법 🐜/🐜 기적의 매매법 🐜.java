import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        List<Integer> stock= new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<14; i++){
            stock.add(Integer.parseInt(st.nextToken()));
        }

        if(junHyeon(money, stock) > seongMin(money, stock)){
            System.out.println("BNP");
        } else if (junHyeon(money, stock) < seongMin(money, stock)) {
            System.out.println("TIMING");
        }else{
            System.out.println("SAMESAME");
        }

    }

    public static int junHyeon(int money, List<Integer> stock){
        int stockCount= 0;
        for(Integer i : stock){
            if(money >= i){
                stockCount += money/i;
                money = money - (money/i)*i;
            }
        }

        return (stock.get(13)*stockCount)+money;
    }
    public static int seongMin(int money, List<Integer> stock){
        int previewStock = stock.get(0);
        int upStockCount =0;
        int downStockCount=0;
        int stockCount =0;

        for(Integer i: stock){
            if(previewStock > i){
                downStockCount +=1;
                upStockCount=0;
            } else if(previewStock < i){
                upStockCount+=1;
                downStockCount=0;
            }else {
                downStockCount=0;
                upStockCount=0;
            }
            previewStock =i;


            if(upStockCount==3){
                money = money + stockCount*i;
                upStockCount=0;
                stockCount=0;
            }
            if (downStockCount==3) {
                downStockCount=2;
                if(money>i){
                    stockCount += money/i;
                    money = money - (money/i)*i;
                }
            }

        }

        return money + (stock.get(13)*stockCount);
    }

}
