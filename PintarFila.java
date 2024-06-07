package ProyectoF;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class PintarFila extends DefaultTableCellRenderer{
    private final int col_patron;
    
    public PintarFila(int Colpatron){
        this.col_patron = Colpatron;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int rowIndex, int colIndex){
        
        if(table.getValueAt(rowIndex, col_patron).toString().equals("Devuelto")){
            setBackground(Color.green);
        }
        else{
            setBackground(Color.red);
        }
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, rowIndex , colIndex);
        return this;
    }
}
