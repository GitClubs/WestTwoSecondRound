package SecondRound;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

    String Customer;
    int times;
    LocalDate ArriveTime;

    public Customer(String customer, int times, LocalDate arriveTime) {
        Customer = customer;
        this.times = times;
        ArriveTime =arriveTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customer='" + Customer + '\'' +
                ", times=" + times +
                ", ArriveTime=" + ArriveTime +
                '}';
    }

}
