package upa.fei.dp.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade();

        theater.watchMovie("Matrix");
        theater.shutDown();

        System.out.println();
        theater.listenToMusic("Abbey Road");
        theater.shutDown();
    }
}
