package com.org.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Test7 {
    public static void main(String[] args) {

        Fruit redApple = new Fruit("Apple", "Red");  
        Fruit greenApple = new Fruit("Apple", "Green");        
        Fruit yellowBanana = new Fruit("Banana", "Yellow");        
        Fruit purpleGrape = new Fruit("Grape", "Purple");        
        Fruit orangeOrange = new Fruit("Orange", "Orange");        
        Fruit redGrape = new Fruit("Grape", "Red");        


        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.addFruit(redApple);
        fruitBasket.addFruit(greenApple);
        fruitBasket.addFruit(yellowBanana);
        fruitBasket.addFruit(purpleGrape);
        fruitBasket.addFruit(orangeOrange);
        fruitBasket.addFruit(redGrape);

        printBasket("Fruit in the Basket:\n", fruitBasket.getAllFruit());
        if (fruitBasket.getAllFruit().size() != 6) {
            throw new RuntimeException("Fruit Basket should have 6 fruit");
        }

        List<Fruit> foundFruit = fruitBasket.findFruitByColor("Red");
        printBasket("Found Fruit By Color:\n", foundFruit);
        if (foundFruit.size() != 2) {
            throw new RuntimeException("Should have found 2 Red fruit");
        }


        fruitBasket.removeFruitByName("Apple");
        printBasket("Found Fruit After Removing " + "Apple" + ":\n", fruitBasket.getAllFruit());
        if (fruitBasket.getAllFruit().size() != 4) {
            throw new RuntimeException("Should have found 4 fruit left in basket after removing the Apples");
        }

    }

    private static void printBasket(String title, List<Fruit> fruitList){
        StringBuffer remainingFruitBuffer = new StringBuffer(title);
        fruitList.forEach(fruit -> remainingFruitBuffer.append("\tFruit [" + fruit + "]\n"));
        System.out.println (remainingFruitBuffer.toString());
    }
}

class FruitBasket {
    List<Fruit> basket = new ArrayList<Fruit>();

    //TODO Add fruit to the basket
    public void addFruit (Fruit fruit){
    	this.basket.add(fruit);
    }

    //TODO Return all the fruit in the fruit basket
    public List<Fruit> getAllFruit() {
    	return this.basket;
    }

    //TODO Return all the fruit by Color
    public List<Fruit> findFruitByColor (String fruitColor) {

    	return basket.stream().filter(f->f.getFruitColor().equals(fruitColor)).collect(Collectors.toList());
    	
    }

    //TODO Remove fruit by name from the basket
    public void removeFruitByName (String fruitName) {
    	for(int i=0;i<basket.size();i++) {
    		Fruit fruit = basket.get(i);
    		if(fruit.getFruitName().equals(fruitName)) {
    			basket.remove(i);
    			i--;
    		}
    	}
    }

}

class Fruit {

    private String fruitName, fruitColor;

    Fruit (String fruitName, String fruitColor){
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
    }

    public String getFruitName() {
        return this.fruitName;
    }

    public String getFruitColor() {
        return this.fruitColor;
    }

    public String toString() {
        return "name=" + this.fruitName + ", color=" + this.fruitColor;
    }
}
