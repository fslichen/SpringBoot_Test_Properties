package evolution.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component// Don't forget to tag this class as the component so that you can @Autowired this pojo.
@PropertySource("classpath:evolution.properties")// The default property source is application.properties, but you can specify your customized property source.
@ConfigurationProperties("evolution")// This approach is recommended because it directly inject the properties in the properties file into the java pojo. evolution in this case is the prefix.
public class AnyBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AnyBean [name=" + name + "]";
	}
}
