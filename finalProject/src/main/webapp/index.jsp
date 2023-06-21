<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BUCKET LIST</title>
    <link rel="stylesheet" href="resources/css/common.css">
    <link rel="stylesheet" href="resources/css/main.css">
    <link rel="stylesheet" type="text/css" href="resources/css/swiper.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <script src="resources/js/swiper.min.js"></script>
</head>
<body>
    <header>
        <div class="hd center12">
            <a href="" class="menuBtn">
                <span></span>
                <span class="center"></span>
                <span></span>
            </a>
            <h1><a href=""><img src="resources/img/logo.png" alt=""></a></h1>
            <ul class="rightMenu">
                <li><a href="${pageContext.request.contextPath}/views/member/login.jsp">LOGIN</a></li>
                <li><a href="">JOIN</a></li>
            <!-- 수정 1 test -->
                <!-- 로그인했을 때 로그인, 회원가입 사라지고 노출되는 버튼 -->
                <!-- <li><a href="">LOGOUT</a></li> -->
                <!-- <li><a href="">MYPAGE</a></li> -->

                <!-- 로그인 안한 상태에서 누르면 로그인 안내멘트 뜨고 로그인 페이지로 이동 -->
                <li><a href="">MY BOOKING</a></li>

                <!-- 호스트 아이디로 로그인했을 때 노출되는 버튼 -->
                <!-- <li><a href="" class="plusBtn">HOST PAGE</a></li> -->
    
                <!-- 관리자 아이디로 로그인했을 때 노출되는 버튼 -->
                <!-- <li><a href="" class="plusBtn">ADMIN PAGE</a></li> -->

                <li><a href="" class="reserBtn">RESERVATION</a></li>
            </ul>

        </div>
    </header>
    <div class="fkHeader"></div>

    <div class="mainVisual cf">
        <div class="imgBn swiper-container">
            <ul class="main_banner swiper-wrapper">
                <li class="swiper-slide imgArea" style="background-image: url(resources/img/main_bn01.jpg);"></li>
                <li class="swiper-slide imgArea" style="background-image: url(resources/img/main_bn02.jpg);"></li>
            </ul>
            <div class="swiper-pagination"></div>
        </div>
        <script>    
            var swiper = new Swiper('.swiper-container', {
                  autoplay: {
                    delay: 3000,
                },
                effect : 'fade',
                speed : 1500,
                // pagination: {				
                //     el: '.swiper-pagination',
                //     clickable: true,
                // },
            });			    
        </script>

        <form action="" class="reservation">
            <div class="area">
                <p class="reTxt">AREA</p>
                <input type="text" placeholder="지역 선택" readonly>
            </div>

            <div class="date">
                <p class="reTxt">CHECK IN/OUT</p>
                <input type="text" placeholder="날짜를 선택해주세요." readonly>
            </div>
            
            <div class="num">
                <p class="reTxt">PERSONS</p>
                <input type="number" value="22" readonly>
            </div>
            <input type="submit" value="SEARCH" class="searchBtn">
        </form>
    </div>

    <div class="bestWrap">
        <div class="center12">
            <h3 class="mainTit serif">Best Destination</h3>
            <p class="mainTxt">베스트 여행지 어쩌고 저쩌고</p>

            <ul class="desList">
                <li>
                    <a href="">
                        <div class="imgArea"><div class="img" style="background-image: url(resources/img/local01.jpg);"></div></div>
                        <p class="tit">서울</p>
                    </a>
                </li>
                <li>
                    <a href="">
                        <div class="imgArea"><div class="img" style="background-image: url(resources/img/local02.jpg);"></div></div>
                        <p class="tit">제주</p>
                    </a>
                </li>
                <li>
                    <a href="">
                        <div class="imgArea"><div class="img" style="background-image: url(resources/img/local03.jpg);"></div></div>
                        <p class="tit">부산</p>
                    </a>
                </li>
                <li>
                    <a href="">
                        <div class="imgArea"><div class="img" style="background-image: url(resources/img/local04.jpg);"></div></div>
                        <p class="tit">인천</p>
                    </a>
                </li>
                <li>
                    <a href="">
                        <div class="imgArea"><div class="img" style="background-image: url(resources/img/local05.jpg);"></div></div>
                        <p class="tit">강원</p>
                    </a>
                </li>
            </ul>
        </div>
    </div>

    <div class="themeWrap center12">
        <ul class="themeTab">
            <li><a href="">커플여행</a></li>
            <li><a href="">가족여행</a></li>
            <li><a href="">MT</a></li>
        </ul>

        <ul class="accList">
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room01.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like_ac.png" alt=""></a>
                </div>
                <p class="local">서울</p>
                <p class="name ellipsis">서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>100,000</strong>원~</p>
            </li>
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room02.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like.png" alt=""></a>
                </div>
                <p class="local">서울</p>
                <p class="name">숙소이름 샬라샬라</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>100,000</strong>원~</p>
            </li>
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room03.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like.png" alt=""></a>
                </div>
                <p class="local">서울</p>
                <p class="name">숙소이름 샬라샬라</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>100,000</strong>원~</p>
            </li>
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room04.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like.png" alt=""></a>
                </div>
                <p class="local">서울</p>
                <p class="name ellipsis">서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>100,000</strong>원~</p>
            </li>
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room05.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like.png" alt=""></a>
                </div>
                <p class="local">제주</p>
                <p class="name">숙소이름 샬라샬라</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>100,000</strong>원~</p>
            </li>
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room06.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like.png" alt=""></a>
                </div>
                <p class="local">서울</p>
                <p class="name">숙소이름 샬라샬라</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>100,000</strong>원~</p>
            </li>
        </ul>
    </div>

    <div class="bestReviewWrap">
        <h3 class="mainTit serif">Best Accommodations</h3>
        <p class="mainTxt">평점 높은 숙소들 어쩌고 저쩌고</p>

        <ul class="accList center12">
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room04.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like_ac.png" alt=""></a>
                </div>
                <p class="local">서울</p>
                <p class="name ellipsis">서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스 서울라이트 펜트하우스</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>120,000</strong>원~</p>
            </li>
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room05.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like.png" alt=""></a>
                </div>
                <p class="local">부산</p>
                <p class="name">숙소이름 샬라샬라</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>99,990</strong>원~</p>
            </li>
            <li class="listLi" onclick="location.href=''">
                <div class="imgArea" style="background-image: url(resources/img/room06.jpg);">
                    <img src="resources/img/ratio43.png" alt="" class="ratio">
                    <a href="" class="heartBtn"><img src="resources/img/like.png" alt=""></a>
                </div>
                <p class="local">인천</p>
                <p class="name">숙소이름 샬라샬라</p>
                <ul class="detail">
                    <li>
                        <img src="resources/img/like_line.png" alt="">
                        <p>10</p>
                    </li>
                    <li>
                        <img src="resources/img/star.png" alt="">
                        <p>4.9</p>
                    </li>
                </ul>
                <p class="price">1박 <strong>70,000</strong>원~</p>
            </li>
        </ul>
    </div>

    <footer>
        <div class="center12">
            <p class="ft_txt">
                <span><strong class="name">BUCKET LIST</strong></span>
                <span><strong>대표이사</strong> 홍길동</span>
                <span><strong>주소</strong> 주소적어어어어어어어어어어어어어어엉</span>
            </p>
            <p class="ft_txt">
                <span><strong>전화번호</strong> 02-111-1111</span>
                <span><strong>팩스번호</strong> 02-111-2222</span>
                <span><strong>사업자등록번호</strong> 111-22-33333</span>
                <span><strong>이메일</strong> bucketlist@bk.co.kr</span>
                <span><strong>개인정보보호책임자</strong> 홍길동</span>
            </p>
            <p class="copy">Copyright © BUCKET LIST All rights reserved.</p>
        </div>
    </footer>
    
    <a href="" class="topBtn"><img src="resources/img/arr_top.png" alt=""></a>
    <script>
        $(window).scroll(function(){
            if ($(this).scrollTop() > 300){
                $('.topBtn').fadeIn();
            } else{
                $('.topBtn').fadeOut();
            }
        });
        $('.topBtn').click(function(){
            $('html, body').animate({scrollTop:0},400);
            return false;
        });
        </script>
</body>
</html>
