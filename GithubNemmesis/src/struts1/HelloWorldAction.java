package struts1;

import com.opensymphony.xwork2.ActionSupport;

/**
 * tiene que extender ActionSupport
 * @author Ruth
 *
 */
public class HelloWorldAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The model class that stores the message
	 * to display in the view.
	 */
	private MessageStore messageStore;
	
	/*
	 * Creates the MessageStore model object and 
	 * returns success.  The MessageStore model
	 * object will be available to the view.
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */

	private Persona p1;
	
	
	public String execute() throws Exception {
		
		messageStore = new MessageStore() ;
		p1 = new Persona(33,"Ruth");
		return SUCCESS;
	}

	public Persona getP1() {
		return p1;
	}

	public void setP1(Persona p1) {
		this.p1 = p1;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}
	
	

}
