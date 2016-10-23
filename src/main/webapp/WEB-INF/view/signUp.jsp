<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp" />

<h1>реєстрація</h1>
<form:form method="POST" action="registrationHandler" commandName="person">
   <table>
        <tr>
            <td><form:label path="login">логін</form:label></td>
            <td><form:input path="login"/></td>
            <td><form:errors path="login"/></td>
        </tr>
        <tr>
            <td><form:label path="name">ім'я</form:label></td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="secondName">прізвище</form:label></td>
            <td><form:input path="secondName" /></td>
            <td><form:errors path="secondName"/></td>
        </tr>
        <tr>
            <td><form:label path="eMail">e-mail</form:label></td>
            <td><form:input path="eMail" /></td>
            <td><form:errors path="eMail"/></td>
        </tr>
        <tr>
            <td><form:label path="password">пароль</form:label></td>
            <td><form:input path="password" /></td>
            <td><form:errors path="password"/></td>
        </tr>
        <tr>
            <td><form:label path="confirmPassword">повторіть пароль</form:label></td>
            <td><form:input path="confirmPassword" /></td>
            <td><form:errors path="confirmPassword"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="зареєструватися"/>
            </td>
        </tr>
    </table>
</form:form>

<jsp:include page="footer.jsp" />