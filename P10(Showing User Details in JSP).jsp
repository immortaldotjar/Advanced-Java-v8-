<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
</head>
<style>
	*{
		box-sizing:border-box;
		margin:0;
		padding:0;
	}
	body{
		background-color:#fbf2c4;
		display:flex;
		justify-content:center;
		align-items:center;
		flex-direction:column;
		font-family:Calibri;
		height:100vh;
	}
	h1{
		font-size:40px;
		margin-bottom:20px
	}
	h3{
		margin:10px;
	}
	p{
		margin-bottom:20px;
	}
	span{
		font-size: 20px;
		font-weight: 600;
	}
	input[type = "text"],input[type = "email"]{
		border:none;
		background-color:#008585;
		height:40px;
		width:300px;
		padding:5px 20px;
		border-radius:20px;
		color:white;
		
	}
	
	ul{
		list-style:none;
		}
	input:focus{
		outline:none;
	}
	input::placeholder{
		color:whitesmoke;
	}
	
	input[type = "submit"]{
		border:none;
		background-color:#74a892;
		padding:10px;
		height:40px;
		width:100%;
		color:white;
		border-radius:20px;
	}
</style>
<body>
    <body>

	<%
    		String name = request.getParameter("name");
    		String email = request.getParameter("email");
	%>

	<h1>Enter Your Details</h1>
	<form method="post">
    		<p><input type="text" name="name" placeholder="Name" required></p>
   		<p><input type="email" name="email" placeholder="Email" required></p>
    		<input type="submit" value="Submit">
	</form>

	<% if (name != null && email != null) { %>
    		<h3>Your Entered Details:</h3>
    		<p><strong>Name:</strong> <%= name %></p>
    		<p><strong>Email:</strong> <%= email %></p>
	<% } %>
</body>
</html>
