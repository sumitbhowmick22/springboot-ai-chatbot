
package com.example.chatbot.service;

import com.example.chatbot.model.ChatRequest;
import com.example.chatbot.model.ChatResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ChatService {

    private final WebClient webClient = WebClient.create("http://localhost:5000");

    public ChatResponse getChatResponse(ChatRequest request) {
        return webClient.post()
                .uri("/chat")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(ChatResponse.class)
                .block();
    }
}
