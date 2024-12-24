class Customer implements Runnable {
    private int payment;
    private TicketSeller seller;

    public Customer(int payment, TicketSeller seller) {
        this.payment = payment;
        this.seller = seller;
    }

    @Override
    public void run() {
        seller.sellTicket(payment, Thread.currentThread().getName());
    }
}
