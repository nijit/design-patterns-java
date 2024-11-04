package composite.design.pattern;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
}

class Leaf implements Component{
    int price;
    String name;

    public Leaf(int price, String name){
        super();
        this.price = price;
        this.name = name;
    }
    @Override
    public void showPrice() {
        System.out.println(name+" "+price);
    }
}

class Composite implements Component{
    String name;
    List<Component> componentList = new ArrayList<>();
    public Composite(String name){
        this.name = name;
    }

    public void addComponent(Component component){
        componentList.add(component);
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c : componentList){
            c.showPrice();
        }
    }
}