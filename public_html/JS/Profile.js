function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}

function handleAccountRequest() {
    loadPage('AccountCreation.html');
}

function handleChangeRequest() {
    loadPage('EditAccount.html');
}