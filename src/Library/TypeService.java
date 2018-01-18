package Library;

public abstract class TypeService {
	private String name;
	public TypeService(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
