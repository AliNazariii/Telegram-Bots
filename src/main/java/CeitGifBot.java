import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class CeitGifBot extends TelegramLongPollingBot
{
    public void onUpdateReceived(Update update)
    {
        SendMessage message = new SendMessage();
        String command = update.getMessage().getText();
        if (command.equals("/com1"))
        {
            System.out.println(update.getMessage().getFrom().getFirstName());
            message.setText(update.getMessage().getFrom().getFirstName());
        }
        if (command.equals("/com2"))
        {
            System.out.println(update.getMessage().getFrom().getLastName());
            message.setText(update.getMessage().getFrom().getLastName());
        }

        message.setChatId(update.getMessage().getChatId());
        try
        {
            execute(message);
        }
        catch (TelegramApiException e)
        {
            e.printStackTrace();
        }
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