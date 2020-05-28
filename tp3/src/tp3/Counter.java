package tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> listNum;

	public Counter() {
	 listNum = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getListNum() {
		return listNum;
	}

	public void setListNum(ArrayList<Integer> listNum) {
		this.listNum = listNum;
	}

	public Integer getEvenOccurrences(){
		Integer contador = 0;
		for (Integer x=0;x<listNum.size();x++) {
			if(listNum.get(x)%2==0) contador++;
		}
		return contador;
	}

	public void addNumber(Integer i) {
		 listNum.add(i);
		
	}

	
}