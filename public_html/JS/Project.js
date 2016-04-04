function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}

function getCompletedTasks(){
    if(document.getElementById('CompletedTasks').childNodes.length < 4){
        var project = document.getElementById('CompletedTasks');
        var taskList = document.createElement('ol');
        
        var taskOne = document.createElement('li');
        taskOne.appendChild(document.createTextNode('Sample Task'));
        taskOne.onclick = function(){ loadPage('Task.html');}
        taskList.appendChild(taskOne);
        
        project.appendChild(taskList);
    }
    else{
        var list = document.getElementById('CompletedTasks').childNodes;
        var nodes = Array.prototype.slice.call(list);
        var node;
        for(var i = 3; i<nodes.length; i++){
            node = nodes.pop()
            node.parentNode.removeChild(node);
        }
    }
}

function getTasksInProgress(){
    if(document.getElementById('TasksInProgress').childNodes.length < 4){
        var project = document.getElementById('TasksInProgress');
        var taskList = document.createElement('ol');
        
        var taskOne = document.createElement('li');
        taskOne.appendChild(document.createTextNode('Sample Task'));
        taskOne.onclick = function(){ loadPage('Task.html');}
        taskList.appendChild(taskOne);
        
        project.appendChild(taskList);
    }
    else{
        var list = document.getElementById('TasksInProgress').childNodes;
        var nodes = Array.prototype.slice.call(list);
        var node;
        for(var i = 3; i<nodes.length; i++){
            node = nodes.pop()
            node.parentNode.removeChild(node);
        }
    }
}

function getPendingTasks(){
    if(document.getElementById('PendingTasks').childNodes.length < 4){
        var project = document.getElementById('PendingTasks');
        var taskList = document.createElement('ol');
        
        var taskOne = document.createElement('li');
        taskOne.appendChild(document.createTextNode('Sample Task'));
        taskOne.onclick = function(){ loadPage('Task.html');}
        taskList.appendChild(taskOne);
        
        project.appendChild(taskList);
    }
    else{
        var list = document.getElementById('PendingTasks').childNodes;
        var nodes = Array.prototype.slice.call(list);
        var node;
        for(var i = 3; i<nodes.length; i++){
            node = nodes.pop()
            node.parentNode.removeChild(node);
        }
    }
}