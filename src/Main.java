public class Main {
    public static void main(String[] args) {

            Kniters oldGranny = new Kniters("Old Granny", 200);
            Kniters youngGranny = new Kniters("Young Granny", 500);
            Kniters crazyGranny = new Kniters("Crazy Granny", 1000);

        try {
            crazyGranny.join();
            oldGranny.join();
            youngGranny.join();

            crazyGranny.start();
            Thread.sleep(crazyGranny.getAmountOfThread());
            crazyGranny.setHasThread(false);
            System.out.println("I am Crazy Granny with " + crazyGranny.getSweatersMade() + " sweaters");

            youngGranny.start();
            Thread.sleep(youngGranny.getAmountOfThread());
            youngGranny.setHasThread(false);
            System.out.println("I am Young Granny with " + youngGranny.getSweatersMade() + " sweaters");

            oldGranny.start();
            Thread.sleep(oldGranny.getAmountOfThread());
            oldGranny.setHasThread(false);
            System.out.println("I am Old Granny with " + oldGranny.getSweatersMade() + " sweaters");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


