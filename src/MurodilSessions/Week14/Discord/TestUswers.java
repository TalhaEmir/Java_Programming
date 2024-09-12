package MurodilSessions.Week14.Discord;

import java.time.LocalDate;

public class TestUswers {
    public static void main(String[] args) {
        // ERROR: DiscordUser discordUser = new DiscordUser("James", 7, LocalDate.of(2023, 2, 18));
        Admin admin = new Admin("Admin", "James", "james7", LocalDate.now());
        System.out.println(admin);
        admin.createChannel("soft-skills");
        admin.sendMessage();
        admin.joinDiscord("cydeo-b36");

        System.out.println("====================");

        Student student = new Student("Student", "Maria", "maria12", LocalDate.of(2024, 1, 4));
        System.out.println(student);
        student.joinDiscord("cydeo-B36");
        student.sendMessage();
        student.sendMessage("Asiya");

    }
}
