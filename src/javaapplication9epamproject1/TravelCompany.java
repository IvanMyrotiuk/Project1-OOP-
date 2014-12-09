
package javaapplication9epamproject1;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TravelCompany {

    private List<TravelerVoucher> list;

    public TravelCompany(){//Collectio.sort
        this.list = new LinkedList<TravelerVoucher>();
    }

    public void addTravelerVoucher(TypeOfRest typeRest,Food food, Transport transport,int days){
       TravelerVoucher tv = new TravelerVoucher(typeRest,food,transport,days);
       list.add(tv);
    }

    public List getListOfTheTravelersVouchers(){
        return this.list;
    }
   /* public String getFood(int i){
        //return list.get(i);
        return "";
    }
    */
    //comporator
    public void sortByDays(){
        Collections.sort(this.list, new Comparator<TravelerVoucher>(){
            public int compare(TravelerVoucher tv1, TravelerVoucher tv2){
                return tv1.days-tv2.days;
            }
        });
    }
    public void sortByFood(){
        Collections.sort(this.list, new Comparator<TravelerVoucher>(){
            public int compare(TravelerVoucher tv1, TravelerVoucher tv2){
                //return ((TravelerVoucher)tv1.food).compareTo((TravelerVoucher)tv2.food);
                return tv1.food.compareTo(tv2.food);
            }
        });
    }

    public class TravelerVoucher{ //implements Comparable<TravelerVoucher>{
            private TypeOfRest typeRest;
            private Food food;
            private Transport transport;
            private int days;
            /* public void compareTo(TravelerVoucher other ){

             }
            */
            public TravelerVoucher(){

            }

            public TravelerVoucher(TypeOfRest typeRest,Food food, Transport transport,int days){
                this.days = days;
                this.food = food;
                this.transport = transport;
                this.typeRest = typeRest;
            }

            public void setTypeOfRest(TypeOfRest typerest){
                this.typeRest = typerest;
            }

            public String getTypeOfRest(){
                return this.typeRest.toString();
            }
            public String getFood(){
                return this.food.toString();
            }
            public String getTransport(){
                return this.transport.toString();
            }
            public int getDays(){
                return this.days;
            }
        }

}
