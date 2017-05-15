package evolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import evolution.configuration.AnyBean;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private AnyBean anyBean;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args).close();// Close the application automatically so that you won't need to shut down the project manually.
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(this.anyBean);
	}
}
