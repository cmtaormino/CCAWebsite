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

function submitRequest() {
    window.alert("Your account request has been sent to an Administrator. An email will be sent to the provided email address.");
    loadPage("Login.html");
}