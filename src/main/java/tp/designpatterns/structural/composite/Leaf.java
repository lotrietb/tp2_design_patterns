/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.composite;

public class Leaf implements Component{

    String name;

    public Leaf(String name) {
        this.name = name;
    }
    
    @Override
    public String sayHello() {
        return name + " leaf says hello";
    }

    @Override
    public String sayGoodbye() {
        return name + " leaf says goodbye";
    }
    
}
