package model.petrinet;

public abstract class NamedElement {
	private String name;
	private String id;

	public NamedElement(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
