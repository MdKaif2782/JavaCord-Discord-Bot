package Commands;

import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class PingPong implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent message) {
        if (message.getMessageContent().equalsIgnoreCase("sadiakemon"))
        {
            message.getChannel().sendMessage("janina sadia keomon");
        }
    }
}
