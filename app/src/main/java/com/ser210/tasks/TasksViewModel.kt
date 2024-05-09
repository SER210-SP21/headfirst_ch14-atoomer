package com.ser210.tasks

// this import is not working
import androidx.lifecycle.Transformations

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class TasksViewModel(val dao: TaskDao) : ViewModel() {
    var newTaskName = ""

    fun addTask(){
        viewModelScope.launch {
            val task = Task()
            task.taskName = newTaskName
            dao.insert(task)
        }
    }
}