package com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Servlet implementation class Test
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test called");
		System.out.println("test");
		String filePath = request.getRealPath("/WebContent/WEB-INF/struts.xml");
		File file=new File(filePath);
		
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Struts.class);
	 Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Struts struts =(Struts) unmarshaller.unmarshal(file);
		
//		Class cls = Class.forName("com.mkyong.reflection.AppTest");
//		Object obj = cls.newInstance();
// 
//		//call the printIt method
//		Method method = cls.getDeclaredMethod("printIt", noparams);
//		method.invoke(obj, null);
		
		PrintWriter writer = response.getWriter();
		writer.write(request.getRequestURI() + "called");
		writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
