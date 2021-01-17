import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodayServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
//		out.println("<html lang='ko'>");
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Kim Junho</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<a href='http://localhost:8080/aboutme/index.html'>메인화면</a>");
		out.println("<br>");
		out.println("<br>");
		
		String curTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
		
		out.println("<time>");
		out.println("<h1>현재시간 : " + curTime + "</h1>");
		out.println("</time>");
		
		out.println("</body>");
		out.println("</html>");
	}
}