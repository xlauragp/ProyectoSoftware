package ProyectoF;

//Para la sesion y el envio del correo//
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class Enviar {

    private String correo;
    private String contra;
    private String correoDestino; 
    
    public void EnviarReporte(String correo, String contra, String correoDestino,String name1, String name2) throws AddressException, MessagingException {
        Properties p = new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        p.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user", correo);
        p.setProperty("mail.smtp.auth", "true");
        
        String fecha = new FechaSistema().getFormatoFecha().replace("/","_");          
        String rutaUsuario = System.getProperty("user.home");
        String name_file = name1+"_"+fecha+".xls";
        String name_file2 = name2+"_"+fecha+".xls";
            
        Session s = Session.getDefaultInstance(p);
        BodyPart texto = new MimeBodyPart();
        texto.setText("Archivo enviado adjunto");
        BodyPart adjunto1 = new MimeBodyPart();
        adjunto1.setDataHandler(new DataHandler(new FileDataSource(rutaUsuario+"\\Documents\\"+name_file)));
        adjunto1.setFileName(name_file);
        BodyPart adjunto2 = new MimeBodyPart();
        adjunto2.setDataHandler(new DataHandler(new FileDataSource(rutaUsuario+"\\Documents\\"+name_file2)));
        adjunto2.setFileName(name_file2);
        MimeMultipart m = new MimeMultipart();
        m.addBodyPart(texto);
        m.addBodyPart(adjunto1);
        m.addBodyPart(adjunto2);
        MimeMessage mensaje = new MimeMessage(s);
        mensaje.setFrom(new InternetAddress(correo));
        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
        mensaje.setSubject("Reportes");
        mensaje.setContent(m);
        
        Transport t = s.getTransport("smtp");
        t.connect(correo, contra);
        t.sendMessage(mensaje, mensaje.getAllRecipients());
        t.close();
        JOptionPane.showMessageDialog(null, "Mensaje enviado");
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getContra() {
        return contra;
    }

    public void setCorreoDestino(String correoDestino) {
        this.correoDestino = correoDestino;
    }

    public String getCorreoDestino() {
        return correoDestino;
    }
}
