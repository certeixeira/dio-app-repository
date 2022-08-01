package com.certeixeira.app_repositorios_git.data.repositories

import com.certeixeira.app_repositorios_git.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}