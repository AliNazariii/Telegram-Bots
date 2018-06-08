import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class CeitGifBot extends TelegramLongPollingBot
{
    public void onUpdateReceived(Update update)
    {

    }

    public String getBotUsername()
    {
        return "ceit_gif_bot";
    }

    public String getBotToken()
    {
        return "618947597:AAGF6CoqWzGzj9rU__eTdl6zlWKDV-FUokU";
    }
}