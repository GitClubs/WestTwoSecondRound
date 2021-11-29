package SecondRound;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyCatCafeTest {

    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new BlackCat("小黑",2,"F",350));
        cats.add(new OrangeCat("小白",3,"M",200,true));

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("小明",2, LocalDate.of(2021,11,29)));
        customers.add(new Customer("小红",4,LocalDate.of(2021,10,23)));

        MyCatCafe myCatCafe = new MyCatCafe(10000,cats,customers);

        myCatCafe.buyCat(new OrangeCat("小黄",1,"M",200,false));
        myCatCafe.buyCat(new BlackCat("小绿",2,"F",350));

        myCatCafe.Service(new Customer("李雷",2,LocalDate.now()));
        myCatCafe.Service(new Customer("韩梅梅",3,LocalDate.now()));
        myCatCafe.Closed();
    }
}
