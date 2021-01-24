package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Month {

	SimpleDateFormat sdf = new SimpleDateFormat("MMM");
	
	private Date mes;
	
	public Month(Date mes) {
		this.mes = mes;
	}
	
	public Date getMes() {
		return mes;
	}
	
	public void setMes(Date mes) {
		this.mes = mes;
	}

	@Override
	
	public String toString() {
		return sdf.format(mes);
	}
}
