<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Employee Registration</title>
    <!-- Link to custom stylesheet -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <script>
        // JS Function to validate passwords
        function validatePasswords(event) {
            // Get the password and confirm password fields
            const password = document.getElementById("password").value;
            const confirmPassword = document.getElementById("confirmPass").value;
            // Check if passwords match
            if (password !== confirmPassword) {
                // Prevent form submission
                event.preventDefault();

                // Display error message
                const errorMessage = document.getElementById("passwordError");
                errorMessage.style.display = "block";
                errorMessage.innerText = "Passwords do not match!";
            }
        }
    </script>
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h2 class="text-center mb-4">Registration Form</h2>
            <!-- Add onsubmit event to the form -->
            <form:form action="registerForm" modelAttribute="empModel" class="p-4 border rounded bg-white shadow-sm" onsubmit="validatePasswords(event)">

                <!-- Username Input -->
                <div class="form-group mb-3">
                    <label> Username</label>
                    <form:input type="text" placeholder="Enter Username" path="name" class="form-control" />
                    <form:errors path="name" cssClass="alert-danger"/>
                </div>

                <!-- Email Input -->
                <div class="form-group mb-3">
                    <label>Email address</label>
                    <form:input type="text" placeholder="email" path="email" class="form-control" />
                    <form:errors path="email" cssClass="alert-danger"/>
                </div>

                <!-- Password Input -->
                <div class="form-group mb-3">
                    <label> Password</label>
                    <form:input type="password" id="password" placeholder="password" path="password" class="form-control" />
                    <form:errors path="password" cssClass="alert-danger"/>
                </div>

                <!-- Confirm Password Input -->
                <div class="form-group mb-3">
                    <label>Confirm Password</label>
                    <form:input type="password" id="confirmPass" placeholder="confirm password" path="confirmPass" class="form-control" />
                    <form:errors path="confirmPass" cssClass="alert-danger"/>
                </div>

                <!-- Error Message for Password Mismatch -->
                <p id="passwordError" style="color: #fd5252; display: none;"></p>

                <div class="form-group">
                    <input type="submit" class="btn btn-danger btn-block" />
                </div>

            </form:form>
        </div>
    </div>
</div>
</body>
</html>
