package tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> listNum;

	public Multioperador() {
		
		listNum = new ArrayList<Integer>();
	}
	
	
	
	
	public ArrayList<Integer> getListNum() {
		return listNum;
	}




	public void setListNum(ArrayList<Integer> listNum) {
		this.listNum = listNum;
	}




	public Integer sumarNumeros() {
		Integer suma = 0;
		for (Integer x=0;x<listNum.size();x++) {
			suma += listNum.get(x);
		}
		return suma;
	}
	
	public Integer restaNumeros() {
		Integer resta = 0;
		for (Integer x=0;x<listNum.size();x++) {
			resta -= listNum.get(x);
		}
		return resta;
	}
	
	public Integer multiplicarNumeros() {
		Integer multi = 1;
		for (Integer x=0;x<listNum.size();x++) {
			multi = multi * listNum.get(x);
		}
		return multi;
	}
	
	public void addNumber(Integer i) {
		 listNum.add(i);
		
	}
	
}
