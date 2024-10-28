package one.dio.designpatterns.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.dio.designpatterns.model.Endereco;

@Service
@FeignClient(name = "${feign.client.viacep.name}", url = "${feign.client.viacep.url}")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
