<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dosya Yukleme</title>
</head>
<body>

<div align ="center">

<div><h1>S3  Dosya Yukleme</h1></div>
<div>
<form action ="upload" method = "post" enctype = "multipart/form-data">
<p> Description : <input type ="text" name= "Description	" size="30" required/> </p>

<p> <input type ="file" name = "file" required /></p>
<p> <button type= "submit" >Gonder</button> </p>


</form>


</form>
</div>
</div>


</body>
</html>