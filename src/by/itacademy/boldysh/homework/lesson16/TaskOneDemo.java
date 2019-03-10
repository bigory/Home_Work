package by.itacademy.boldysh.homework.lesson16;

public class TaskOneDemo {
    public static void main(String[] args) throws InterruptedException {
        Dump dump = new Dump("Dump");
        CrazyScientist firstCrazyScientist = new CrazyScientist("FirstCrazyScientist");
        CrazyScientist secondCrazyScientist = new CrazyScientist("SecondCrazyScientist");
        Factory factory = new Factory(dump);
        Servant firstServant = new Servant("FirstServant", dump, firstCrazyScientist);
        Servant secondServant = new Servant("SecondServant", dump, secondCrazyScientist);

        dump.addDetailsDumpFirstNight();
        System.out.println(dump.getDetails());

        Thread threadFactory = new Thread(factory);
        Thread threadServant1 = new Thread(firstServant);
        Thread threadServant2 = new Thread(secondServant);

        threadFactory.start();
        threadServant1.start();
        threadServant2.start();

        threadFactory.join();
        threadServant1.join();
        threadServant2.join();

        System.out.println(firstCrazyScientist.getName() + " collected --> " +
                firstCrazyScientist.assembleRobot() + " robots");
        System.out.println(secondCrazyScientist.getName() + " collected --> " +
                secondCrazyScientist.assembleRobot() + " robots");
        System.out.println(TaskOneUtil.determinationWinner(firstCrazyScientist, secondCrazyScientist));
    }
}