package junitCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.av.junitCalculator.Calculator;

public class CalcTest {

//	@Test
	public void calAddTest() {
		assertEquals("error in Add()",3,Calculator.Add(1, 2));
		assertEquals("error in Add()",-3,Calculator.Add(-1, -2));
		assertEquals("error in Add()",9,Calculator.Add(9, 0));
	}
//	@Test
	public void calAddTestFail(){
		
		assertEquals("error in Add()",0,Calculator.Add(1, 2));
	}
//	@Test
public void calSubTest(){
	
	assertEquals("error in Sub()",-1,Calculator.Sub(1, 2));
	assertEquals("error in Sub()",1,Calculator.Sub(-1, -2));
	assertEquals("error in Sub()",9,Calculator.Sub(9, 0));
	}
	//@Test
public void calSubTestFail(){
	
	assertEquals("error in Sub()",0,Calculator.Sub(1, 2));
}
@Test
	public void calMulTest(){
		
		assertEquals("error in Mul()",2,Calculator.Mul(1, 2));
		assertEquals("error in Mul()",2,Calculator.Mul(-1, -2));
		assertEquals("error in Mul()",0,Calculator.Mul(9, 0));
		}
	//@Test
	public void calMulTestFail(){
		
		assertEquals("error in Mul()",0,Calculator.Mul(1, 2));
	}

}
