package PhotoBot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.PhotoSize;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PhotoBot extends TelegramLongPollingBot
{
    public void onUpdateReceived(Update update)
    {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText())
        {
            // Set variables
            String textMessage = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if (textMessage.equals("/start"))
            {
                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chatId)
                        .setText("Here is your keyboard");

                // Create ReplyKeyboardMarkup object
                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

                // Create the keyboard (list of keyboard rows)
                List<KeyboardRow> keyboard = new ArrayList<>();

                // Create a keyboard row
                KeyboardRow row = new KeyboardRow();

                // Set each button, you can also use KeyboardButton objects if you need something else than text
                row.add("Ali and AmirHosein");
                row.add("Group");
                row.add("/hide");

                // Add the first row to the keyboard
                keyboard.add(row);

                // Create another keyboard row
                row = new KeyboardRow();

                // Set each button for the second line
                row.add("AmirHosein 1");
                row.add("AmirHosein 2");
                row.add("AmirHosein 3");

                // Add the second row to the keyboard
                keyboard.add(row);

                // Create another keyboard row
                row = new KeyboardRow();

                // Set each button for the second line
                row.add("Mo'een 1");
                row.add("Mo'een 2");
                row.add("Mo'een 3");

                // Add the third row to the keyboard
                keyboard.add(row);

                // Set the keyboard to the markup
                keyboardMarkup.setKeyboard(keyboard);

                // Add it to the message
                message.setReplyMarkup(keyboardMarkup);

                try
                {
                    sendMessage(message); // Sending our message object to user
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }

            else if (textMessage.equals("Ali and AmirHosein"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADla4xG6G4-VKEwzg92gcm5vAioBoABHdGNu5pQ6GlTWABAAEC")
                        .setCaption("Ali and AmirHosein");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
            else if (textMessage.equals("Group"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADmq4xG6G4-VKrq45nm-9IxQ4soBoABI-P2NoPbgF4jF8BAAEC")
                        .setCaption("Group");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
            else if (textMessage.equals("AmirHosein 1"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADl64xG6G4-VJdKTMu04NdpJFUoBoABGkdqExeFvEuh20DAAEC")
                        .setCaption("AmirHosein 1");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
            else if (textMessage.equals("AmirHosein 2"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADma4xG6G4-VJ0tPD_qWoNu72DnRoABNKvecu2XsV_k20DAAEC")
                        .setCaption("AmirHosein 2");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
            else if (textMessage.equals("AmirHosein 3"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADna4xG6G4-VJvlL8qYWWWwKHmmxoABMK9qKBLyQkVgWoDAAEC")
                        .setCaption("AmirHosein 3");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
            else if (textMessage.equals("Mo'een 1"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADmK4xG6G4-VLF9hsw0a53vlJINBoABITdAqLsq2t6HPQEAAEC")
                        .setCaption("Mo'een 1");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
            else if (textMessage.equals("Mo'een 2"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADm64xG6G4-VLUDEvgXXomPwZKuhoABHeYd6eHFnxy71cBAAEC")
                        .setCaption("Mo'een 2");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
            else if (textMessage.equals("Mo'een 3"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADnK4xG6G4-VKjc_KEIltTn5_NnhoABEMe12oUDO7sacQBAAEC")
                        .setCaption("Mo'een 3");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
            else if (textMessage.equals("Group"))
            {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chatId)
                        .setPhoto("AgADBAADmq4xG6G4-VKrq45nm-9IxQ4soBoABI-P2NoPbgF4jF8BAAEC")
                        .setCaption("Photo");

                try
                {
                    sendPhoto(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }

            else if (textMessage.equals("/hide"))
            {
                SendMessage msg = new SendMessage()
                        .setChatId(chatId)
                        .setText("Keyboard hidden");

                ReplyKeyboardRemove keyboardMarkup = new ReplyKeyboardRemove();

                msg.setReplyMarkup(keyboardMarkup);

                try
                {
                    sendMessage(msg); // Call method to send the photo
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }

            else
            {
                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chatId)
                        .setText("Unknown command");
                try
                {
                    sendMessage(message); // Sending our message object to user
                }
                catch (TelegramApiException e)
                {
                    e.printStackTrace();
                }
            }
        }

        // Message contains photo
        else if (update.hasMessage() && update.getMessage().hasPhoto())
        {
            // Set variables
            long chatId = update.getMessage().getChatId();

            List<PhotoSize> photos = update.getMessage().getPhoto();

            String fileId = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getFileId();

            int fileWidth = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getWidth();

            int fileHeight = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getHeight();

            System.out.println("File_ID: " + fileId);
            String caption = "Width: " + Integer.toString(fileWidth) + "\nHeight: " + Integer.toString(fileHeight);
            SendPhoto msg = new SendPhoto()
                    .setChatId(chatId)
                    .setPhoto(fileId)
                    .setCaption(caption);
            try
            {
                sendPhoto(msg); // Call method to send the message
            }
            catch (TelegramApiException e)
            {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername()
    {
        // Return bot username
        return "chiz_ha_bot";
        //return "ceit_gif_bot";
    }

    public String getBotToken()
    {
        // Return bot token from BotFather
        return "681034837:AAHBAqu2lBXf0XMuxe-H55O9A2D_4C8QJSk";
        //return "618947597:AAGF6CoqWzGzj9rU__eTdl6zlWKDV-FUokU";
    }
}
