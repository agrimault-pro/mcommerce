package com.clientui.clientui.proxies;

import com.clientui.clientui.bean.CommandeBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "microservice-commandes")
@RibbonClient(name = "microservice-commandes")
public interface MicroserviceCommandeProxy {

    @PostMapping(value = "/commandes")
    public ResponseEntity<CommandeBean> ajouterCommande(@RequestBody CommandeBean commande);

    @GetMapping(value = "/commandes/{id}")
    public List<CommandeBean> recupererUneCommande(@PathVariable int id);
}
