document.querySelectorAll(".deleteButton").forEach(function(e){
	e.addEventListener("click",function(e){
		e.preventDefault();
		requestDelete(e.target);
	});
});


function requestDelete(element){
	 
	 $.ajax({
		    type:"DELETE",
		    url:"/Presentation/UserManager/specialUsers/"+element.id,
		    success: function(data) {
		    	var row = element.parentElement.parentElement
		    	row.classList.add("hidden");
		    	document.getElementById("userTable").deleteRow(row.rowIndex)
		    },
		    dataType: 'jsonp',
		  });
}

