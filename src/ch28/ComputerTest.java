package ch28;

public class ComputerTest {

    public static void main(String[] args){

        Computer computer=new DeskTop();
        computer.display();
        computer.turnOff();

        Computer computer1=new MyNoteBook();
        computer1.display();
        computer1.typing();

    }

}
