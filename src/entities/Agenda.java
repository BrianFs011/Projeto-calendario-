package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<ItensAgenda> agenda = new ArrayList<>();
	
	private String itemName;
	private Double price;
	
	public Agenda(String itemName, Double price) {
		this.itemName = itemName;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "";
	}
}
