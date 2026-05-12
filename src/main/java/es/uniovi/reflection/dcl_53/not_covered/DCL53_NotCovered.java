package es.uniovi.reflection.dcl_53.not_covered;

public class DCL53_NotCovered {
    public AuxiliaryNotCovered auxiliary;
    public OtherAuxNotCovered otherAux;

    public void tooMuchLarge() {
        this.auxiliary.otherAux.field = 5;
        System.out.println(this.auxiliary.otherAux.field);
    }
}
