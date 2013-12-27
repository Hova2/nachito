package nachito;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/liprestamos")
public class liprestamos extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest ped, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String prestamo = ped.getParameter("prestamo");
		String apellidoc = ped.getParameter("apellidoc");
		String nombrec = ped.getParameter("nombrec");
		String producto = ped.getParameter("producto");
		String caja = ped.getParameter("caja");
		String ubicacion = ped.getParameter("ubicacion");
		String entidad = ped.getParameter("entidad");
		int dni = Integer.parseInt(ped.getParameter("dni"));
	
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + prestamo + "</t1>");
		out.println("<t1>" + apellidoc + "</t1>");
		out.println("<t1>" + nombrec + "</t1>");
		out.println("<t1>" + dni + "</t1>");
		out.println("<t1>" + producto + "</t1>");
		out.println("<t1>" + caja + "</t1>");
		out.println("<t1>" + ubicacion + "</t1>");
		out.println("<t1>" + entidad + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}

}

