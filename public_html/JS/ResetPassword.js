function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}

function submitReset() {
    window.alert("A message has been sent to an Administrator, you will recieve an email with a new password.");
    loadPage("Login.html");
}