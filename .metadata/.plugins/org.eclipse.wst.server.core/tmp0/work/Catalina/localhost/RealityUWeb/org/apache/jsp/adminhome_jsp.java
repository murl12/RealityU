/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2014-08-28 20:50:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
 
//RESET ALL SESSION OBJECTS TO NULL TO CLEAR OUT VALUES
obj.Group grpp = null;
List<obj.Survey> lstSurvs = null;
obj.Occupation ocp = null;
obj.Survey survey = null;
String mssg = null;
HttpSession ses1 = request.getSession();
//For newgroup.jsp
ses1.setAttribute("newGrp", grpp);
ses1.setAttribute("newGroupMsg", mssg);
//For opengroup.jsp
ses1.setAttribute("openGrp", grpp);
ses1.setAttribute("lstSurveys", lstSurvs);
ses1.setAttribute("editGroupMsg", mssg);
ses1.setAttribute("isProcessed", mssg);
//For occupations.jsp
ses1.setAttribute("occupsMsg", mssg);
//For editoccups.jsp
ses1.setAttribute("editOccp", ocp);
ses1.setAttribute("editOccupsMsg", mssg);
//For surveyview.jsp
ses1.setAttribute("surveyviewGrp", grpp);
ses1.setAttribute("viewSurvey", survey);
ses1.setAttribute("surveyMssg", mssg);
//For surveprocessed.jsp	
ses1.setAttribute("surveyprocessGrp", grpp);
ses1.setAttribute("processSurvey", survey);
ses1.setAttribute("surveyProcMsg", mssg);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge,chrome=1\">\r\n");
      out.write("\r\n");
      out.write("<title>Communities In Schools - Reality U Admin</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<!--Edge = render site in highest standards mode possible 8, 9..., chrome = use Google engine if installed-->\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" media=\"screen\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mainstyles.css\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<!--FOR STICKY FOOTER IN OLDER IE BROWSERS (except IE 7 OK)-->\r\n");
      out.write("<!--[if (lt IE 9) & (!(IE 7))]>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t#wrapper {display:table; height:100%;}\r\n");
      out.write("\t</style>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--FOR shadow 100% 'BACKGROUND-SIZE' IN OLDER IE BROWSERS <IE8-->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t/*SET BOX WIDTH = TO EXACT BACKGRD SHADOW IMAGE WIDTH - NO SCALING*/\r\n");
      out.write("\t\t#mainArea #box1 {width: 200px !important; padding: 0 !important;}\r\n");
      out.write("\t\t#mainArea #box2 {width: 200px !important; padding: 0 !important;}\r\n");
      out.write("\t\t#mainArea #box3 {width: 200px !important; padding: 0 !important;}\r\n");
      out.write("\t\t#mainArea #box4 {width: 200px !important; padding: 0 !important;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*NEED TO TAKE AWAY PADDING ON box ELEMENT (w/ image), AND ADD TO <h3> ELEMENT*/\r\n");
      out.write("\t\t.addPad { padding: 5px !important;}\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*OR COULD TAKE BACKGRD IMAGE AWAY ENTIRELY - THEN ALLOWS SCALING*/\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\t#mainArea #box1 {background-image: none;}\r\n");
      out.write("\t\t#mainArea #box2 {background-image: none;}\r\n");
      out.write("\t\t#mainArea #box3 {background-image: none;}\r\n");
      out.write("\t\t#mainArea #box4 {background-image: none;}\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t</style>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write(" \r\n");
      out.write("<!--HEADER-->\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("<img id=\"logoImg\" src=\"images/cislogo.png\" width=\"200\" height=\"150\" alt=\"Communities In Schools Logo\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Header Text-->\r\n");
      out.write("<img id=\"headerText\" src=\"images/realityuhead.png\" width=\"600\" height=\"80\" alt=\"Reality University Program\">\r\n");
      out.write("<!--REALITY U LOGO-->\r\n");
      out.write("<img id=\"logoImg2\" src=\"images/realityulogo.png\" width=\"100\" height=\"95\" alt=\"Reality U Logo\">\r\n");
      out.write("\r\n");
      out.write("<!--NAVIGATION-->\r\n");
      out.write("<div id=\"nav\">\r\n");
      out.write("  <ul>\r\n");
      out.write("  \t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t<li><a href=\"adminhome.jsp\">Admin Home</a></li>\r\n");
      out.write("\t<li><a href=\"newgroup.jsp\">New Group</a></li>\r\n");
      out.write("    <li><a href=\"opengroup.jsp\">Open Group</a></li>\r\n");
      out.write("\t<li><a href=\"occupations.jsp\">Edit Occupations</a></li>\r\n");
      out.write("    <li><a href=\"helpadmin.html\">Help</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</div><!--END NAVIGATION-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div><!--END HEADER-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--MAIN CONTENT CONTAINER -->\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<fieldset>\r\n");
      out.write("<h3>Administration</h3>\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<div id=\"mainArea\">\r\n");
      out.write("\r\n");
      out.write("\t<table>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div id=\"box1\">\r\n");
      out.write("\t\t\t\t<h3 class=\"blackHeadCenter addPad\">New Group</h3>\r\n");
      out.write("\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/iconaddgroup.png\" width=\"128\" height=\"128\" alt=\"Open New Group\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div class=\"bottomAlign\">\r\n");
      out.write("\t\t\t\t\t<a id=\"adminButton\" href=\"newgroup.jsp\">New Group&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;>>&nbsp;&nbsp;</a> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div id=\"box2\">\r\n");
      out.write("\t\t\t\t<h3 class=\"blackHeadCenter addPad\">Open Group</h3>\r\n");
      out.write("\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/iconopengroup.png\" width=\"128\" height=\"128\" alt=\"Open Group\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div class=\"bottomAlign2\">\r\n");
      out.write("\t\t\t\t\t<a id=\"adminButton\" href=\"opengroup.jsp\">Open Group&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;>>&nbsp;&nbsp;</a> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div id=\"box3\">\r\n");
      out.write("\t\t\t\t<h3 class=\"blackHeadCenter addPad\">Edit Occupations</h3>\r\n");
      out.write("\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/iconeditoccup.png\" width=\"128\" height=\"128\" alt=\"Edit Occupations\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div class=\"bottomAlign3\">\r\n");
      out.write("\t\t\t\t\t<a id=\"adminButton\" href=\"occupations.jsp\">Edit Occupations&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;>>&nbsp;&nbsp;</a> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div id=\"box4\">\r\n");
      out.write("\t\t\t\t<h3 class=\"blackHeadCenter addPad\">Help</h3>\r\n");
      out.write("\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/iconhelp.png\" width=\"128\" height=\"128\" alt=\"Help\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div class=\"bottomAlign4\">\r\n");
      out.write("\t\t\t\t\t<a id=\"adminButton\" href=\"helpadmin.html\">Help&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;>>&nbsp;&nbsp;</a> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("</div><!--END loginArea-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div><!--END Main Area-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--FOR STICKY FOOTER-->\r\n");
      out.write("<div id=\"push\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div><!--END Content Wrapper-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--FOOTER OUTSIDE WRAPPER-->\r\n");
      out.write("<div id=\"footer\" class=\"legal\">\r\n");
      out.write("Copyright &copy; 2009-2014 CIS of Marietta/Cobb County\r\n");
      out.write("</div><!--END FOOTER-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
