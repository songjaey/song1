package control;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.member;
import service.member_action;
import service.member_service;

/**
 * Servlet implementation class member_control
 */
@WebServlet("/member_control")
public class member_control extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, member_action> target = new HashMap<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public member_control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ResourceBundle rb = ResourceBundle.getBundle("class_bundle/member");
		Enumeration key = rb.getKeys();
		while(key.hasMoreElements() ) {
			String k = (String)key.nextElement();
			String value = rb.getString(k);
			try {
					Class<?> hcl = Class.forName(value);
					member_action hinst = (member_action)hcl.newInstance();
					target.put(k, hinst);
			}catch(Exception e) {
				System.out.println("member.properties 파일 작업 실패");
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		
		String cmd = uri.substring(9);
		String view = "/";
		
		member_action mem = target.get(cmd);
		
		view = mem.action(request, response);
		
//		if(cmd.equals("signup")) {
//			request.setAttribute("prt", "member/signup");
//			
//			request.setAttribute("emailList", ms.emailList() );
//			
//		}else if(cmd.equals("signSave") ) {
//			view = ms.insert(request, response);
//		}
		
		if( view != null) {
			RequestDispatcher rds = request.getRequestDispatcher("/");
			rds.forward(request, response);
		}
	}
}
