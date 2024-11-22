<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        body {
            height: 100vh;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            background-image: linear-gradient(to right , rgba(202, 14, 196, 0.3),rgba(208, 102, 102, 0.9)),url(Images/image.png);
        }
         h2{
            color: aliceblue;
         }
        .form-container {
            border: 2px solid white;
            padding: 30px;
            border-radius: 10px;
            /* background-color: white; */
            backdrop-filter: blur(30px);
            box-shadow: 5px 4px 6px rgba(255, 255, 255, 0.938);
        }

        .form-container input {
            margin-bottom: 15px;
            box-shadow: 5px 4px 6px rgba(66, 186, 42, 0.938);
        }
    </style>
</head>

<body>
    <div class="container">
        <div class="row justify-content-center align-items-center">
            <div class="col-md-6 col-lg-4">
                <div class="form-container">
                    <form action="LoginServlet" method="get">
                        <h2 class="text-center mb-4">Login</h2>
                        <div class="mb-3">
                            <input type="text" class="form-control" name="email" placeholder="Email" required>
                        </div>
                        <div class="mb-3">
                            <input type="password" class="form-control" name="password" placeholder="Password" required>
                        </div>
                        <div class="d-flex justify-content-evenly">
                            <button class="btn btn-primary" type="submit">Login</button>
                            <a href="signup.html" class="btn btn-primary">Sign Up</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>

</html>
