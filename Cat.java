package SecondRound;

public abstract class Cat {
     protected String catName;
     protected int age;
     protected String sex;
     protected double price;

     public Cat(String catName, int age, String sex, double price) {
          this.catName = catName;
          this.age = age;
          this.sex = sex;
          this.price = price;
     }

     public abstract String toString();
}