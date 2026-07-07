package com.example.LangLoop.exception;
public class ResourceNotFoundException extends RuntimeException 
{
public ResourceNotFoundException(String message) 
  {
    super(message);
  }
}