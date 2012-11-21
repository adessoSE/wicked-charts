$(document).ready(function(){
	
	$('#codeDialog').modal({
		backdrop: true,
		keyboard: true,
		show: false,
	});
	
	SyntaxHighlighter.all();

	// disable jQuery $ operator, to use it with other js frameworks 
	jQuery.noConflict();

	// add custom parameter to h:commandLinks
    jQuery(document).ready(function(){
        jQuery(".tabLink").attr("data-target", "#chart");
    });

});