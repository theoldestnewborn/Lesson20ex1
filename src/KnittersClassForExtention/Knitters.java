package KnittersClassForExtention;

public class Knitters extends Thread {

    public boolean hasThread = true;
    public int sweatersMade = 0;
    public long amountOfThread = 0;

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
        setName(name);
        setAmountOfThread(amount);
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

