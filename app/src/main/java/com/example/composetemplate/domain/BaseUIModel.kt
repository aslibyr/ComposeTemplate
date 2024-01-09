package com.example.composetemplate.domain

sealed class BaseUIModel<T>

class Loading<T> : BaseUIModel<T>()
class Empty<T> : BaseUIModel<T>()
class Default<T> : BaseUIModel<T>()

data class Success<T>(val response : T) : BaseUIModel<T>()

data class Error<T>(val errorMessage : String) : BaseUIModel<T>()
