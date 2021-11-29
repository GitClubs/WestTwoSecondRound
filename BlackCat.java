package SecondRound;

public class BlackCat extends Cat{

    public BlackCat(String catName,int age,String sex,double price) {
        super(catName,age,sex,350);
    }

    @Override
    public String toString() {
        return "BlackCat{" +
                "CatName='" + catName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }
}
