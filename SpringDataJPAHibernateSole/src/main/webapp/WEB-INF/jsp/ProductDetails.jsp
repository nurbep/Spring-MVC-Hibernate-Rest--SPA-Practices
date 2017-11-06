<!DOCTYPE HTML>
<html>
<head>
<title>Product Details</title>
<style type="text/css">@import url(resources/css/main.css);</style>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>
    <p>
        <h5>Details:</h5>
        Product Name: ${product.name}<br/>
        Description: ${product.description}<br/>
        Price: $${product.price}<br/>
        Hot Line: ${product.hotLine.areacode}-${product.hotLine.prefix}-${product.hotLine.number}
    </p>
    
    <form action="listproducts" method="get">
           <input id="submit" type="submit"  
                value="List products">
	</form>
    
</div>
</body>
</html>