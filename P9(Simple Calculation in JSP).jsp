<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
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
	input[type = "text"]{
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
    <h1>Enter Two Numbers</h1>
    <form method="post">
        <input type="text" name="num1" placeholder ="Enter Number 1"><br><br>
        <input type="text" name="num2" placeholder ="Enter Number 2"><br><br>
        <input type="submit" name="submit" value="Calculate">
    </form>

    <%
        if (request.getParameter("submit") != null) {
            try {
                int n1 = Integer.parseInt(request.getParameter("num1"));
                int n2 = Integer.parseInt(request.getParameter("num2"));
                int s = n1 + n2;
                int d = n1 - n2;
                int p = n1 * n2;
                int f = n1 / n2;
    %>
		
    <h3>Results:</h3>
		<ul>
			<li><p>Sum : <%= s %></p></li>
			<li><p>Difference : <%= d %></p></li>
			<li><p>Product : <%= p %></p></li>
			<li><p>Division : <%= f %></p></li>
		</ul>
    <% 
            } catch (Exception e) {
    %>
                <p style="color:#c7522a;">Please enter valid numbers.</p>
    <%
            }
        }
    %>
</body>
</html>
