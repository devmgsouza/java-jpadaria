package br.com.marcio.padaria.front.funcoes;


import br.com.marcio.padaria.model.Pendencias;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcio
 */
public class TableModelPendencias implements TableModel{
    
    private final ArrayList<Pendencias> lista;
    private final String coluna[] = { "Código", "Descricao", "Data", "Hora", "Valor" };
           
    public TableModelPendencias(ArrayList<Pendencias> lista){
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
            Pendencias c=lista.get(rowIndex);
            
            switch(columnIndex){
                case 0: return String.valueOf(c.getCd_pendencia());
                case 1:return c.getDescricao();
                case 2:return c.getData();
                case 3:return c.getHora();
                case 4:return c.getValor();
    
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
