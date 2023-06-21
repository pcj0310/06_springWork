<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#container{width:500px; margin:auto;}
	th, td{height:30px;}
	input {width: 250px;}
	.guide {display:none;}
	.ok{color:green;}
	.error{color:red;}
</style>
<jsp:include page="/WEB-INF/views/common/header.jsp">
	<jsp:param value="상세보기" name="title"/>
</jsp:include>
	<div id="container">
		<form action="${pageContext.request.contextPath}/board/boardEnroll.bo" method="post" name="enrollfrm" enctype="multipart/form-data">	
			<table class="table">
				<tr>
					<th scope="col">제목</th>
					<td scope="col">
						${board.boardTitle}
					</td>
				</tr>
				<tr>
					<th scope="col">작성자</th>
					<td scope="col">
						${board.boardWriter}
					</td>
				</tr>
				<tr>
					<th scope="col">첨부파일</th>
					<td scope="col">
							<c:if test="${not empty board.originalFilename}">
								<button type="button" class="btn btn-outline-secondary"
									onclick="location.href='${pageContext.request.contextPath}/board/fileDownload.bo?boardNo=${board.boardNo}'">${board.originalFilename}</button>
							</c:if>
							<c:if test="${empty board.originalFilename}">
								파일없음
							</c:if>
						</td>
				</tr>
				<tr>
					<th scope="col">내용</th>
					<td scope="col">
						<textarea name="content" rows="10" cols="50" required>${board.content}</textarea>
					</td>
				</tr>
			</table>
			<button type="submit" class="btn btn-outline-success">등록</button>&emsp;
			<button type="reset" class="btn btn-outline-success">초기화</button>
		</form>
	</div>
<jsp:include page="/WEB-INF/views/common/footer.jsp" />