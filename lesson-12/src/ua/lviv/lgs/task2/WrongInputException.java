package ua.lviv.lgs.task2;

@SuppressWarnings("serial")
public class WrongInputException extends Exception {


	private String message;

	public WrongInputException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
