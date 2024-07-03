package Computer;

public class ComputerBuilderDirector {
    public Computer getBasicComputer(){
        return new Computer.Builder("2GB","2TB","Intel i7").buiild();
    }

    public Computer getGraphicsCardComputer(){
        return new Computer.Builder("3GB","3TB","Intel i9").setGraphicCardEnabled(true).buiild();
    }
}
