package es.uniovi.reflection.dcl_53.noncompliant;

public class AuxiliaryNonCompliant {
    public OtherAuxNonCompliant otherAux;

    private void easyOne() {
        otherAux = new OtherAuxNonCompliant();
        otherAux.field = 3;
    }
}
