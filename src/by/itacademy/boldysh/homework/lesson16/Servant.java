package by.itacademy.boldysh.homework.lesson16;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Servant implements Runnable {
    private final Dump dump;
    private CrazyScientist crazyScientist;
    private String name;
    private List<Detail> bagDetailsServant = new ArrayList<>();

    public Servant(String name, Dump dump, CrazyScientist crazyScientist) {
        this.name = name;
        this.dump = dump;
        this.crazyScientist = crazyScientist;
    }

    @Override
    public void run() {
        for (int i = 0; i < TaskOneUtil.QUANTITY_NIGHT; i++) {
            workServant();
        }
        System.out.println(crazyScientist.getName() + ":total amount details" + ">>>" +
                getCrazyScientist().getDetailsForRobots());
    }

    private void workServant() {
        synchronized (dump) {
            int randomQuantityDetail = RandomDetailUtil.getRandomNumberDetailServantFactory();
            System.out.println(getName() + " want to take------>" + randomQuantityDetail);
            for (int j = 0; j < randomQuantityDetail; j++) {
                if (dump.getDetails().size() == 0) {
                    System.out.println("No details");
                    break;
                }
                Detail detail = dump.getDetails().get(RandomDetailUtil.getRandomNumber(dump.getDetails().size()));
                getBagDetailsServant().add(detail);
                dump.getDetails().remove(detail);
                System.out.println(getName() + " took " + detail);
            }
            passDetailCrazyScientist(getBagDetailsServant());
            try {
                dump.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void passDetailCrazyScientist(List<Detail> bagDetailsServant) {
        for (Detail bagDetailServant : bagDetailsServant) {
            getCrazyScientist().getDetailsForRobots().computeIfPresent(bagDetailServant, (detail, quality) -> quality + 1);
            getCrazyScientist().getDetailsForRobots().putIfAbsent(bagDetailServant, 1);
        }
        System.out.println(getName() + " passed the found parts in quantities " + getCrazyScientist().getName() + " " +
                bagDetailsServant.size());
        bagDetailsServant.clear();
    }
}