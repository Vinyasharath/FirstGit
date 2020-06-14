package packone;

public class CallMethod {

	public static void main(String[] args) {
		
		WebMethods b7= new WebMethods();
		b7.launchapp("http://reddif.com");
		b7.CloseApp();
		b7.launchapp("http://facebook.com");
		b7.elementavalable("email", true);
		b7.elementavalable("pass", false);
		b7.CloseApp();
		b7.launchapp("http://google.com");
		b7.CloseApp();
	}

}
