package br.com.marcio.padaria.front.funcoes;


import br.com.marcio.padaria.model.Principal;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcio
 */
public class TableModelPrincipal implements TableModel{
    
    private final ArrayList<Principal> lista;
    private final String coluna[] = { "Código", "Valor", "Data", "Hora"};
           
    public TableModelPrincipal(ArrayList<Principal> lista){
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
            Principal c=lista.get(rowIndex);
            
            switch(columnIndex){
                case 0:return c.getCd_principal();
                case 1:return c.getValor();
                case 2:return c.getData();
                case 3:return c.getHora();
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
