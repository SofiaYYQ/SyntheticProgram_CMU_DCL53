package es.uniovi.reflection.dcl_53.noncompliant;

public class DCL_53NonCompliantInner {

    private int attr;

    private class Inner{
        private int attr;

        public void innerAndThis(int value) {
            this.attr = value;
            System.out.println(Inner.this.attr);
        }
        public void innerAndImplicit(int value) {
            attr = value;
            System.out.println(Inner.this.attr);
        }
    }
}
