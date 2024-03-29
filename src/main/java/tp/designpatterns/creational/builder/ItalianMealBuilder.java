/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.creational.builder;

public class ItalianMealBuilder implements MealBuilder {

    private Meal meal;

    public ItalianMealBuilder() {
        meal = new Meal();
    }
    
    @Override
    public void buildDrink() {
        meal.setDrink("red wine");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("pizza");
    }

    @Override
    public void buildSide() {
        meal.setSide("bread");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
