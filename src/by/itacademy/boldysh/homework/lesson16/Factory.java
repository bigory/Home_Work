package by.itacademy.boldysh.homework.lesson16;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Factory implements Runnable {
    private final Dump dump;

    @Override
    public void run() {
        for (int i = 0; i < TaskOneUtil.QUANTITY_NIGHT; i++) {
            workFabric();
        }
    }

    private void workFabric() {
        synchronized (dump) {
            int randomQuantityDetail = RandomDetailUtil.getRandomNumberDetailServantFactory();
            System.out.println(randomQuantityDetail);
            for (int j = 0; j < randomQuantityDetail; j++) {
                Detail detail = Detail.values()[RandomDetailUtil.getQualityDetailRobot()];
                System.out.println(detail);
                dump.getDetails().add(detail);
            }
            System.out.println(dump.getDetails());
            try {
                dump.wait(TaskOneUtil.LENGTH_DAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dump.notifyAll();
        }
    }
}