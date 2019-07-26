package ua.step.debating.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import ua.step.debating.models.MessageDTO;
import ua.step.debating.repositories.MessageRepository;


@Controller
public class ChatController {
	@Autowired
	private MessageRepository messageRepository;

	@MessageMapping("/debateLobby/1/message")
	@SendTo("/debateLobby/1/chat/messages")
	public MessageDTO getMessages(MessageDTO message) {
		System.out.println("!!!!!!!!!!!!!!!!!!!" + message.toString());
		return message;
	}
}
