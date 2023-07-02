package com.bean;

public class FullTimeEmp extends Employee {

	   private int fix_sal, extra_no_of_hrs, extra_hrs_sal;

	public FullTimeEmp(int id,String name,int fix_sal, int extra_no_of_hrs, int extra_hrs_sal) {
		super(id,name);
		this.fix_sal = fix_sal;
		this.extra_no_of_hrs = extra_no_of_hrs;
		this.extra_hrs_sal = extra_hrs_sal;
	}

	public int getFix_sal() {
		return fix_sal;
	}

	public void setFix_sal(int fix_sal) {
		this.fix_sal = fix_sal;
	}

	public int getExtra_no_of_hrs() {
		return extra_no_of_hrs;
	}

	public void setExtra_no_of_hrs(int extra_no_of_hrs) {
		this.extra_no_of_hrs = extra_no_of_hrs;
	}

	public int getExtra_hrs_sal() {
		return extra_hrs_sal;
	}

	public void setExtra_hrs_sal(int extra_hrs_sal) {
		this.extra_hrs_sal = extra_hrs_sal;
	}
	   
	   
}
