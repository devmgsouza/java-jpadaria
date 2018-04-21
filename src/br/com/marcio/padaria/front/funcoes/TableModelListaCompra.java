package br.com.marcio.padaria.front.funcoes;


import br.com.marcio.padaria.model.ProdutoVenda;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcio
 */
public class TableModelListaCompra implements TableModel{
    
    private final ArrayList<ProdutoVenda> lista;
    private final String coluna[] = { "Descrição", "Valor Unitário", "Quantidade", "Valor Total" };
           
    public TableModelListaCompra(ArrayList<ProdutoVenda> lista){
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
            ProdutoVenda c = lista.get(rowIndex);
            
            switch(columnIndex){
                case 0:return c.getDescricao();
                case 1:return c.getValorUnitario();
                case 2:return c.getQuantidade();
                case 3:return c.getValorTotal();
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

    public void removeRow(int lin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
           
}
