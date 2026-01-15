package day4;
import java.util.Scanner;

public class prac9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter passenger ID: ");
        int passenger_ID = sc.nextInt();
        System.out.println("Enter passenger name: ");
        String passenger_name=sc.next();
        System.out.print("Age: ");
        int age=sc.nextInt();

        System.out.println("Travel type: 1-Bus, 2-Train, 3-Flight");
        int Travel_type=sc.nextInt();

        System.out.println("enter Base fair: ");
        double base_fair=sc.nextDouble();

        System.out.println("Enter is government employee: ");
        boolean isgove_emp=sc.nextBoolean();

        double fair_after_class=0.0;
        double discount_amount=0.0;
        double final_fair=0.0;
        String booking_status="";

        if(age<5){
            System.out.println("Free ticket");
            sc.close();
            return;
        }else if(age>80){
            System.out.println("Medical clearance required");
            sc.close();
            return;
        }

        switch(Travel_type){
            case 1:
                System.out.print("enter 1:sleeper, 2:seater: ");
                int seat_type=sc.nextInt();
                switch (seat_type) {
                    case 1:
                        fair_after_class=base_fair*1.2;
                        break;
                    case 2:
                        fair_after_class=base_fair*1.0;
                        break;
                    default:
                        System.out.println("invalid seat type");
                }
                break;
                case 2:
                System.out.print("enter 1:general, 2:sleeper, 3:AC ");
                seat_type=sc.nextInt();
                switch (seat_type) {
                    case 1:
                        fair_after_class=base_fair*1.0;
                        break;
                    case 2:
                        fair_after_class=base_fair*1.3;
                        break;
                    case 3:
                        fair_after_class=base_fair*1.6;
                        break;
                    default:
                        System.out.println("invalid seat type");
                }
                break;
                case 3:
                System.out.print("enter 1:Economy, 2:business: ");
                seat_type=sc.nextInt();
                switch (seat_type) {
                    case 1:
                        fair_after_class=base_fair*2.5;
                        break;
                    case 2:
                        fair_after_class=base_fair*3.5;
                        break;
                    default:
                        System.out.println("invalid seat type");
                }
                break;
        }

        if(age>=60){
            discount_amount=fair_after_class*30/100;
        }else if(isgove_emp==true){
            discount_amount=fair_after_class*15/100;
        }else if(age>=5 && age<=12){
            discount_amount=fair_after_class*50/100;
        }

        final_fair=fair_after_class-discount_amount;

        if(final_fair>=1000){
            if(Travel_type==3){
                booking_status="confirmed";
            }else{
                booking_status="waiting list";
            }
        }else{
            booking_status="confirmed";
        }


        System.out.println("passenger_ID: "+passenger_ID);
        System.out.println("passenger_name: "+passenger_name);
        System.out.println("Travel_type: "+Travel_type);
        System.out.println("base_fair: "+base_fair);
        System.out.println("final_fair: "+final_fair);
        System.out.println("discount_amount: "+discount_amount);
        System.out.println("booking_status: "+booking_status);

        sc.close();
    }
}
