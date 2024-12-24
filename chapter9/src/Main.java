/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        RandomNumber rn = new RandomNumber();
//        Thread1 t1 = new Thread1(rn);
//        t1.start();
//        Thread2 t2 = new Thread2(rn);
//        t2.start();
        TicketSeller seller = new TicketSeller();
        Thread customer1 = new Thread(new Customer(20, seller), "张文明");
        Thread customer2 = new Thread(new Customer(10, seller), "李小伟");
        Thread customer3 = new Thread(new Customer(5, seller), "赵伟林");

        customer1.start();
        customer2.start();
        customer3.start();
    }
}
