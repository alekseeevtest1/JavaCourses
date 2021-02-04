package lessons7;

public class ComputerRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(254);

        Ram ram2 = new Ram(16000);
        Ssd ssd2 = new Ssd(500);

        Computer computer = new Computer(ram, ssd);
        computer.printState();

        Computer computer1 = new Computer(ram2, ssd2);
        computer1.printState();


    }
}
