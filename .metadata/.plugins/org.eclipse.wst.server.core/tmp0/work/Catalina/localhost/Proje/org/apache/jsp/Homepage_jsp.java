/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-04-19 17:47:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("  background-color: #1cbb9b;\r\n");
      out.write("}\r\n");
      out.write(".login-box{\r\n");
      out.write("  position:relative;\r\n");
      out.write("  margin: 10px auto;\r\n");
      out.write("  width: 500px;\r\n");
      out.write("  height: 380px;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  -webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.33);\r\n");
      out.write("-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.33);\r\n");
      out.write("box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.33);\r\n");
      out.write("}\r\n");
      out.write(".lb-header{\r\n");
      out.write("  position:relative;\r\n");
      out.write("  color: #00415d;\r\n");
      out.write("  margin: 5px 5px 10px 5px;\r\n");
      out.write("  padding-bottom:10px;\r\n");
      out.write("  border-bottom: 1px solid #eee;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("  height:28px;\r\n");
      out.write("}\r\n");
      out.write(".lb-header a{\r\n");
      out.write("  margin: 0 25px;\r\n");
      out.write("  padding: 0 20px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  color: #666;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  font-size: 15px;\r\n");
      out.write("  -webkit-transition: all 0.1s linear;\r\n");
      out.write("  -moz-transition: all 0.1s linear;\r\n");
      out.write("  transition: all 0.1s linear;\r\n");
      out.write("}\r\n");
      out.write(".lb-header .active{\r\n");
      out.write("  color: #029f5b;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write(".social-login{\r\n");
      out.write("  position:relative;\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height:auto;\r\n");
      out.write("  padding: 10px 0 15px 0;\r\n");
      out.write("  border-bottom: 1px solid #eee;\r\n");
      out.write("}\r\n");
      out.write(".social-login a{\r\n");
      out.write("  position:relative;\r\n");
      out.write("  float: left;\r\n");
      out.write("  width:calc(40% - 8px);\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  border: 1px solid rgba(0,0,0,0.05);\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border-radius: 2px;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  margin: 0 3%;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("}\r\n");
      out.write(".social-login a i{\r\n");
      out.write("  position: relative;\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 20px;\r\n");
      out.write("  top: 2px;\r\n");
      out.write("}\r\n");
      out.write(".social-login a:first-child{\r\n");
      out.write("  background-color: #49639F;\r\n");
      out.write("}\r\n");
      out.write(".social-login a:last-child{\r\n");
      out.write("  background-color: #DF4A32;\r\n");
      out.write("}\r\n");
      out.write(".email-login,.email-signup{\r\n");
      out.write("  position:relative;\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height:auto;\r\n");
      out.write("  margin-top: 20px;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("}\r\n");
      out.write(".u-form-group{\r\n");
      out.write("  width:100%;\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".u-form-group input[type=\"email\"],\r\n");
      out.write(".u-form-group input[type=\"password\"]{\r\n");
      out.write("  width: calc(50% - 22px);\r\n");
      out.write("  height:45px;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border: 1px solid #ddd;\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("  border-radius: 2px;\r\n");
      out.write("  color: #333;\r\n");
      out.write("  font-size:0.8rem;\r\n");
      out.write("  -webkit-transition:all 0.1s linear;\r\n");
      out.write("  -moz-transition:all 0.1s linear;\r\n");
      out.write("  transition:all 0.1s linear;\r\n");
      out.write("}\r\n");
      out.write(".u-form-group input:focus{\r\n");
      out.write("  border-color: #358efb;\r\n");
      out.write("}\r\n");
      out.write(".u-form-group button{\r\n");
      out.write("  width:50%;\r\n");
      out.write("  background-color: #1CB94E;\r\n");
      out.write("  border: none;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("  padding: 14px 0;\r\n");
      out.write("  border-radius: 2px;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write(".forgot-password{\r\n");
      out.write("  width:50%;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  text-decoration: underline;\r\n");
      out.write("  color: #888;\r\n");
      out.write("  font-size: 0.75rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"login-box\">\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"lb-header\">\r\n");
      out.write("      <a href=\"#\" class=\"active\" id=\"login-box-link\">FileBox Uygulamasi</a>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"social-login\">\r\n");
      out.write("      <a href=\"upload.jsp\">\r\n");
      out.write("        <i class=\"fa fa-facebook fa-lg\"></i>\r\n");
      out.write("        Upload a File\r\n");
      out.write("      </a>\r\n");
      out.write("      <a href=\"listfiles.jsp\">\r\n");
      out.write("        <i class=\"fa fa-google-plus fa-lg\"></i>\r\n");
      out.write("        List Files\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <form class=\"email-login\">\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(\".email-signup\").hide();\r\n");
      out.write("$(\"#signup-box-link\").click(function(){\r\n");
      out.write("  $(\".email-login\").fadeOut(100);\r\n");
      out.write("  $(\".email-signup\").delay(100).fadeIn(100);\r\n");
      out.write("  $(\"#login-box-link\").removeClass(\"active\");\r\n");
      out.write("  $(\"#signup-box-link\").addClass(\"active\");\r\n");
      out.write("});\r\n");
      out.write("$(\"#login-box-link\").click(function(){\r\n");
      out.write("  $(\".email-login\").delay(100).fadeIn(100);;\r\n");
      out.write("  $(\".email-signup\").fadeOut(100);\r\n");
      out.write("  $(\"#login-box-link\").addClass(\"active\");\r\n");
      out.write("  $(\"#signup-box-link\").removeClass(\"active\");\r\n");
      out.write("});\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
