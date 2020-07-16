package org.example;

public class Facade {
    private Cpu cpu = new IntelCpuImpl();
    private MainBoard mainBoard = new MsiMainBoardImpl();
    private Power power = new AsusPowerImpl();

    //    public Facade(Cpu cpu, MainBoard mainBoard, Power power) {
//        this.cpu = cpu;
//        this.mainBoard = mainBoard;
//        this.power = power;
//    }
    public void test() {
        cpu.operate();
        mainBoard.operate();
        power.operate();
    }
}
