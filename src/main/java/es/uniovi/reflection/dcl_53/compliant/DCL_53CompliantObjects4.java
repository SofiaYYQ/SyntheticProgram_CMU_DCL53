package es.uniovi.reflection.dcl_53.compliant;


public class DCL_53CompliantObjects4 {
    public AuxiliaryCompliant auxiliary;

    public void usedOutside() {
        auxiliary.otherAuxComplex = new OtherAuxCompliant();
        System.out.println(auxiliary.otherAuxComplex);
    }

}
