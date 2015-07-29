package struts1;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
 *
 */
public class MessageStore {
	
	private String message;
	
	public MessageStore() {
		
		setMessage("Ruti y JJ");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
