package org.redi.backend;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="module")
public class Module {
	
	@Id
	private int moduleId ;
	private String moduleName;
	
	private double moduleCost;
	
	private int year;
	
	public Module()
	{
		
	
		
	}
	public Module(int moduleId,String moduleName,double moduleCost,int year)
	{
		this.moduleId=moduleId;
		this.moduleName=moduleName;
		this.moduleCost=moduleCost;
		this.year=year;
		
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public double getModuleCost() {
		return moduleCost;
	}

	public void setModuleCost(double moduleCost) {
		this.moduleCost = moduleCost;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		
		return "Module_Id :"+moduleId+"  module_Name :"+moduleName+"Module_Cost :R"+moduleCost+" Module_Year Year:"+year;
	}
	

}
