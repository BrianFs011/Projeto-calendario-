package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Exemplo {

	private Date dia;
	private Date mes;
	
	public Exemplo(Date dia, Date mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Date getMes() {
		return mes;
	}

	public void setMes(Date mes) {
		this.mes = mes;
	}
}
