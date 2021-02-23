<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
	<div>
		<div>
			<h1>Money Convertor in Crypto</h1>
			<h2>Hello ${message}</h2>

			<!--Click on this <strong><a href="next">link</a></strong> to visit another page.-->
			<form method="post" action="next">
			<b>Select Crypto Currency to be used for Convert Money:<b>
			<select id="Crypto Coin" name="coin" >
               <option value="BCH">Bitcoin Cash</option>
               <option value="BTC">Bitcoin</option>
               <option value="ETH">Ether</option>
               <option value="LTC">Lite Coin</option>
               <option value="XRP">Ripple</option>
              </select>
<br><br><br><br><br><br>
From: THB <br><br>
To:   INR<br><br>
 <input type="submit" value="Submit">
              </form>
		</div>
	</div>
</body>
</html>
