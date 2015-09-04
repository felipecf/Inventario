package com.techIT.inventario.testController;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.techIT.inventario.web.InicioController;

public class InicioControllerTest {

	@Test
	public void testHandleRequestView() throws Exception
	{
		InicioController controller = new InicioController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("index.jsp" , modelAndView.getViewName());
	}
}
