/*
 * package tn.esprit.spring.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.mail.SimpleMailMessage; import
 * org.springframework.mail.javamail.JavaMailSender; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController
 * 
 * @RequestMapping(value = "/email") public class SimpleEmailController {
 * 
 * @Autowired public JavaMailSender JavaMailSender;
 * 
 * // http://localhost:8081/email/Sendemail
 * 
 * @GetMapping(value = "/Sendemail") public String SendEmail() {
 * SimpleMailMessage message = new SimpleMailMessage();
 * message.setTo("eya.haribi@esprit.tn"); message.setSubject("Renting");
 * message.setText("Hi Madam, I want to rent your appartement");
 * JavaMailSender.send(message); return "Successfully sent email";
 * 
 * }
 * 
 * // note:https://myaccount.google.com/u/0/lesssecureapps?pageId=none // URL )
 * }
 */