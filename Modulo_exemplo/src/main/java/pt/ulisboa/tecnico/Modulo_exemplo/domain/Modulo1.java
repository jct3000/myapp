package pt.ulisboa.tecnico.Modulo_exemplo.domain;

import pt.ist.fenixframework.Atomic;
import pt.ist.fenixframework.FenixFramework;

public class Modulo1 extends Modulo1_Base {
    
    public Modulo1() {
        super();
	this.setRoot(FenixFramework.getDomainRoot()); 
// transforma esta classe em ancora que fixa as outras classes ao bennu
    }
    

    @Atomic
    public static Modulo1 getInstance() {
        //LC 8-10-2018
        final Modulo1 modulo1 = FenixFramework.getDomainRoot().getModulo1();
        return modulo1 == null ? new Modulo1() : modulo1;
}

}
