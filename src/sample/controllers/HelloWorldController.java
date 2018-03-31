package sample.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.models.HelloWorldModel;
/**
 * Servlet implementation class HelloWorldController
 */
@WebServlet("/HelloWorld")
public class HelloWorldController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//  
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// Modelの生成
		HelloWorldModel model = new HelloWorldModel();
		model.setMessage("テストだよ");
		
		// ViewへModelデータを渡す準備
		request.setAttribute("model", model);
		
		// Viewを表示
		this.getServletContext()
			.getRequestDispatcher("/WEB-INF/sample/views/hello.html")
			.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
