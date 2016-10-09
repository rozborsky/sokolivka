<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="header.jsp" />

<h1>галерея</h1>


</br>

<script language="javascript">
            $(document).ready(function(){
                PopUpHide();
            });
            function PopUpShow(){
                $("#popup1").show();
            }
            function PopUpHide(){
                $("#popup1").hide();
            }
        </script>

<img src="resources/1.jpg"/>
<img src="resources/2.jpg"/>
<img src="resources/3.jpg"/>
<img src="resources/4.jpg"/>
<img src="resources/5.jpg"/>
<img src="resources/6.jpg"/>
<img src="resources/7.jpg"/>
<img src="resources/1.jpg"/>
<img src="resources/2.jpg"/>
<img src="resources/3.jpg"/>
<img src="resources/4.jpg"/>
<img src="resources/5.jpg"/>
<img src="resources/6.jpg"/>

<a href="javascript:PopUpShow()">
    <img src="resources/7.jpg"/>
</a>

<jsp:include page="footer.jsp" />