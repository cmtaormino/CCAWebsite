function getProjectTasks(projectName){
    if(document.getElementById(projectName).childNodes.length < 3){
        var project = document.getElementById(projectName);
        var taskList = document.createElement('ol');
        
        var taskOne = document.createElement('li');
        taskOne.appendChild(document.createTextNode('Present'));
        taskOne.onclick = function(){ loadPage('Task.html');}
        taskList.appendChild(taskOne);
        
        var projectPage = document.createElement('li');
        projectPage.appendChild(document.createTextNode('Go to Project Page'));
        projectPage.onclick = function(){ loadPage('Project.html');}
        taskList.appendChild(projectPage);
        
        project.appendChild(taskList);
    }
    else{
        var list = document.getElementById(projectName).childNodes;
        var nodes = Array.prototype.slice.call(list);
        var node;
        for(var i = 1; i<nodes.length; i++){
            node = nodes.pop()
            node.parentNode.removeChild(node);
        }
    }
}

function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}