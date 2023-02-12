package CupOfCoffee;

import java.util.Iterator;

public class Program {
    Beverage latte = new Coffee();
     latte.addComponent(new Water("вода"));
     latte.addComponent(new Вeans("Зёрна"));
     latte.addComponent(new Milk("Молоко"));

     Iterator<Ingredient> iterator = latte;
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
}

