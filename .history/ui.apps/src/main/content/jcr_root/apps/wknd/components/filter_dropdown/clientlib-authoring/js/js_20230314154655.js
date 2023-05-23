$(".filter").change(function() {
  var filterValue = $(this).val();
  var row = $('.row'); 
    
  row.hide()
  row.each(function(i, el) {
       if($(el).attr('data-type') == filterValue) {
           $(el).show();
       }
  })
   
});