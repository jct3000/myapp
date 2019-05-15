package pt.ulisboa.tecnico.Modulo_exemplo.domain;
import pt.ist.fenixframework.Atomic;
import pt.ist.fenixframework.FenixFramework;
import org.apache.avro.reflect.Nullable;


public class Pessoa extends Pessoa_Base {
    
    public Pessoa() {
        super();
	this.setModulo1(Modulo1.getInstance());
    }

    @Atomic
    public static Pessoa createPessoa(final String nome, final int idade, final String mail, final String email, final String endereco) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName(nome);
        pessoa.setAge(idade);
        pessoa.setEmail(mail);
	pessoa.setAdress(endereco);
	pessoa.setPersonal_tag(false);
        return pessoa;
	}
    

    @Atomic
    public Pessoa tornarprivado() {
        this.setPersonal_tag(true);
        return this;
    }


    @Atomic
    public Pessoa tornarpublico() {
        this.setPersonal_tag(false);
        return this;
    }

    public boolean ispublic() {
        return this.getPersonal_tag();
}

    @Atomic
    public Pessoa update(@Nullable final String nome,@Nullable final int idade,@Nullable final String mail,@Nullable final String email,@Nullable final String endereco) {
        this.setName(nome);
        this.setAge(idade);
        this.setEmail(mail);
	this.setAdress(endereco);
        return this;
}



    @Atomic
	public void delete() {
// apagar os check ins feitos pelo user??
       /* for (Checkin  cn : this.getCheckinSet()) {
            cn.delete();
	}*/

        this.deleteDomainObject();
	}

}
