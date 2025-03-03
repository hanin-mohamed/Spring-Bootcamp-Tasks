<html>
<head>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body >
<h1>Hello to Student App</h1>
<h3>username is : ${userModelResult.username} </h3>
<h3>password is : ${userModelResult.password} </h3>
<h3>Country is : ${userModelResult.country} </h3>
<h3>programming Language is : ${userModelResult.programmingLanguage} </h3>
<h3>First operating system is : ${userModelResult.os} </h3>


</body>
</html>