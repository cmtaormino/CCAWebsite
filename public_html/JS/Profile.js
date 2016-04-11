function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}

function handleAccountRequest() {
    loadPage('AccountCreation.html');
}

function handleChangeRequest() {
    loadPage('EditAccount.html');
}

function save() {
    alert("Your changes have been saved.");
}