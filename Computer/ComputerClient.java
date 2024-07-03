package Computer;

public class ComputerClient {
    public static void main(String[] args) {
        ComputerBuilderDirector compDirector = new ComputerBuilderDirector();
        Computer comp1 = compDirector.getBasicComputer();
        Computer comp2 = compDirector.getGraphicsCardComputer();

        System.out.println(comp1.isGraphicCardEnabled());
        System.out.println(comp1.getCPU());

        System.out.println(comp2.isGraphicCardEnabled());
        System.out.println(comp2.getCPU());
    }
}
