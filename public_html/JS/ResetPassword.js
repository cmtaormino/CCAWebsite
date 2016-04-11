function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}

function submitReset() {
    window.alert("A message has been sent to an Administrator, you will recieve an email with a new password.");
    loadPage("Login.html");
}

function sendEmail() {
    var email = document.getElementById('SecurityKey').value;
    var starter = "An email has been sent to ";
    var message = starter.concat(email, ".");
    window.alert(message);
    document.getElementById('submitButton').disabled = false;
}