package org.opentutorials.javatutorials.interfaces.example3;


interface I1{
	public void x();
}

interface I2{
	public void y();
}


class A implements I1, I2 {
	 public void x() {}
	 public void y() {}
}

/////////////////////////////////////////////

interface I3 {
	public void z();
}

interface I4 extends I3{
	public void e();
}

class B implements I4{
	
	public void z(){}
	public void e(){}
}

