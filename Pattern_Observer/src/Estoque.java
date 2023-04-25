import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Estoque
{
    private String produto;
    private BigDecimal valor; //quero observar esse valor
    private BigDecimal desconto;
    private List<Observer> observers = new ArrayList<Observer>(); //Array que pegará o objeto quando o valor for maior que 1000

    public Estoque(){};
    public Estoque(String produto, BigDecimal valor, BigDecimal desconto) {
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }

    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public BigDecimal getDesconto() {
        return desconto;
    }
    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this); //update será o método dentro da interface Observer
        }
    }
}
