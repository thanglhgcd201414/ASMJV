class Transfer {

    private Queue<String> messageQueue;
    private Stack<String> messageStack;

    public Transfer() {

        messageQueue = new Queue<>();
        messageStack = new Stack<>();
    }


    public void send(String message){
        try {
            messageQueue.enQueue(message);
        } catch (Exception e)
        {
            System.out.println(e);
        }

    }
    public void recive(){
        try {

            while (!messageQueue.isEmpty())
                messageStack.push(messageQueue.deQueue());
        } catch (Exception e)
        {
            System.out.println(e);
        }

    }
    public void notification(){ // thông báo

        while (!messageStack.isEmpty())
            System.out.println( "Message 1 sent: " + messageStack.pop() );
    }

}
