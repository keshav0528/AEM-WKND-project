$(document).ready(function () {
  var $rows = $('table tr');
  $("#filter").change(function() {

      var val = '^(?=.*\\b' + $.trim($(this).val()).split(/\s+/).join('\\b)(?=.*\\b') + ').*$',
          reg = RegExp(val, 'i'),
          text;
      if ($(this).val() !== 'all') {

          $rows.show().filter(function() {
              text = $(this).data('type').replace(/\s+/g, ' ');
              return !reg.test(text);
          }).hide();

      } else {
          $rows.show();
      }
  });
});