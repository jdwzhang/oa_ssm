<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>各种测试页</title>
    <script src="scripts/jquery-3.3.1.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            var path = ${pageContext.request.contextPath};
            console.log(path);
        })
    </script>
</head>
<body>

</body>
</html>
