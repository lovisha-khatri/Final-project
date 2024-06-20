package com.example.codetool.service;

import com.example.codetool.model.CodeRequest;

public interface CodeService {
    String formatCode(CodeRequest request);
    String validateCode(CodeRequest request);
    String convertCode(CodeRequest request);
    String visualizeCode(CodeRequest request);
}
