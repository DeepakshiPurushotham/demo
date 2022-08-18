package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Registration Page</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row col-md-6 col-md-offset-3\">\n");
      out.write("        <div class=\"panel panel-primary\">\n");
      out.write("          <div class=\"panel-heading text-center\">\n");
      out.write("            <h1>Registration Form</h1>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("            <form action=\"connect.php\" method=\"post\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"firstName\">First Name</label>\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  id=\"firstName\"\n");
      out.write("                  name=\"firstName\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"lastName\">Last Name</label>\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  id=\"lastName\"\n");
      out.write("                  name=\"lastName\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"gender\">Gender</label>\n");
      out.write("                <div>\n");
      out.write("                  <label for=\"male\" class=\"radio-inline\"\n");
      out.write("                    ><input\n");
      out.write("                      type=\"radio\"\n");
      out.write("                      name=\"gender\"\n");
      out.write("                      value=\"m\"\n");
      out.write("                      id=\"male\"\n");
      out.write("                    />Male</label\n");
      out.write("                  >\n");
      out.write("                  <label for=\"female\" class=\"radio-inline\"\n");
      out.write("                    ><input\n");
      out.write("                      type=\"radio\"\n");
      out.write("                      name=\"gender\"\n");
      out.write("                      value=\"f\"\n");
      out.write("                      id=\"female\"\n");
      out.write("                    />Female</label\n");
      out.write("                  >\n");
      out.write("                  <label for=\"others\" class=\"radio-inline\"\n");
      out.write("                    ><input\n");
      out.write("                      type=\"radio\"\n");
      out.write("                      name=\"gender\"\n");
      out.write("                      value=\"o\"\n");
      out.write("                      id=\"others\"\n");
      out.write("                    />Others</label\n");
      out.write("                  >\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"email\">Email</label>\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  id=\"email\"\n");
      out.write("                  name=\"email\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("                <input\n");
      out.write("                  type=\"password\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  id=\"password\"\n");
      out.write("                  name=\"password\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"number\">Phone Number</label>\n");
      out.write("                <input\n");
      out.write("                  type=\"number\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  id=\"number\"\n");
      out.write("                  name=\"number\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <input type=\"submit\" class=\"btn btn-primary\" />\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel-footer text-right\">\n");
      out.write("            <small>&copy; Deepakshi</small>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"toast\" role=\"alert\" aria-live=\"assertive\" aria-atomic=\"true\">\n");
      out.write("  <div class=\"toast-header\">\n");
      out.write("    <img src=\"...\" class=\"rounded mr-2\" alt=\"...\">\n");
      out.write("    <strong class=\"mr-auto\">Bootstrap</strong>\n");
      out.write("    <small>11 mins ago</small>\n");
      out.write("    <button type=\"button\" class=\"ml-2 mb-1 close\" data-dismiss=\"toast\" aria-label=\"Close\">\n");
      out.write("      <span aria-hidden=\"true\">&times;</span>\n");
      out.write("    </button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"toast-body\">\n");
      out.write("    Hello, world! This is a toast message.\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
