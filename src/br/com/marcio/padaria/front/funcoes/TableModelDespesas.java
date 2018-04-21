package br.com.marcio.padaria.front.funcoes;


import br.com.marcio.padaria.model.Despesas;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcio
 */
public class TableModelDespesas implements TableModel{
    
    private final ArrayList<Despesas> lista;
    private final String coluna[] = { "Codigo","Data", "Valor", "Descrição"};
           
    public TableModelDespesas(ArrayList<Despesas> lista){
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
            Despesas c=lista.get(rowIndex);
            
            switch(columnIndex){
                case 0: return c.getCd_despesa();
                case 1:return c.getData();
                    case 2:return c.getValor();
                    case 3:return c.getDescricao();
                
                
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
