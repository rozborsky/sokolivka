<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div id="navigationBar">
    <a href="main">головна</a>
    <a href="history">історія</a>
    <a href="gallery">галерея</a>
    <a href="chat">чат</a>

    <sec:authorize access="isAnonymous()">
        <a href="signUp">реєстрація</a>
        <a href="signIn">вхід</a>
    </sec:authorize>

    <sec:authorize access="isAuthenticated()">
       <a href="cabinet" id="username"><sec:authentication property="principal.username" /></a>
       <a href="j_spring_security_logout">logout</a>
    </sec:authorize>
</div>