package SecondRound;

public class OrangeCat extends Cat {

    boolean isFat;

    public OrangeCat(String catName,int age,String sex,double price,boolean isFat) {
        super(catName,age,sex, 200);
        this.isFat=isFat;
    }

    @Override
    public  String toString() {
        return "OrangeCat{" +
                "CatName='" + catName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", isFat=" + isFat +
                '}';
    }
}
