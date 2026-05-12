package es.uniovi.reflection.dcl_53.compliant;


public class DCL_53CompliantObjects {
    public AuxiliaryCompliant auxiliary;
    public OtherAuxCompliant otherAux;

    public void sameObject() {
        this.otherAux = new OtherAuxCompliant();
        System.out.println(this.otherAux);
    }

    public void differentObjects4() {
        DCL_53CompliantObjects obj = new DCL_53CompliantObjects();
        obj.auxiliary.otherAuxComplex.field = 5;
        System.out.println(obj.otherAux.field);
    }
}
