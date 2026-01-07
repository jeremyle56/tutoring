package overcooked;

public class OvenMitts {
    private static OvenMitts instance = null;
    private Oven oven;

    public OvenMitts(Oven oven) {
        this.oven = oven;
    }

    public synchronized static OvenMitts getInstance(Oven oven) {
        if (instance == null) {
            instance = new OvenMitts(oven);
        }

        return instance;
    }

    public synchronized void useOven(String chef, int cakesNeeded) {
        System.out.println(chef + " puts on the oven mitts and opens the oven...");

        for (int i = 0; i < cakesNeeded; i++) {
            if (oven.takeCake()) { // In the event there's a cake available, we take it out.
                System.out.println(chef + " took a cake out! (" + oven.getCakes() + " left)");
            } else { // In the event there are no cakes left, we cry.
                System.out.println(chef + " found the oven empty!");
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(chef + " closes the oven and takes off the mitts.");
    }
}
