<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="header.jsp" />


<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
        <p id="#errorForm">Не правильний логін або пароль</p>
</c:if>

    <form name='form_login' action="j_spring_security_check" method='POST'>
        <table>
            <tr>
                <td>логін:</td>
                <td><input type='text' name='user_login' value=''/></td>
            </tr>
            <tr>
                <td>пароль:</td>
                <td><input type='password' name='password_login'/></td>
            </tr>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <tr>
                <td>Запам&#8217ятати мене: <input name="_spring_security_remember_me" type="checkbox" /></td>
            </tr>
            <tr>
                <td><input type='submit' name='submit' value='увійти'/></td>
            </tr>
        </table>
    </form>

<jsp:include page="footer.jsp" />