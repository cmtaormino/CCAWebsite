window.onload = function() {
 var pw = document.getElementById('password');
 pw.onpaste = function(e) {
   e.preventDefault();
 }
 
 var pwr = document.getElementById('passwordRetyped');
  pwr.onpaste = function(e) {
   e.preventDefault();
 }
}

function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}