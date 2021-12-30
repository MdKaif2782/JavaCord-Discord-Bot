import Commands.domath.DoMath;
import Commands.PingPong;
import Commands.Rate;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class JavaCordBot {
    public static void main(String[] args)
    {
        DiscordApi Bot = new DiscordApiBuilder().setToken("OTI0NjA4NDc0NDA5NzQyMzU3.YchCvg.T4V1Q5_tuOPd1F0sJygdjOsEm0U").login().join();

        Bot.addListener(new PingPong());
        Bot.addListener(new DoMath());
        Bot.addListener(new Rate());

        System.out.println("Bot is online! Owner:Md_kaif#3392");
    }
}
