package KnittersClassForImplementation;

public class Knitters implements Runnable {

    public boolean hasThread = true;
    public int sweatersMade = 0;
    public long amountOfThread = 0;
    public String name;


    @Override
    public void run() {

        while (hasThread) {
            System.out.println("I am " + getName() + " and I am knitting!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sweatersMade++;
            System.out.println(sweatersMade);
        }
    }

    public Knitters(String name, int amount)  {
        this.name = name;
        setAmountOfThread(amount);
    }

    public String getName() {
        return name;
    }

    public int getSweatersMade() {
        return sweatersMade;
    }

    public long getAmountOfThread() {
        return amountOfThread;
    }

    public void setAmountOfThread(long amountOfThread) {
        this.amountOfThread = amountOfThread;
    }

    public void setHasThread(boolean thread) {
        this.hasThread = thread;
    }


}

