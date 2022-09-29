package custom_exception;

 class UserNotFoundException  extends Exception {

	private static final long serialVersionUID = 1L;
	public UserNotFoundException(String message) {
		super(message);
	}

}

 public class UserNotFound{
	public static void main(String[] args) throws UserNotFoundException {
		System.out.println("ok");
		if(0==0)
			throw new UserNotFoundException("Zero");
	}
}
