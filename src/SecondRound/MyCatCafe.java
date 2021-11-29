package SecondRound;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements CatCafe {
    double balance;
    ArrayList<Cat> cats;
    ArrayList<Customer> customers;

    public MyCatCafe(double balance, ArrayList<Cat> cats, ArrayList<Customer> customers) {
        this.balance = balance;
        this.cats = cats;
        this.customers = customers;
    }

    private void getCatMsg(Cat cat) {
        if (cat instanceof OrangeCat) {
            System.out.println(cat);
        }
        if (cat instanceof BlackCat) {
            System.out.println(cat);
        }
    }

    @Override
    public void buyCat(Cat newCat) throws InsufficientBalanceException {
        if (newCat instanceof OrangeCat) {
            if (balance >= newCat.price) {
                System.out.println("购买成功");
                balance -= newCat.price;
                cats.add(newCat);
            } else {
                throw new InsufficientBalanceException("余额不足");
            }
        }

        if (newCat instanceof BlackCat) {
            if (balance >= newCat.price) {
                System.out.println("购买成功");
                balance -= newCat.price;
                cats.add(newCat);
            } else {
                throw new InsufficientBalanceException("余额不足");
            }
        }

    }

    @Override
    public void Service(Customer newCustomer) {
        customers.add(newCustomer);
        System.out.println(newCustomer);
        for (int i = 0; i < newCustomer.times; i++) {
            Random random = new Random();
            int getCat = random.nextInt(cats.size());
            getCatMsg(cats.get(getCat));
        }

        if (cats.size() == 0) {
            throw new CatNotFoundException("店里没有可以rua的猫");
        }
        balance += 15 * newCustomer.times;
    }

    @Override
    public void Closed() {
        double profits = 0;
        for (Customer customer : customers) {
            if (customer.ArriveTime.equals(LocalDate.now())) {
                profits += 15 * customer.times;
            }
        }
        System.out.println("今天店铺盈利为：" + profits);
    }
}
