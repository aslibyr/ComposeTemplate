package com.example.composetemplate.data.remote.repository

import com.example.composetemplate.data.remote.dataSource.ExampleDataSource
import javax.inject.Inject

class ExampleRepository @Inject constructor(
    private val exampleDataSource: ExampleDataSource
) {
}