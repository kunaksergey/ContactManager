<%--
  Created by IntelliJ IDEA.
  User: sa
  Date: 16.09.16
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="<c:url value="/logout"/>">
    <spring:message code="label.logout"/>
  </a>
  <h2><spring:message code="label.title"/> </h2>
  <form:form action="add" method="POST" commandName="contact">
    <table>
      <tr>
        <td><form:label path="firstName">
          <spring:message code="label.firstaname"/>
        </form:label>
        </td>
        <td><form:input path="firstname"/></td>
      </tr>
      <tr>
      </tr>
      <tr>
      </tr>
      <tr>
      </tr>
      <tr>
      </tr>
      <tr>
      </tr>
      </table>
  </form:form>
  </body>
</html>
