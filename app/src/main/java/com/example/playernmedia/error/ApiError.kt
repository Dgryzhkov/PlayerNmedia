package com.example.playernmedia.error
import java.io.IOException
/**
 *@Author Dgryzhkov
 */
sealed class AppError(message: String) : Exception(message)

class ApiError(val code: Int, message: String) : AppError(message)

object NetworkError : AppError("network_error")
object UnknownError : AppError("unknown_error")