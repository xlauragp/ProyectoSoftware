package ProyectoF;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Exportar {
    public void exportarExcel(JTable t, String name)throws IOException{

            String fecha = new FechaSistema().getFormatoFecha().replace("/","_");          
            String rutaUsuario = System.getProperty("user.home");
            
            String ruta= rutaUsuario+"\\Documents\\"+name+"_"+fecha+".xls";
            try{
                File archivoXLS = new File(ruta);
                if(archivoXLS.exists()){
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Datos");
                hoja.setDisplayGridlines(false);
                for(int f=0;f<t.getRowCount();f++){
                    Row fila = hoja.createRow(f);
                    for(int c=0;c<t.getColumnCount();c++){
                        Cell celda = fila.createCell(c);
                        if(f==0){
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio=1;
                for(int f=0;f<t.getRowCount();f++){
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for(int c=0;c<t.getColumnCount();c++){
                        Cell celda = fila.createCell(c);
                        if(t.getValueAt(f, c)instanceof Double){
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));     
                        }else if(t.getValueAt(f, c) instanceof Float){
                            celda.setCellValue(Float.parseFloat((String)t.getValueAt(f, c)));
                        }else{
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
            }catch(IOException | NumberFormatException e){
                throw e;
            }
        }
          
}
