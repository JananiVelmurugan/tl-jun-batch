
package com.training.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

	private List<String> empList;
	
	public Employees(){
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Raja");
		empList.add("Suresh");
		empList.add("Rani");
		empList.add("John");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>(this.getEmpList());
			/*for(String s : this.getEmpList()){
				temp.add(s);
			}*/
			
			return new Employees(temp);
		//return super.clone();
	}
	
}
