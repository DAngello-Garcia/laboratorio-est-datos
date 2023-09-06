package punto1;

import java.util.ArrayList;

public class Prision {
    public static void main(String[] args) {
        Prisionero p1 = new Prisionero("p1", "p1");
        Prisionero p2 = new Prisionero("p2", "p2");
        Prisionero p3 = new Prisionero("p3", "p3");
        Prisionero p4 = new Prisionero("p4", "p4");
        Prisionero p5 = new Prisionero("p5", "p5");
        Prisionero p6 = new Prisionero("p6", "p6");
        Prisionero p7 = new Prisionero("p7", "p7");
        Prisionero p8 = new Prisionero("p8", "p8");
        Prisionero p9 = new Prisionero("p9", "p9");
        Prisionero p10 = new Prisionero("p10", "p10");
        Prisionero p11 = new Prisionero("p11", "p11");
        Prisionero p12 = new Prisionero("p12", "p12");
        Prisionero p13 = new Prisionero("p13", "p13");
        Prisionero p14 = new Prisionero("p14", "p14");

        //fila 1 {"C", "C", "C", "C", "C", "S"}
        Celda c11 = new Celda("c11", TipoCelda.CELDA);
        c11.setPrisionero(p1);
        c11.setEstadoCelda(EstadoCelda.VACIA);
        Celda c12 = new Celda("c12", TipoCelda.CELDA);
        c12.setPrisionero(p2);
        c12.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c13 = new Celda("c13", TipoCelda.CELDA);
        c13.setPrisionero(p3);
        c13.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c14 = new Celda("c14", TipoCelda.CELDA);
        c14.setPrisionero(p4);
        c14.setEstadoCelda(EstadoCelda.VACIA);
        Celda c15 = new Celda("c15", TipoCelda.CELDA);
        c15.setPrisionero(p5);
        c15.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c16 = new Celda("c16", TipoCelda.SALIDA);
        ArrayList<Celda> celdasFila1 = new ArrayList<>();
        celdasFila1.add(c11);
        celdasFila1.add(c12);
        celdasFila1.add(c13);
        celdasFila1.add(c14);
        celdasFila1.add(c15);
        celdasFila1.add(c16);

        // fila 2 {"C", "", "", "", "C", ""}
        Celda c21 = new Celda("c21", TipoCelda.CELDA);
        c21.setPrisionero(p6);
        c21.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c22 = new Celda("c22", TipoCelda.PASILLO);
        Celda c23 = new Celda("c23", TipoCelda.PASILLO);
        Celda c24 = new Celda("c24", TipoCelda.PASILLO);
        Celda c25 = new Celda("c25", TipoCelda.CELDA);
        c25.setPrisionero(p7);
        c25.setEstadoCelda(EstadoCelda.VACIA);
        Celda c26 = new Celda("c26", TipoCelda.PASILLO);
        ArrayList<Celda> celdasFila2 = new ArrayList<>();
        celdasFila2.add(c21);
        celdasFila2.add(c22);
        celdasFila2.add(c23);
        celdasFila2.add(c24);
        celdasFila2.add(c25);
        celdasFila2.add(c26);

        // fila 3 {"C", "", "C", "", "C", ""}
        Celda c31 = new Celda("c31", TipoCelda.CELDA);
        c31.setPrisionero(p8);
        c31.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c32 = new Celda("c32", TipoCelda.PASILLO);
        Celda c33 = new Celda("c33", TipoCelda.CELDA);
        c33.setPrisionero(p9);
        c33.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c34 = new Celda("c34", TipoCelda.PASILLO);
        Celda c35 = new Celda("c35", TipoCelda.CELDA);
        c35.setPrisionero(p10);
        c35.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c36 = new Celda("c36", TipoCelda.PASILLO);
        ArrayList<Celda> celdasFila3 = new ArrayList<>();
        celdasFila3.add(c31);
        celdasFila3.add(c32);
        celdasFila3.add(c33);
        celdasFila3.add(c34);
        celdasFila3.add(c35);
        celdasFila3.add(c36);

        // fila 4 {"C", "", "C", "", "", ""}
        Celda c41 = new Celda("c41", TipoCelda.CELDA);
        c41.setPrisionero(p11);
        c41.setEstadoCelda(EstadoCelda.VACIA);
        Celda c42 = new Celda("c42", TipoCelda.PASILLO);
        Celda c43 = new Celda("c43", TipoCelda.CELDA);
        c43.setPrisionero(p12);
        c43.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c44 = new Celda("c44", TipoCelda.PASILLO);
        Celda c45 = new Celda("c45", TipoCelda.PASILLO);
        Celda c46 = new Celda("c46", TipoCelda.PASILLO);
        ArrayList<Celda> celdasFila4 = new ArrayList<>();
        celdasFila4.add(c41);
        celdasFila4.add(c42);
        celdasFila4.add(c43);
        celdasFila4.add(c44);
        celdasFila4.add(c45);
        celdasFila4.add(c46);

        //fila 5 {"E", "", "C", "C", "", ""}
        Celda c51 = new Celda("c51", TipoCelda.ENTRADA);
        Celda c52 = new Celda("c52", TipoCelda.PASILLO);
        Celda c53 = new Celda("c53", TipoCelda.CELDA);
        c53.setPrisionero(p13);
        c53.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c54 = new Celda("c54", TipoCelda.CELDA);
        c54.setPrisionero(p14);
        c54.setEstadoCelda(EstadoCelda.OCUPADA);
        Celda c55 = new Celda("c55", TipoCelda.PASILLO);
        Celda c56 = new Celda("c56", TipoCelda.PASILLO);
        ArrayList<Celda> celdasFila5 = new ArrayList<>();
        celdasFila5.add(c51);
        celdasFila5.add(c52);
        celdasFila5.add(c53);
        celdasFila5.add(c54);
        celdasFila5.add(c55);
        celdasFila5.add(c56);

        ArrayList<ArrayList<Celda>> listaCeldas = new ArrayList<>();
        listaCeldas.add(celdasFila1);
        listaCeldas.add(celdasFila2);
        listaCeldas.add(celdasFila3);
        listaCeldas.add(celdasFila4);
        listaCeldas.add(celdasFila5);

        Piso piso1 = new Piso();
        piso1.setListaCeldas(listaCeldas);
        Celda[][] prision = {
                {c11, c12, c13, c14, c15, c16},
                {c21, c22, c23, c24, c25, c26},
                {c31, c32, c33, c34, c35, c36},
                {c41, c42, c43, c44, c45, c46},
                {c51, c52, c53, c54, c55, c56}};
        piso1.setPrision(prision);
        piso1.resuelve(4, 0);

    }

}
