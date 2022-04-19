package net.codejava.aws;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;




@WebServlet("/upload")
@MultipartConfig(
		
		fileSizeThreshold = 5000 * 5000,  
		maxFileSize = 5000 * 5000 *50, 
		maxRequestSize = 5000 * 5000 *60
		
		
		)



public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FileUploadServlet() {
        super();
       
    }

    // s3 servisine dosya gönderme iþlemleri
    
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String description =request.getParameter("description");
		
		System.out.println("Description : " + description);
		
		
		Part part = request.getPart("file");
		
		
		 String fileName = getFileName(part);
		
		System.out.println(fileName);
		
		String message = "";
		
		try {
			 S3Util.uploadFile(fileName, part.getInputStream());
			 message = "Dosyaniz sisteme yuklendi";
		} catch (Exception ex) {
			message = "Dosya yuklenemedi" + ex.getMessage()
;		}
		
		request.setAttribute("message", message);
		request.getRequestDispatcher("message.jsp").forward(request,response);
		
		response.getWriter().println("Done");
		
	}
	
  private String getFileName( Part part) {
	  
	  String contentDisposition = part.getHeader("content-disposition");
	   int beginIndex = contentDisposition.indexOf(": " ) +30;
	   int endIndex = contentDisposition.length() - 1 ;
	  return contentDisposition.substring(beginIndex, endIndex);
	  
	  
  }

}
