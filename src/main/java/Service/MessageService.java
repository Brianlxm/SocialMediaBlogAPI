package Service;

import DAO.MessageDAO;
import DAO.AccountDAO;
import Model.Message;

import java.util.List;

public class MessageService {
    public MessageDAO messageDAO;

    public AccountDAO accountDAO = new AccountDAO();

    public MessageService(){
        messageDAO = new MessageDAO();
    }

    public MessageService(MessageDAO messageDAO){
        this.messageDAO = messageDAO;
    }

    // add new message ****
    public Message addMessage(Message message){
        if (accountDAO.checkAccount(message.getPosted_by())!=null && message.getMessage_text().length()<=255 && message.getMessage_text()!=null){
            return messageDAO.addMessage(message);
        }else{
            return null;
        }
    }

    // get all messages
    public List<Message> getAllMessages(){
        return messageDAO.getAllMessages();
    }

    // get message by message_id
    public Message getMessageById(int id){
        return messageDAO.getMessageById(id);
    }

    // delete  message by message_id
    public void deleteMessage(int id){
        messageDAO.deleteMessage(id);
    }

    // update message by message_id
    public Message updateMessage(int id, Message message){
        if (messageDAO.getMessageById(id)!=null && message.getMessage_text().length()<=255 && message.getMessage_text()!=""){
            messageDAO.updateMessage(id, message);
            return messageDAO.getMessageById(id);
        }else{
            return null;
        }
    }
    
}
