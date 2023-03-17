import com.GoogleThreadClasses.GoogleFeatureThread;

public class GoogleTestRunner {

	public static void main(String[] args) {
		

		
		Thread t1 =new GoogleFeatureThread("chrome thread", "chrome");
		
		Thread t2 =new GoogleFeatureThread("firefox thread", "firefox");
		
		System.out.println("Thread started");
		
		t1.start();
		t2.start();
		
	}

}
