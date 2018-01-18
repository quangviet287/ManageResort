package Library;

import java.util.ArrayList;
import java.util.List;

public class Library<E extends TypeService> {
	private String name;
	public Library(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private List<E> types = new ArrayList<E>();
	public boolean addType(E typeService) {
		if(types.contains(typeService)) {
			System.out.println(typeService.getName()+" is already on type service ");
			return false;
		} else {
			types.add(typeService);
			System.out.println(typeService.getName()+" added for type service " + this.name);
			return true;	
		}
	}
	public boolean deltype(E typeService) {
		types.remove(typeService);
		System.out.println(typeService.getName()+" removed for type service " + this.name);
		return true;
	}
	
	public void printLibrary() {
		for (E element : types) {
			System.out.println("Name " + element.getName());
		}
	}
}
