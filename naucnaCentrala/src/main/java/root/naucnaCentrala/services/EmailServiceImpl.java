package root.naucnaCentrala.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl {

    @Autowired
    public JavaMailSender emailSender;

    public void mailPotvrdePrijaveRada(String to){
        String text="Postovani, Uspesno ste prijavili novi rad! Nakon recenziranja cete dobiti informacije da li je rad prihvacen. Pozdrav!";
        String subject ="Prijava rada";
        SimpleMailMessage message= new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }

    public void ispravkaFormataRada(String to){
        String text="Postovani, Format rada mora biti ispravljen u roku od 20 minuta, u suprotnom ce biti izbrisan i moracete ponovo da ga prijavite. Pozdrav!";
        String subject ="Neispravan format rada";
        SimpleMailMessage message= new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }

    public void odbijenRad(String to){
        String text="Postovani, Vas rad je odbijen, molimo Vas pokusajte ponovo. Pozdrav!";
        String subject ="Rad odbijen";
        SimpleMailMessage message= new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }

    public void prihvacenRad(String to){
        String text="Postovani, Vas rad je uspesno prihvacen i objavljen u casopisu. Cestitamo! Pozdrav!";
        String subject ="Rad prihvacen";
        SimpleMailMessage message= new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }

    public void prihvacenRadUzDoradu(String to){
        String text="Postovani, Imate 20 minuta vremena da ispravite greske u radu da bi bio prihvacen. U suprotnom cemo ga morati odbiti. Pozdrav!";
        String subject ="Rad prihvacen uz doradu";
        SimpleMailMessage message= new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }

    public void notifikacijaUrednikaNaucne(String to){
        String text="Postovani, Potrebno je da odaberete 2 recenzenta za novopristigli rad. Pozdrav!";
        String subject ="Recenzija rada";
        SimpleMailMessage message= new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }
}
