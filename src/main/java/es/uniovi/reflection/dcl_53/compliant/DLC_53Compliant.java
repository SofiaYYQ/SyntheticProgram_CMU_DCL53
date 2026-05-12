package es.uniovi.reflection.dcl_53.compliant;

public class DLC_53Compliant {
    private int oneUseAndFiveUnconds;
    private int threeUncondsButOneCond;
    private int usedBeforeAssignedInLoop;
    private int twoUncondsButOneUseWithNewObject;
    private int oneUncondButOneAccessFromField;
    public int publicAttr;
    protected int protectedAttr;
    private int neverReferencedAttr;

    public void attrScope() {
        DLC_53Compliant z = null;
        z.oneUseAndFiveUnconds = 0;
        this.threeUncondsButOneCond = 7;
        System.out.println(z.oneUseAndFiveUnconds + threeUncondsButOneCond);
    }
    public void ifTest(String p) {

        if (p == null) {
            for (;;) {//
                p = p + "OO";//
                if (oneUseAndFiveUnconds == 4) {//
                    p = null;//
                    System.out.println("");//
                } else
                    System.out.println(p);
                System.out.println("KK");//
            }
        }
        System.out.println("LAST");//
    }

    public void attrScopeBis() {
        oneUseAndFiveUnconds = 3;
        if ("NJHI".length() == 8)
            threeUncondsButOneCond = 4;
        System.out.println(oneUseAndFiveUnconds + threeUncondsButOneCond);
    }

    public void attrScopeBisBis() {
        if ("NJHI".length() == 8) {
            threeUncondsButOneCond = 4;
            oneUseAndFiveUnconds = 3;
            System.out.println(oneUseAndFiveUnconds + threeUncondsButOneCond);
        }
    }

    public void attrScopeLoop() {

        for (int i = 0; i < 50; i++) {
            oneUseAndFiveUnconds = 3;

            System.out.println(oneUseAndFiveUnconds + this.usedBeforeAssignedInLoop);

            usedBeforeAssignedInLoop = 4;
        }
    }
    private DLC_53Compliant z, y;
    public void attrUse() {
        y.oneUncondButOneAccessFromField = 3;
        System.out.println(z.oneUncondButOneAccessFromField + y.oneUncondButOneAccessFromField);
    }

    public void setA(int i) {
        oneUseAndFiveUnconds = i;
        new DLC_53Compliant().twoUncondsButOneUseWithNewObject = 3;
        twoUncondsButOneUseWithNewObject = 4;
        System.out.println(new DLC_53Compliant().twoUncondsButOneUseWithNewObject);
    }
}
