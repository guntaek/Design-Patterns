package observer;

// 메세지 구독
public class SubscriberOne implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("Subscriber One Received : " + message.getMessageContent());
    }
}
