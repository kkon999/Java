package org.opentutorials.javatutorials.exception;

import java.io.IOException;

class E{
	
	// unchecked Exception이기 때문에 예외 처리를 하지않아도 컴파일이 가능하다.
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	
	// checked Exception이기 때문에 throw를 하기 위해서는 try/catch문을 사용하여 컴파일 해야한다.  
	void throwIOException1() {
		try {
			throw new IOException();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	void throwIOException2() throws IOException {
		throw new IOException();
	}
}