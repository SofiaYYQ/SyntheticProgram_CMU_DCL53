package es.uniovi.reflection.dcl_53.compliant;


public class DCL_53CompliantObjects2 {
    public AuxiliaryCompliant auxiliary;
    public OtherAuxCompliant otherAux;

    public void differentObjects2() {
        auxiliary.otherAuxComplex = new OtherAuxCompliant();
        System.out.println(otherAux);
    }
}
