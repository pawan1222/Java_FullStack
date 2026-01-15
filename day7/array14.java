package day7;


public class array14 {
    public static void main(String[] args) {
        int sales[]={120,80,150,90,200,75,110};

        int temp[] = {32,28,31,29,35,27,30};
        System.out.println(Avg_temp(temp));
        Hottest_coldest(temp);
        hot_day(temp);
        Avg_sales(sales);
        record_sales(sales);
        High_salesdays(sales);
        above_150_sales(sales);
        update(sales);



    }
    public static double Avg_temp(int temp[]){
        int sum=0;
        for(int i=0;i<temp.length;i++){
            sum+=temp[i];
        }
        return sum/(double)temp.length;
    }
    public static void Hottest_coldest(int temp[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<temp.length;i++){
            if(temp[i]<smallest){
                smallest=temp[i];
            }
            if(temp[i]>largest){
                largest=temp[i];
            }
        }
        System.out.println("Highest Temperature: "+largest+"C");
        System.out.println("Lowest Temperature: "+smallest+"C");
    }
    public static void hot_day(int temp[]){
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]>30){
                count++;
            }
            
        }
        System.out.println("No of hot days "+count);
    }

    public static void Avg_sales(int sales[]){
        int sum=0;
        for(int i=0;i<sales.length;i++){
            sum+=sales[i];
        }
        double avg=sum/(double)sales.length;
        System.out.println("Total sales: "+sum);
        System.out.println("Average sales: "+avg);
    }



    public static void record_sales(int sales[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int h_days=0;
        int l_days=0;
        for(int i=0;i<sales.length;i++){
            if(sales[i]<smallest){
                smallest=sales[i];
                l_days=i+1;
            }
            if(sales[i]>largest){
                largest=sales[i];
                h_days=i+1;
            }
        }
        System.out.println("Highest sales: "+largest+"On days"+h_days);
        System.out.println("lowest sales: "+smallest+"On days"+l_days);
        
    }

    public static void High_salesdays(int sales[]){
        int count=0;
        for(int i=0;i<sales.length;i++){
            if(sales[i]>100){
                count++;
            }
            
        }
        System.out.println("No of high sales day above 100 is "+count);
    }

    public static void above_150_sales(int sales[]){
        for(int i=0;i<sales.length;i++){
            if(sales[i]==150){
                System.out.println("sales 150 found on day "+i+1);
            }
        }
        
    }
    public static void update(int sales[]) {
        sales[1]=95;
        System.out.println("Updated sales for day 2: "+sales[1]);
    }


}
