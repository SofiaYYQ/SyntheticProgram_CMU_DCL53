package es.uniovi.reflection.dcl_53.compliant;

public class DLC_53CompliantSwitch {
    private final int FINAL_INT=0;
    private final int OTHER_FINAL ;

    public DLC_53CompliantSwitch(){
        OTHER_FINAL=1;
    }

    public Object attrUsedInSwitch(int value) {
        switch (value) {
            case FINAL_INT:
                return new Object();
            case 2:
                return OTHER_FINAL;
            case 3:
                return new DLC_53CompliantSwitch();
        }
        return null;
    }
}
