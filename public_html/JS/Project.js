function loadPage(pageToLoad) {
   window.location.href=pageToLoad;
}

function getCompletedTasks(){
    if(document.getElementById('CompletedTask').childNodes.length < 2){
        var project = document.getElementById('CompletedTask');
        var taskList = document.createElement('ol');
        
        var taskOne = document.createElement('li');
        taskOne.appendChild(document.createTextNode('Sample Task'));
        taskOne.onclick = function(){ loadPage('Task.html');}
        taskList.appendChild(taskOne);
        
        project.appendChild(taskList);
    }
    else{
        var list = document.getElementById('CompletedTask').childNodes;
        var nodes = Array.prototype.slice.call(list);
        var node;
        for(var i = 1; i<nodes.length; i++){
            node = nodes.pop();
            node.parentNode.removeChild(node);
        }
    }
}

function getTasksInProgress(){
    if(document.getElementById('TaskInProgress').childNodes.length < 2){
        var project = document.getElementById('TaskInProgress');
        var taskList = document.createElement('ol');
        
        var taskOne = document.createElement('li');
        taskOne.appendChild(document.createTextNode('Sample Task'));
        taskOne.onclick = function(){ loadPage('Task.html');}
        taskList.appendChild(taskOne);
        
        project.appendChild(taskList);
    }
    else{
        var list = document.getElementById('TaskInProgress').childNodes;
        var nodes = Array.prototype.slice.call(list);
        var node;
        for(var i = 1; i<nodes.length; i++){
            node = nodes.pop();
            node.parentNode.removeChild(node);
        }
    }
}

function getPendingTasks(){
    if(document.getElementById('PendingTask').childNodes.length < 2){
        var project = document.getElementById('PendingTask');
        var taskList = document.createElement('ol');
        
        var taskOne = document.createElement('li');
        taskOne.appendChild(document.createTextNode('Sample Task'));
        taskOne.onclick = function(){ loadPage('Task.html');}
        taskList.appendChild(taskOne);
        
        project.appendChild(taskList);
    }
    else{
        var list = document.getElementById('PendingTask').childNodes;
        var nodes = Array.prototype.slice.call(list);
        var node;
        for(var i = 1; i<nodes.length; i++){
            node = nodes.pop();
            node.parentNode.removeChild(node);
        }
    }
}

function createTask() {
    loadPage('CreateTask.html');
}

function save() {
    alert("Your chnages have been saved");
}