package pt.ist.Modulo_exemplo.domain;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.apache.avro.reflect.Nullable;
import pt.ist.fenixframework.Atomic;
import pt.ist.fenixframework.FenixFramework;



public class Checkin extends Checkin_Base {
    
    public Checkin(/*Pessoa pessoa, Restaurante restaurante*/) {
        super();
 	/*this.setPessoa(pessoa);
 	this.setRestaurante(restaurante);*/
    }

  @Atomic
    public static Checkin createCheckin( @Nullable final DateTime hora, final int classificacao, final String avaliacao,final Pessoa pessoa, final Restaurante restaurante){

	Checkin checkin = new Checkin();
      /*  if (hora != null) {
            checkin.setVisithour(hora);
            //Opcional: 
        }
        else {
            checkin.setVisithour(DateTime.now());
}*/
	checkin.setRate(classificacao);	
	checkin.setEvaluation(avaliacao);


	// nao da para meter la em cima ( usado exemplo canal de notificações de ricardo
	checkin.setPessoa(pessoa);
 	checkin.setRestaurante(restaurante);
        return checkin;
	}

    @Atomic
    public Checkin tornarprivado() {
        this.setPersonal_tag(true);
        return this;
    }


    @Atomic
    public Checkin tornarpublico() {
        this.setPersonal_tag(false);
        return this;
    }

    public boolean ispublic() {
        return this.getPersonal_tag();
}

    @Atomic
    public Checkin update(@Nullable final DateTime hora,@Nullable final int classificacao,@Nullable final String avaliacao) {
        this.setVisithour(hora);
	this.setRate(classificacao);	
	this.setEvaluation(avaliacao);
        return this;
}


    @Atomic
	public void delete() {
 		this.setPessoa(null);
		this.setRestaurante(null);
//mudar isto para apagar??
 		//super.delete();
        this.deleteDomainObject();
	}






}
