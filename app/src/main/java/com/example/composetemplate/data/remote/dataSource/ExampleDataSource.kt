package com.example.composetemplate.data.remote.dataSource

import com.example.composetemplate.data.remote.webservice.WebService
import javax.inject.Inject

class ExampleDataSource @Inject constructor(
    private val webService: WebService
) {
}