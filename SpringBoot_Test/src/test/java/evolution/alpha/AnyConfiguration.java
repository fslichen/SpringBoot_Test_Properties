package evolution.alpha;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class AnyConfiguration {// AnyConfiguration can be under the same package of AnyTest.
	@Bean
	public AnyBean anyBean() {
		AnyBean anyBean = new AnyBean();
		anyBean.setName("Chen");
		return anyBean;
	}
}
