<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="scripts/jquery-3.3.1.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#sub").click(function () {
                var inputName = $("#inputName").val();
                var inputPassword = $("#inputPassword").val();
                console.log(inputName + ":" + inputPassword);
            });
        });
    </script>
</head>
<body>
<form>
    <div>
        <div>
            <span>用户名：</span>
            <input type="text" name="name" id="inputName" required>
        </div>
        <div>
            <span>密 码：</span>
            <input type="password" name="pass" id="inputPassword">
        </div>
        <div>
            <input type="submit" value="登录" id="sub">
        </div>
    </div>
</form>
</body>
</html>
