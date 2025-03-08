package com.penmenstudios.scriptwriterapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.penmenstudios.scriptwriterapp.data.local.Project
import com.penmenstudios.scriptwriterapp.data.repository.LocalRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ProjectViewModel(private val repository: LocalRepository) : ViewModel() {

    private val _projects = MutableStateFlow<List<Project>>(emptyList())
    val projects: StateFlow<List<Project>> = _projects

    init {
        loadProjects()
    }

    fun addProject(project: Project) {
        viewModelScope.launch {
            repository.insertProject(project)
            loadProjects()
        }
    }

    private fun loadProjects() {
        viewModelScope.launch {
            _projects.value = repository.getAllProjects()
        }
    }
}
