class TicketSeller {
    private int fiveYuanNotes = 3;

    public synchronized void sellTicket(int payment, String customerName) {
        if (payment == 20) {
            if (fiveYuanNotes >= 1) {
                System.out.println(customerName + " 用20元买票，找零5元。");
                fiveYuanNotes--;
            } else {
                System.out.println(customerName + " 没有足够的零钱，无法购买票。");
            }
        } else if (payment == 10) {
            if (fiveYuanNotes >= 1) {
                System.out.println(customerName + " 用10元买票，找零5元。");
                fiveYuanNotes--;
            } else {
                System.out.println(customerName + " 没有足够的零钱，无法购买票。");
            }
        } else if (payment == 5) {
            System.out.println(customerName + " 用5元买票。");
        }
    }
}
