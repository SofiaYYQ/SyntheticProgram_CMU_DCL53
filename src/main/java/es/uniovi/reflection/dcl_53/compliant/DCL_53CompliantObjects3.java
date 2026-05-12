package es.uniovi.reflection.dcl_53.compliant;


public class DCL_53CompliantObjects3 {
    public AuxiliaryCompliant auxiliary, aux;


    public void differentObjects3() {
        this.auxiliary.aux.otherAuxComplex = new OtherAuxCompliant();
        System.out.println(this.aux.aux.otherAuxComplex);
    }

}
