package com.certeixeira.app_repositorios_git.domain

import com.certeixeira.app_repositorios_git.core.UseCase
import com.certeixeira.app_repositorios_git.data.model.Repo
import com.certeixeira.app_repositorios_git.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}