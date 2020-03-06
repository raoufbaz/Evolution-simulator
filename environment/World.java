package environment;

import userInterface.Ui;

import java.util.LinkedList;

public class World {

   private LinkedList<Creature> creatures;
   private LinkedList<Food> foods;
   int numberOfCreatures;
   int numberOfFood;

   World(int numberOfCreatures, int numberOfFood){
      this.numberOfCreatures = numberOfCreatures;
      this.numberOfFood = numberOfFood;

      initCreatures();
      initFood();
   }

   private void initCreatures(){
      for (int i = 0; i < numberOfCreatures ; i++) {
         creatures.add(new Creature());
      }
   }
   private void initFood(){
      for (int i = 0; i < numberOfCreatures ; i++) {
         foods.add(new Food());
      }
   }

   public LinkedList<Creature> getCreatures() {
      return creatures;
   }

   public LinkedList<Food> getFoods() {
      return foods;
   }
}
