package Commands.domath;

import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.util.stream.Stream;

public class DoMath implements MessageCreateListener
{

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase("DoMath"))
        {
            event.getChannel().sendMessage("You have entered the bot's arithmatic unit.\nChoose an action from below:\n 1. ADDITION\n 2. SUBSTRACTION\n");

            

        }



    }
}
