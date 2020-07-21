package com.patterns.behavioralpatterns.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new Admin(chat, "User1");
        User user2 = new Admin(chat, "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I'm user one!");
        admin.sendMessage("Roger that. I'm admin!");
    }
}
