package br.com.marcio.padaria.front.funcoes;


import br.com.marcio.padaria.model.Caixa;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcio
 */
public class TableModelCaixa implements TableModel{
    
    private final ArrayList<Caixa> lista;
    private final String coluna[] = { "Código", "Total de Entrada", "Troco", "Data", "Observação" };
            public TableModelCaixa(ArrayList<Caixa> lista){
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
            Caixa c=lista.get(rowIndex);
            switch(columnIndex){
                case 0:return c.getCd_caixa();
                case 1:return c.getValor();
                case 2:return c.getTroco();
                case 3:return c.getData();
                case 4:return c.getObservacao();
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
