/**
 * 
 */

//		$(document).ready(function(){
//			addPhoneInputs("add");
//		});
//		$(document).ready(function(){
//			addEmailInputs("add");
//		});
		
//		$("input[name='contactIds']").change(function() {
//			if ($(this).is(':checked')) {
//				$("tbody").children().css("background", "transparent");
//				$(this).parent().parent().css("background-color", "#909090");
//			}
//		});
//		$("#open-edit-form-btn").click(function(){
//			var idContact = $("input[name='contactIds']:checked").val();
//		});
		
		
		var addDialog;
		
		$(function() {
			
			addDialog = $("#div-add-order-form").dialog({
			      autoOpen: false,
			      height: 250,
			      width: 1200,
			      resizable: false,
			      modal: true
			    });
		});
		
		showAddDialog = function(dialogId) {
			$("#div-add-order-form").find("input:text").val('');
//			$("div[id^='addPhoneDiv']").remove();
//			$("div[id^='addEmailDiv']").remove();
			addDialog.dialog("open");
		}