package uq;

import java.util.ArrayList;

public class Piso {
    private ArrayList<ArrayList<Celda>> listaCeldas;
    private Celda[][] prision;
    private ArrayList<String> conteo;

    public Celda[][] getPrision() {
        return prision;
    }

    public void setPrision(Celda[][] prision) {
        this.prision = prision;
    }

    public ArrayList<ArrayList<Celda>> getListaCeldas() {
        return listaCeldas;
    }

    public void setListaCeldas(ArrayList<ArrayList<Celda>> listaCeldas) {
        this.listaCeldas = listaCeldas;
    }

    public void resuelve(int x, int y) {
        conteo = new ArrayList<>();
        if (paso(x, y)) {
            System.out.println("Las siguientes celdas están vacías: "+conteo.toString());
        }
    }

    private boolean paso(int x, int y) {
        if (x < 0 || x == prision.length || y < 0 || y == prision[x].length)
            return false;

        if (prision[x][y].getTipoCelda().equals(TipoCelda.SALIDA))
            return true;

        if(prision[x][y].getTipoCelda().equals(TipoCelda.CELDA) && prision[x][y].getEstadoCelda().equals(EstadoCelda.VACIA) && !prision[x][y].getVerificada()) {
            conteo.add(prision[x][y].getCodigo());
            prision[x][y].setVerificada(true);
        }

        if(prision[x][y].getTipoCelda().equals(TipoCelda.CELDA))
            prision[x][y].setVerificada(true);

        if (prision[x][y].getVerificada() || prision[x][y].isPaso())
            return false;

        prision[x][y].setPaso(true);

        boolean result;

        result = paso(x - 1, y); // ARRIBA
        if (result) return true;

        result = paso(x - 1, y + 1); // DIAGONAL ARRIBA DERECHA
        if (result) return true;

        result = paso(x, y + 1); // DERECHA
        if (result) return true;

        result = paso(x + 1, y + 1); // DIAGONAL ABAJO DERECHA
        if (result) return true;

        result = paso(x + 1, y); // ABAJO
        if (result) return true;

        result = paso(x + 1, y - 1); // DIAGONAL ABAJO IZQUIERDA
        if (result) return true;

        result = paso(x, y - 1); // IZQUIERDA
        if (result) return true;

        result = paso(x - 1, y - 1); // DIAGONAL ARRIBA IZQUIERDA
        if (result) return true;

        return false;
    }
}

