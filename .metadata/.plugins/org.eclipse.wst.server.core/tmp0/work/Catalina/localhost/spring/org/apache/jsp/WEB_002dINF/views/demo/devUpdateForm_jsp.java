/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-06-13 05:20:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.spring.demo.model.vo.Dev;
import java.util.*;

public final class devUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1686617076349L));
    _jspx_dependants.put("jar:file:/D:/pcj/06_springWork/springProject/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/pcj/06_springWork/springProject/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/pcj/06_springWork/springProject/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.spring.demo.model.vo.Dev");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Dev dev = (Dev)request.getAttribute("dev");
	List<String> devLangList = dev.getLang() !=null ? Arrays.asList(dev.getLang()) : null;
	pageContext.setAttribute("devLangList", devLangList);

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	#demo-container{width:550px; margin:auto;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Dev등록", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div id=\"demo-container\" class=\"form-floating\">\r\n");
      out.write("	<form name=\"frm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/demo/updateDev.do\">\r\n");
      out.write("		<div class=\"mb-3 row\">\r\n");
      out.write("			<label for=\"name\" class=\"col-sm-2 col-form-label\">이름</label>\r\n");
      out.write("			<div class=\"col-sm-10\">\r\n");
      out.write("				<input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dev.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"mb-3 row\">\r\n");
      out.write("			<label for=\"career\" class=\"col-sm-2 col-form-label\">개발경력</label>\r\n");
      out.write("			<div class=\"col-sm-10\">\r\n");
      out.write("				<input type=\"number\" class=\"form-control\" id=\"career\" name=\"career\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dev.career}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"mb-3 row\">\r\n");
      out.write("			<label for=\"email\" class=\"col-sm-2 col-form-label\">이메일</label>\r\n");
      out.write("			<div class=\"col-sm-10\">\r\n");
      out.write("				<input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dev.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		 \r\n");
      out.write("		<label class=\"col-sm-2 col-form-label\">성별</label>\r\n");
      out.write("		<div class=\"form-check form-check-inline\">	\r\n");
      out.write("			<input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"inlineRadio1\" value=\"M\"\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dev.gender eq 'M' ? 'checked' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("			<label class=\"form-check-label\" for=\"inlineRadio1\">남</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form-check form-check-inline\">\r\n");
      out.write("			<input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"inlineRadio2\" value=\"F\"\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dev.gender eq 'F' ? 'checked' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("			<label class=\"form-check-label\" for=\"inlineRadio2\">여</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br>\r\n");
      out.write("		\r\n");
      out.write("		<label class=\"col-sm-2 col-form-label\">개발언어</label>\r\n");
      out.write("		<div class=\"form-check form-check-inline\">\r\n");
      out.write("			<input class=\"form-check-input\" type=\"checkbox\" name=\"lang\" value=\"java\"\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devLangList.contains('java') ? 'checked' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("			<label class=\"form-check-label\" for=\"inlineCheckbox1\">JAVA</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form-check form-check-inline\">\r\n");
      out.write("			<input class=\"form-check-input\" type=\"checkbox\" name=\"lang\" value=\"c\"\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devLangList.contains('c') ? 'checked' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("			<label class=\"form-check-label\" for=\"inlineCheckbox2\">C</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form-check form-check-inline\">\r\n");
      out.write("			<input class=\"form-check-input\" type=\"checkbox\" name=\"lang\" value=\"JavaScript\"\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devLangList.contains('JavaScript') ? 'checked' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("			<label class=\"form-check-label\" for=\"inlineCheckbox3\">JavaScript</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form-check form-check-inline\">\r\n");
      out.write("			<input class=\"form-check-input\" type=\"checkbox\" name=\"lang\" value=\"python\"\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devLangList.contains('python') ? 'checked' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("			<label class=\"form-check-label\" for=\"inlineCheckbox3\">Python</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br><br>\r\n");
      out.write("		<input type=\"hidden\" name=\"no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dev.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("		<button type=\"submit\" class=\"btn btn-outline-secondary\">dev 수정</button>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	document.frm.onsubmit = (e) => {\r\n");
      out.write("		const name= e.target.name;\r\n");
      out.write("		if(/^[가-힣]{2,}$/.test(name.value) == false) {\r\n");
      out.write("			alert(\"한글로 2글자 이상 작성하세요\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		const langs = e.target.querySelectorAll(\"[name=lang]:checked\");\r\n");
      out.write("		if(langs.length == 0) {\r\n");
      out.write("			alert(\"하나 이상의 개발언어를 선택하세요\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
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