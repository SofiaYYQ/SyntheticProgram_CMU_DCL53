package es.uniovi.reflection.dcl_53.not_covered;

public class AuxiliaryNotCovered {
    public OtherAuxNotCovered otherAux;

    private void easyOne() {
        otherAux.field = 3;
        System.out.println(otherAux.field);
    }
}
