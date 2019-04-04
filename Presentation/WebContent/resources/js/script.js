document.querySelectorAll(".deleteButton").forEach(function(e){
	e.addEventListener("click",function(e){
		e.preventDefault();
		requestDelete(e.target);
	});
});

document.querySelectorAll(".createUser").forEach(function(e){
	e.addEventListener("click",function(e){
		e.preventDefault();
		requestPost(e.target);
	});
});


function requestDelete(element){
	 
	 $.ajax({
		    type:"DELETE",
		    url:"http://localhost:8090/Presentation/console/employee/"+element.id,
		    success: function(data) {
		    	var row = element.parentElement.parentElement
		    	row.classList.add("hidden");
		    	document.getElementById("userTable").deleteRow(row.rowIndex)
		    },
		    dataType: 'json',
		  });
}

function requestPost(element){
	var type = $("#role").val();
	 $.ajax({
		    type:"POST",
		    contentType: "application/json",
		    url:"/Presentation/console/"+type,
		    data:JSON.stringify($("#mainForm").serializeObject()),
		    dataType: 'json',
		  });
	 
	 
}






