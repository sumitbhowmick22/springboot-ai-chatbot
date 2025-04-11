
# Spring Boot AI Chatbot

This is an AI-powered chatbot using OpenAI GPT API with a Spring Boot backend. The backend sends user messages to a local Python Flask NLP service that handles the AI response.

## Features
- Java Spring Boot backend with REST API
- Python Flask NLP microservice using OpenAI
- Supports both real OpenAI API and mocked responses

## How to Run

### 1. Python Chatbot Server
```bash
cd python-nlp
pip install -r requirements.txt
python app.py
```

### 2. Spring Boot Backend
```bash
cd backend
./mvnw spring-boot:run
```

### 3. Test
POST to `http://localhost:8080/api/chat`:
```json
{
  "message": "Hello!"
}
```

## Env
In `python-nlp/.env`:
```
OPENAI_API_KEY=your-api-key
```
