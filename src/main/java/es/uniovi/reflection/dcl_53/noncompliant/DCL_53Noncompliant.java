package es.uniovi.reflection.dcl_53.noncompliant;

class DCL_53Noncompliant {
	private int 	twoCondsIfElseAsUncondAssign; 		//if and else, CFG fix
	private int 	uncondAssignInIf;					//OK
	private int 	twoUncondsThisAndLocalVar;  		//falla por la local var
	private int 	twoUncondsThisAndField;				//OK
	private int 	twoMethodsOneCondAssign;  			//Igual falla porque el primero ta en un if???
	private int 	twoUncondAssignInIf;				//Falla porque todo está dentro de un if
	public 	int 	oneUncondPublicInNonPublicClass;	//OK
	private int		uncondInLoop;						//OK

	public void oneUseWithUncondAssign() {
		this.oneUncondPublicInNonPublicClass = 9;
		System.out.println(oneUncondPublicInNonPublicClass);
	}

	public void twoUsesAndBothCondAndUncondAssign() {
		if ("INIJO".contains(""))
			if ("JIJOJO".length() == 9)
				twoMethodsOneCondAssign = 5;
		{
			twoMethodsOneCondAssign = 3;
		}

		synchronized (Integer.valueOf(twoMethodsOneCondAssign)) {
			if ("".contains(""))
				System.out.println(twoMethodsOneCondAssign);
		}
	}

	public void twoUncondAssignOneStmtAndIfElse() {
		twoMethodsOneCondAssign = 3;
		if ("NJHI".length() == 8)
			twoCondsIfElseAsUncondAssign = 4;
		else
			twoCondsIfElseAsUncondAssign =6;
		System.out.println(twoMethodsOneCondAssign + twoCondsIfElseAsUncondAssign);
	}
	
	public void uncondAssignInsideIf(Object o) {
		oneUseWithUncondAssign();
		if ("NK".length() == 8) {
			twoUncondAssignInIf = 3;

			if (twoUncondAssignInIf == 5)
				if (twoUncondAssignInIf == 3) {
					System.out.println(twoUncondAssignInIf);
				}
		}

	}

	public void twoUncondAssignsInIf() {
		if ("NJHI".length() == 8) {
			uncondAssignInIf = 4;
			twoUncondAssignInIf = 3;
			System.out.println(twoUncondAssignInIf + uncondAssignInIf);
		}
	}

	public void uncondAssignInLoop() {
		for (int i = 0; i < 50; i++) {
			uncondInLoop = 3;
			System.out.println(uncondInLoop);
		}
	}
	private DCL_53Noncompliant  y;
	public void uncondAssignInFieldObject() {
		y.twoUncondsThisAndField = 3;
		System.out.println( y.twoUncondsThisAndField);
	}

	public void uncondAssignsInThisAndLocalVar(int i) {
		twoUncondsThisAndField= i;
		DCL_53Noncompliant o=new DCL_53Noncompliant();
		o.twoUncondsThisAndLocalVar = 3;
		twoUncondsThisAndLocalVar = 4;
		System.out.println(o.twoUncondsThisAndLocalVar + twoUncondsThisAndLocalVar);
	}
	private AuxiliaryNonCompliant auxiliary;

	public void differentObjects(){
		auxiliary.otherAux = new OtherAuxNonCompliant();
		AuxiliaryNonCompliant other = new AuxiliaryNonCompliant();
		other.otherAux = new OtherAuxNonCompliant();
		System.out.println(auxiliary.otherAux + " " + other.otherAux);
	}

	public void irrelevantStateMod(){
		auxiliary.otherAux.field = 3;
	}
}
