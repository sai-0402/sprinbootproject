package com.model;

import lombok.Data;

@Data
public class AuthenticateRequest {
  private User user;
  private Request request;
}
