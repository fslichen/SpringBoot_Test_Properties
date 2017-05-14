package evolution;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mail")
public class MailConfiguration {
	private Smtp smtp;
	
    public Smtp getSmtp() {
		return smtp;
	}

	public void setSmtp(Smtp smtp) {
		this.smtp = smtp;
	}

	public class Smtp {
    	private String name;

		@Override
		public String toString() {
			return "Smtp [name=" + name + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

    }
}
