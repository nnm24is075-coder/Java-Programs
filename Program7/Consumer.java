package message;


class Consumer extends Thread {
    private MessageBoard board;

    public Consumer(MessageBoard b) {
        this.board = b;
    }

    @Override
    public void run() {
        String msg;
        while (!(msg = board.get()).equals("DONE")) {
            System.out.println("Consumed: " + msg);
        }
    }
}
