function timeLoader()
{
	//alert()
	var xmlhttp=new XMLHttpRequest();
	xmlhttp.open("GET","/DigitalClock/Clock?data1=oracle&data2=xyz",true);
	
	xmlhttp.onreadystatechange=function()
	  {
	  if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
		timeRequestHandler(xmlhttp);
		}
	  }
  
    xmlhttp.send();
}

function timeRequestHandler(request)
{
	var responseData = request.responseText;
	//alert(responseData);
	var jsonObject = eval('(' + responseData + ')');
	//alert(jsonObject.date);
	//var timerval = document.getElementById("timer");
	//timerval.innerHTML=jsonObject.date;
	
	$("#timer").html(jsonObject.date + ' ' + jsonObject.name);
	
	setTimeout(timeLoader, 200);
}