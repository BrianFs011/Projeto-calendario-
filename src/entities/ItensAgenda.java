package entities;

public class ItensAgenda {

	private String name;
	private Double price;
	
	public ItensAgenda(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getItemName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
