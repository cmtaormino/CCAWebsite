function getProjectTasks(projectName){
    if(document.getElementById(projectName).childNodes.length < 2){
        var project = document.getElementById(projectName);
        var taskList = document.createElement('ol');
        
        var taskOne = document.createElement('li');
        taskOne.appendChild(document.createTextNode('Sample Task'));
        taskOne.onclick = function(){ loadPage('Task.html');}
        taskList.appendChild(taskOne);
        
        var projectPage = document.createElement('li');
        projectPage.appendChild(document.createTextNode('Go to Project Page'));
        projectPage.onclick = function(){ loadPage('Project.html');}
        taskList.appendChild(projectPage);
        
        project.appendChild(taskList);
    }
}

function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}