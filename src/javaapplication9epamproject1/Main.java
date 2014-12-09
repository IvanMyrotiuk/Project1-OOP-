
package javaapplication9epamproject1;

import java.util.Scanner;
import javaapplication9epamproject1.TravelCompany.TravelerVoucher;


public class Main {

    public static void main(String[] args) {

        TravelCompany tc1 = new TravelCompany();
        tc1.addTravelerVoucher(TypeOfRest.CRUISE, Food.CUISINE, Transport.SHIP, 20);
        tc1.addTravelerVoucher(TypeOfRest.SHOPPING, Food.FISH, Transport.TRAINE, 10);
        tc1.addTravelerVoucher(TypeOfRest.TREATMENT, Food.MEAT, Transport.BUS, 5);
        tc1.addTravelerVoucher(TypeOfRest.SIGHTSEEING, Food.MILK, Transport.PLANE, 14);

        //TravelCompany.TravelerVoucher tv = tc1.new TravelerVoucher();

       // List<TravelerVoucher> voucher = tc1.getListOfTheTravelersVouchers();

        /*for(TravelCompany.TravelerVoucher voucher:tc1.getListOfTheTravelersVouchers()){

        }
         */
        System.out.println("--------Unsorted-------------");
        for(int i= 0; i< tc1.getListOfTheTravelersVouchers().size(); i++){
            TravelCompany.TravelerVoucher vouchers= (TravelerVoucher) tc1.getListOfTheTravelersVouchers().get(i);
            System.out.println("Type of rest:"+vouchers.getTypeOfRest()+"; type of food:"+vouchers.getFood()+"; type of transport:"+vouchers.getTransport()+"; days:"+vouchers.getDays());
        }

        System.out.println("------Sort By Days--------");
        tc1.sortByDays();

        for(int i= 0; i< tc1.getListOfTheTravelersVouchers().size(); i++){
            TravelCompany.TravelerVoucher vouchers= (TravelerVoucher) tc1.getListOfTheTravelersVouchers().get(i);
            System.out.println("Type of rest:"+vouchers.getTypeOfRest()+"; type of food:"+vouchers.getFood()+"; type of transport:"+vouchers.getTransport()+"; days:"+vouchers.getDays());
        }

        System.out.println("-----Sort By Food------");

        tc1.sortByFood();

        for(int i= 0; i< tc1.getListOfTheTravelersVouchers().size(); i++){
            TravelCompany.TravelerVoucher vouchers= (TravelerVoucher) tc1.getListOfTheTravelersVouchers().get(i);
            System.out.println("Type of rest:"+vouchers.getTypeOfRest()+"; type of food:"+vouchers.getFood()+"; type of transport:"+vouchers.getTransport()+"; days:"+vouchers.getDays());
        }


        System.out.println("=================================================================================");
        Scanner in = new Scanner(System.in);
        
        System.out.println("Choose your voucher !!!");
        
        TravelCompany travel = new TravelCompany();
        
        String Question = "";
        
        do{
            System.out.println("Choose type of rest: 1.REST; 2.SIGHTSEEING 3.TREATMENT 4.SHOPPING 5.CRUISE" );//REST,SIGHTSEEING,TREATMENT,SHOPPING,CRUISE
            int n1 = in.nextInt();                       
            TypeOfRest typeRest= null;
            switch(n1){
                case 1: typeRest = TypeOfRest.REST;
                    break;
                case 2: typeRest = TypeOfRest.SIGHTSEEING;
                break;
                case 3: typeRest = TypeOfRest.TREATMENT;
                break;
                case 4: typeRest = TypeOfRest.SHOPPING;
                break;
                case 5: typeRest = TypeOfRest.CRUISE;
                break;
                default: System.out.println(" You havent chosen proper option. Try to do it again!!!!!!!" ) ;
            }
            
            System.out.println("Choose type of Food: 1.CUISINE; 2.FISH; 3.MEAT; 4.MILK; 5.VEGANFOOD ");//CUISINE,FISH,MEAT,MILK,VEGANFOOD
            int n2 = in.nextInt();
            Food food=null;
            switch(n2){
                case 1: food = Food.CUISINE;
                break;
                case 2: food = Food.FISH;
                break;
                case 3: food = Food.MEAT;
                break;
                case 4: food = Food.MILK;
                break;
                case 5: food = Food.VEGANFOOD;
                break;
                default: System.out.println("You havent chosen proper option. Try to do it again!!!!!!!");
            }
            
            System.out.println("Choose type of Transport: 1.TAXI; 2.BUS; 3.PLANE; 4.TRAINE; 5.SHIP");//TAXI,BUS,PLANE,TRAINE,SHIP
            int n3 = in.nextInt();
            Transport transpor=null;
            switch(n3){
                case 1: transpor = Transport.TAXI;
                break;
                case 2: transpor = Transport.BUS;
                break;
                case 3: transpor = Transport.PLANE;
                break;
                case 4: transpor = Transport.TRAINE;
                break;
                case 5: transpor = Transport.SHIP;
                break;
                default: System.out.println("You haven't chosen proper option. Try to do it again!!!!!!!");
            }
            
            System.out.println("input yours days: ");
            int days = in.nextInt();
            
            travel.addTravelerVoucher(typeRest, food, transpor, days);
            System.out.println(" Do you want choose another option??? Write Y if YES, Or N if Not");
            Question = in.next();
        }while(Question.equalsIgnoreCase("Y"));
        
        System.out.println("");

        for(int i =0; i<travel.getListOfTheTravelersVouchers().size(); i++){
            TravelCompany.TravelerVoucher travelVoucher = (TravelerVoucher) travel.getListOfTheTravelersVouchers().get(i);
            System.out.println("Type of rest:"+travelVoucher.getTypeOfRest()+"; type of food:"+travelVoucher.getFood()+"; type of transport:"+travelVoucher.getTransport()+"; days:"+travelVoucher.getDays());
        }

        System.out.println("Would you like to sort yours preferences??? Y or N");
        String Question2 =in.next();
        String Question3 = "";
        do{
            if(Question2.equalsIgnoreCase("Y")){
                System.out.println("Choose your sor: 1.By Days; 2.By Food");
                int sort = in.nextInt();
                switch(sort){
                    case 1: travel.sortByDays();
                    break;
                    case 2: travel.sortByFood();
                    break;
                    default: System.out.println("You have not chosen appropriate option so it will be sorted by DAYS ");
                    travel.sortByDays();
                }
                for(int i =0; i<travel.getListOfTheTravelersVouchers().size(); i++){
                    TravelCompany.TravelerVoucher travelVoucher = (TravelerVoucher) travel.getListOfTheTravelersVouchers().get(i);
                    System.out.println("Type of rest:"+travelVoucher.getTypeOfRest()+"; type of food:"+travelVoucher.getFood()+"; type of transport:"+travelVoucher.getTransport()+"; days:"+travelVoucher.getDays());
                }
            }else{
                System.out.println("");
            }

            System.out.println("Would you like to sort by another option???? Y - YES Or N - NO");
            Question3 = in.next();
        }while(Question3.equalsIgnoreCase("Y"));
        
        
        System.out.println("Thank you for having chosen our  company That is named as 'John&Nika'!!! We are looking forward to seeing you soon)))");
        
        System.out.println("John\u2122");
    }

}
