GET: $(document).ready(
		function() {

			// GET REQUEST
			$("#getALlBooks").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "api/v1/fetch/city",
					success : function(result) {
						if (result.status == "success") {
							$('#lc option').empty();
							var custList = "";
							$.each(result.data,
									function(i, book) {
										var user = "City Name  "
												+ city.cityName;
						
										$('#lc .list-group').append(
												city)
									});
							console.log("Success: ", result);
						} else {
							$("#lc").html("<strong>Error</strong>");
							console.log("Fail: ", result);
						}
					},
					error : function(e) {
						$("#lc").html("<strong>Error</strong>");
						console.log("ERROR: ", e);
					}
				});
			}
		})