package br.com.marcio.padaria.front.funcoes;


import br.com.marcio.padaria.model.Retiradas;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcio
 */
public class TableModelRetiradas implements TableModel{
    
    private final ArrayList<Retiradas> lista;
    private final String coluna[] = { "Código", "Data", "Valor" };
           
    public TableModelRetiradas(ArrayList<Retiradas> lista){
                this.lista = lista;
                            
            }
    

    @Override
    public int getRowCount() {
        return lista.size();

    }

    @Override
    public int getColumnCount() {
        return coluna.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        
        return coluna[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
         return String.class;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            Retiradas c=lista.get(rowIndex);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = df.parse(c.getData());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
            switch(columnIndex){
                case 0: return c.getCd_retiradas();
                case 1:return c.getData();
                case 2:return c.getValor();
            }
            return null;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }
    
    @Override
    public void addTableModelListener(TableModelListener l) {

    }
    
    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
        
           
}
