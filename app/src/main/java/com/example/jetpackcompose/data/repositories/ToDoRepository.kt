package com.example.jetpackcompose.data.repositories

import com.example.jetpackcompose.data.ToDoDao
import com.example.jetpackcompose.data.models.TodoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTasks: Flow<List<TodoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<TodoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<TodoTask>> = toDoDao.sortByHighPriority()

    suspend fun addTask(todoTask: TodoTask) = toDoDao.addTask(todoTask = todoTask)
    suspend fun updateTask(todoTask: TodoTask) = toDoDao.updateTask(todoTask = todoTask)
    suspend fun deleteTask(todoTask: TodoTask) = toDoDao.deleteTask(todoTask = todoTask)
    suspend fun deleteAllTask() = toDoDao.deleteAllTask()

    fun getSelectedTask(taskId: Int): Flow<TodoTask> = toDoDao.getSelectedTask(taskId = taskId)
    fun searchDatabase(searchQuery: String): Flow<List<TodoTask>> =
        toDoDao.searchDatabase(searchQuery = searchQuery)

}