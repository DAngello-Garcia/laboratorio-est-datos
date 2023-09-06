package punto1;

public class Celda {
    private String codigo;
    private EstadoCelda estadoCelda;
    private TipoCelda tipoCelda;
    private Prisionero prisionero;
    private boolean verificada;

    private boolean paso;

    public Celda(String codigo, TipoCelda tipoCelda) {
        this.codigo = codigo;
        this.tipoCelda = tipoCelda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoCelda getEstadoCelda() {
        return estadoCelda;
    }

    public void setEstadoCelda(EstadoCelda estadoCelda) {
        this.estadoCelda = estadoCelda;
    }

    public TipoCelda getTipoCelda() {
        return tipoCelda;
    }

    public void setTipoCelda(TipoCelda tipoCelda) {
        this.tipoCelda = tipoCelda;
    }

    public Prisionero getPrisionero() {
        return prisionero;
    }

    public void setPrisionero(Prisionero prisionero) {
        this.prisionero = prisionero;
    }

    public boolean getVerificada() {
        return verificada;
    }

    public void setVerificada(boolean verificada) {
        this.verificada = verificada;
    }

    public boolean isPaso() {
        return paso;
    }

    public void setPaso(boolean paso) {
        this.paso = paso;
    }
}
