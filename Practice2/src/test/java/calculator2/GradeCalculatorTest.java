package calculator2;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;







class GradeCalculatorTest {
	
	@Test
	public void test_GetClassification_ReturnsStringFail_IfInputDoubleIsLessThan75() {
		GradeCalculatorService calc = mock(GradeCalculatorService.class);
		when(calc.getClassification(70.0)).thenReturn("fail");
		double mark = 70.0;
		String result = calc.getClassification(mark);
		assertEquals("fail", result);
	}
	
	@Test
	public void test_GetClassification_ReturnsStringPass_IfInputDoubleIsGreaterThanOrEqualTo75AndLessThan80() {
		GradeCalculatorService calc = mock(GradeCalculatorService.class);
		when(calc.getClassification(76.0)).thenReturn("pass");
		double mark = 76.0;
		String result = calc.getClassification(mark);
		assertEquals("pass", result);
	}
	
	@Test
	public void test_GetClassification_ReturnsStringMerit_IfInputDoubleIsGreaterThanOrEqualTo80AndLessThan90() {
		GradeCalculatorService calc = mock(GradeCalculatorService.class);
		when(calc.getClassification(89.0)).thenReturn("merit");
		double mark = 89.0;
		String result = calc.getClassification(mark);
		assertEquals("merit", result);
	}
	
	
	@Test
	public void test_GetClassification_ReturnsStringDistinction_IfInputDoubleIsGreaterThanOrEqualTo90() {
		GradeCalculatorService calc = mock(GradeCalculatorService.class);
		when(calc.getClassification(95.0)).thenReturn("distinction");
		double mark = 95.0;
		String result = calc.getClassification(mark);
		assertEquals("distinction", result);
	}




}
