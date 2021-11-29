package SecondRound;

public interface CatCafe {
    void buyCat(Cat newCat) throws InsufficientBalanceException;
    void Service(Customer newCustomer);
    void Closed();
}
