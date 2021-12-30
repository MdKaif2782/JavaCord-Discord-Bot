package Commands;

import java.util.Random;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Rate implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent message) {
        String msg[] = message.getMessageContent().split(" ");

        if (msg[0].equalsIgnoreCase("!rate"))
        {
            Random rand = new Random();
            int upperbound = 100;
            int ran = rand.nextInt(upperbound);

            message.getChannel().sendMessage( message.getMessageAuthor().getDisplayName() + " you are " + ran + "% " + msg[1]);
        }
    }
}
