let tasks = [];

function addTask() {
    let input = document.getElementById("taskInput");
    let task = input.value;
    if (task === "") return; 
    
    tasks.push(task); 
    input.value = ""; 
    showTasks();
}

function showTasks() {
    let list = document.getElementById("taskList");
    list.innerHTML = ""; 
    for (let i = 0; i < tasks.length; i++) {
        list.innerHTML += "<li>" + tasks[i] + "</li>";
    }
}

function removeTask() {
    let input = document.getElementById("taskInput");
    let task = input.value;
    
    if (task === "") return;

    if (tasks.includes(task)) {
        let index = tasks.indexOf(task);
        tasks.splice(index, 1);
        input.value = ""; // Clear input only on success
        showTasks();      // Refresh list only if something changed
    } else {
        alert("Task not found");
    }
    // Removed the extra showTasks() from here
}