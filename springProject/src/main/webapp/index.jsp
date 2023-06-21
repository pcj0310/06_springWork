<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:include page="/WEB-INF/views/common/header.jsp">
	<jsp:param value="안녕하세요" name="title"/>
</jsp:include>

	<img src="${pageContext.request.contextPath}/resources/img/spring.png" alt="spring" width="600" height="500">
	
<jsp:include page="/WEB-INF/views/common/footer.jsp" />