package Service;

import DAO.MessageDAO;
import Model.Message;

import java.util.List;

public class MessageService {
    public MessageDAO messageDAO;

    public MessageService(){
        messageDAO = new MessageDAO();
    }

    public MessageService(MessageDAO messageDAO){
        this.messageDAO = messageDAO;
    }

    // add new message
    public Message addMessage(Message message){
        return messageDAO.addMessage(message);
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
        if (messageDAO.getMessageById(id)!=null){
            messageDAO.updateMessage(id, message);
            return messageDAO.getMessageById(id);
        }else{
            return null;
        }
    }
    
}
