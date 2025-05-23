package observer;

// 메세지 구독
public class SubscriberTwo implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("Subscriber Two Received : " + message.getMessageContent());
    }
}
