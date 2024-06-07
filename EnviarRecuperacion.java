package ProyectoF;
import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class EnviarRecuperacion {
    private static String emailFrom = "crissairsistema@gmail.com";
    private static String passwordFrom = "erqo dscf jakn oumo";
    private String correo;
    private String password;
    private String id;
    private String codigo;
    public void Recuperacion(String correo, String id, String password){
        generarcodigo();
        Properties p = new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        p.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user", emailFrom);
        p.setProperty("mail.smtp.auth", "true");
   
        String texto = String.format("Su codigo de recuperacion es: %s",codigo);
        Session s = Session.getDefaultInstance(p);
        MimeMessage mail = new MimeMessage(s);
        try{
            mail.setFrom(new InternetAddress(emailFrom));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            mail.setSubject("Codigo de recuperacion de contraseña");
            mail.setText(texto);
            
            Transport transporte = s.getTransport("smtp");
            transporte.connect(emailFrom, passwordFrom);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            JOptionPane.showMessageDialog(null,"Se le envio un codigo de recuperacion");
            Codigo newframe = new Codigo(id,codigo);
            newframe.setVisible(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error de envio de correo...\n"+ex);
        }
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setPass(String password) {
        this.password = password;
    }

    public String getContra() {
        return password;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getid() {
        return id;
    }
    private void generarcodigo(){        
        StringBuilder buffer = new StringBuilder(6);
        Random random = new Random();
        for (int i = 0; i < 6; i++){
            int randomDigit = random.nextInt(10);
            buffer.append(randomDigit);
        }
        codigo = buffer.toString();
    }
}
