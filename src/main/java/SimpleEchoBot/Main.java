package SimpleEchoBot;

import org.telegram.telegrambots.*;
import org.telegram.telegrambots.exceptions.*;

public class Main
{
    public static void main(String[] args)
    {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try
        {
            telegramBotsApi.registerBot(new SimpleEchoBot());
        }
        catch (TelegramApiException e)
        {
            e.printStackTrace();
        }
    }
}