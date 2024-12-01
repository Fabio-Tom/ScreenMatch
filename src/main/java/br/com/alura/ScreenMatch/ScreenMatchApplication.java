package br.com.alura.ScreenMatch;

import br.com.alura.ScreenMatch.models.DadoSerie;
import br.com.alura.ScreenMatch.services.ConsumoApi;
import br.com.alura.ScreenMatch.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=98f781e9");
		System.out.println(json);


		ConverteDados conversor = new ConverteDados();
		DadoSerie dados = conversor.obterDados(json, DadoSerie.class );
		System.out.println(dados);
	}
}
