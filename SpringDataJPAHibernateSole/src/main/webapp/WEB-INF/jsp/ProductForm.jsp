<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(resources/css/main.css);</style>
</head>
<body>

<div id="global">
<form action="product" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p>
            <label for="name">Product Name: </label>
            <input type="text" id="name" name="name" 
                tabindex="1">
        </p>
        <p>
            <label for="description">Description: </label>
            <input type="text" id="description" 
                name="description" tabindex="2">
        </p>
        <p>
            <label for="price">Price: </label>
            <input type="text" id="price" name="price" 
                tabindex="3">
        </p>
        <p>
            <label for="areaCode">Hot Line: </label>
           <input type="text" id="areaCode" size="3"
                name="hotLine.areacode" tabindex="4">
 
             <input type="text"   size="3"
                name="hotLine.prefix" tabindex="5">
 
             <input type="text"  size="4"
                name="hotLine.number" tabindex="6">
 
            <!--  <input type="text"  size="12"
                name="hotLine" placeholder="nnn-nnn-nnnn"> -->
        </p>
        
        <p id="buttons">
            <input id="reset" type="reset" >
            <input id="submit" type="submit" tabindex="7" 
                value="Add Product">
        </p>
    </fieldset>
</form>
</div>
</body>
</html>
