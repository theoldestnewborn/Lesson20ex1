import KnittersClassForExtention.Knitters;

public class Main {
    public static void main(String[] args) {

//            Thread oldGranny = new Thread(new Knitters("Old Granny", 200));
//            Thread youngGranny = new Thread(new Knitters ("Young Granny", 500));
//            Thread crazyGranny = new Thread(new Knitters("Crazy Granny", 1000));

            Knitters oldGranny = new Knitters("Old Granny", 200);
            Knitters youngGranny = new Knitters("Young Granny", 500);
            Knitters crazyGranny = new Knitters("Crazy Granny", 1000);

        try {
            crazyGranny.start();
//            crazyGranny.join();
            Thread.sleep(crazyGranny.getAmountOfThread());
            crazyGranny.setHasThread(false);
            System.out.println("I am Crazy Granny with " + crazyGranny.getSweatersMade() + " sweaters");

            youngGranny.start();
//            youngGranny.join();
            Thread.sleep(youngGranny.getAmountOfThread());
            youngGranny.setHasThread(false);
            System.out.println("I am Young Granny with " + youngGranny.getSweatersMade() + " sweaters");

//            oldGranny.start();
//            oldGranny.join();
//            Thread.sleep(oldGranny.getAmountOfThread());
//            oldGranny.setHasThread(false);
//            System.out.println("I am Old Granny with " + oldGranny.getSweatersMade() + " sweaters");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


