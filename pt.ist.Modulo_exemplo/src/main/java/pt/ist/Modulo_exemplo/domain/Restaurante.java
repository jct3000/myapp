package pt.ist.Modulo_exemplo.domain;
import pt.ist.fenixframework.Atomic;
import pt.ist.fenixframework.FenixFramework;
import org.apache.avro.reflect.Nullable;

public class Restaurante extends Restaurante_Base {
    
    public Restaurante() {
        super();
	this.setModulo1(Modulo1.getInstance());
    }

    @Atomic
    public static Restaurante createRestaurante(final String nome, final String mail, final String email, final String endereco) {
        Restaurante restaurante = new Restaurante();
        restaurante.setName(nome);
        restaurante.setEmail(mail);
	restaurante.setAdress(endereco);
	restaurante.setPersonal_tag(false);
        return restaurante;
	}
    

    @Atomic
    public Restaurante tornarprivado() {
        this.setPersonal_tag(true);
        return this;
    }


    @Atomic
    public Restaurante tornarpublico() {
        this.setPersonal_tag(false);
        return this;
    }

    public boolean ispublic() {
        return this.getPersonal_tag();
}

    @Atomic
    public Restaurante update(@Nullable final String nome,@Nullable final String mail,@Nullable final String email,@Nullable final String endereco) {
        this.setName(nome);
        this.setEmail(mail);
	this.setAdress(endereco);
        return this;
}



    @Atomic
	public void delete() {
// apagar os check ins feitos no restaurante??
       /* for (Checkin  cn : this.getCheckinSet()) {
            cn.delete();
	}*/

        this.deleteDomainObject();
	}
    
}
