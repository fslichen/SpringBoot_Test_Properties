package evolution.alpha;

public class AnyBean {
	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "AnyBean [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}
