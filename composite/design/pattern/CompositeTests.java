package composite.design.pattern;

public class CompositeTests {
    //Parent and leave should do the
    public static void main(String[] args) {
        Component hardDrive = new Leaf(3000, "hardDrive");
        Component mouse = new Leaf(500, "mouse");
        Component monitor = new Leaf(5000, "monitor");
        Component ram = new Leaf(6000, "ram");
        Component cpu = new Leaf(7000, "cpu");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("cabinet");
        Composite mb = new Composite("mb");
        Composite computer =new Composite("computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hardDrive);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
