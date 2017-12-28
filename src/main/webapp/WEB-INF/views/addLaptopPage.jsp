<%--
  Created by IntelliJ IDEA.
  User: Olexii
  Date: 27.12.2017
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>add new laptop</title>
</head>
<body>

    <div>
        <div>
            <h1>Додати новий ноутбук</h1>
        </div>

        <div>
            <form:form method="POST" modelAttribute="laptop" action="">
                <div>
                    <div class="textErr">
                            ${error}
                    </div>

                    <div>
                        <div>
                            <div>
                                <form:label path="producedBy">Виробник:</form:label>
                            </div>
                            <div>
                                <form:input path="producedBy"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="title">Назва:</form:label>
                            </div>
                            <div>
                                <form:input path="title"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="price">Ціна:</form:label>
                            </div>
                            <div>
                                <form:input path="price"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="operationSystem">Операційна система:</form:label>
                            </div>
                            <div>
                                <form:input path="operationSystem"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="processor">Процесор:</form:label>
                            </div>
                            <div>
                                <form:input path="processor"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="screedSize">Розміри екрана:</form:label>
                            </div>
                            <div>
                                <form:input path="screedSize"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="ram">Оперативна пам'ять:</form:label>
                            </div>
                            <div>
                                <form:input path="ram"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="hdd">Жорсткий диск:</form:label>
                            </div>
                            <div>
                                <form:input path="hdd"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="color">Колір:</form:label>
                            </div>
                            <div>
                                <form:input path="color"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="weight">Вага:</form:label>
                            </div>
                            <div>
                                <form:input path="weight"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="battery">Батарея:</form:label>
                            </div>
                            <div>
                                <form:input path="battery"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="description">Опис:</form:label>
                            </div>
                            <div>
                                <form:textarea path="description"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <div>
                                <form:label path="videoCard">Відеокарта:</form:label>
                            </div>
                            <div>
                                <form:input path="videoCard"/>
                            </div>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <form:label path="backLighting">Підсвідка клавіатури:</form:label>
                            <form:checkbox path="backLighting"/>
                                <%--<td><form:errors path="login" class="textErr"/><td>--%>
                        </div>

                        <div>
                            <input type="submit" class="button" value="Зберігти">
                            <%--<input type="button"  value="Повернутися до попередньої сторінки" onclick="location.href = './views/login.jsp'"/>--%>
                            <a href="./" class="button">Повернутися до попередньої сторінки</a>
                        </div>
                    </div>
                </div>
            </form:form>
        </div>

    </div>




</body>
</html>
