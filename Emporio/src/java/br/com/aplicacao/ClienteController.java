package br.com.aplicacao;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

@Controller
public class ClienteController {
    
    @RequestMapping(value = "/adicionarCliente", method = RequestMethod.GET) 
    public ModelAndView cliente() {
        return new ModelAndView("adicionarCliente", "command", new Cliente()); 
    } 
    
    @RequestMapping(value = "/consultarCliente", method = RequestMethod.GET) 
    public ModelAndView cliente2() {
        return new ModelAndView("consultarCliente", "command", new Cliente()); 
    }
    
    @RequestMapping(value = "/removerCliente", method = RequestMethod.GET) 
    public ModelAndView cliente3() {
        return new ModelAndView("removerCliente", "command", new Cliente()); 
    }
    
    @RequestMapping(value = "/atualizarClienteConsulta", method = RequestMethod.GET) 
    public ModelAndView cliente4() {
        return new ModelAndView("atualizarClienteConsulta", "commandA", new Cliente()); 
    }
    
    @RequestMapping(value = "/atualizarClienteEdicao", method = RequestMethod.GET) 
    public ModelAndView cliente5() {
        return new ModelAndView("atualizarClienteEdicao", "commandA", new Cliente()); 
    }
    
    @RequestMapping(value = "/clienteIndex", method = RequestMethod.GET) 
    public ModelAndView cliente6() {
        return new ModelAndView("clienteIndex", "command", new Cliente()); 
    } 
    
    @ModelAttribute("cliente") 
    public Cliente criarClienteModelo() { 
        return new Cliente(); 
    }

    @ModelAttribute("cliente2") 
    public Cliente criarClienteModelo2() { 
        return new Cliente(); 
    }
    
    @ModelAttribute("cliente5") 
    public Cliente criarClienteModelo5() { 
        return new Cliente(); 
    }
    
    @RequestMapping(value = "/adicionarCliente", method = RequestMethod.POST) 
    public String adicionarCliente(@ModelAttribute("cliente")@Validated Cliente est, BindingResult bindingResult, Model modelo) { 
        if (bindingResult.hasErrors()) { 
            return "adicionarCliente";
        } 
        modelo.addAttribute("nome", est.getNome()); 
        modelo.addAttribute("cpf", est.getCpf()); 
        modelo.addAttribute("senha", est.getSenha()); 
        modelo.addAttribute("email", est.getEmail()); 
        modelo.addAttribute("telefone", est.getTelefone()); 
        inserirClienteBanco(est);
        return "adicionarClienteResultado"; 
    }
    
    @RequestMapping(value = "/consultarCliente", method = RequestMethod.POST) 
    public String consultarCliente(@ModelAttribute("cliente2")Cliente est, Model modelo) { 
       
        Cliente dadosCliente = consultarClienteBancoId(est.getId());
        
        modelo.addAttribute("nome", dadosCliente.getNome()); 
        modelo.addAttribute("cpf", dadosCliente.getCpf());
        modelo.addAttribute("email", dadosCliente.getEmail());
        modelo.addAttribute("senha", dadosCliente.getSenha());
        modelo.addAttribute("telefone", dadosCliente.getTelefone());
        return "consultarCliente"; 
    }
    
    @RequestMapping(value = "/removerCliente", method = RequestMethod.POST) 
    public String removerCliente(@ModelAttribute("cliente3")Cliente est, Model modelo) { 
       
        Cliente dadosCliente = consultarClienteBancoId(est.getId());
       
        ClienteModel con = new ClienteModel();
        con.removerCliente(dadosCliente.getId());
         modelo.addAttribute("resultado", "apagou :)"); 
        return "removerCliente"; 
    }
    
    @RequestMapping(value = "/atualizarClienteConsulta", method = RequestMethod.POST) 
    public String atualizarCliente(@ModelAttribute("cliente4")@Validated Cliente est, BindingResult bindingResult, Model modelo) { 
       
        Cliente dadosCliente = consultarClienteBancoId(est.getId());
        
        modelo.addAttribute("nome", dadosCliente.getNome()); 
        modelo.addAttribute("cpf", dadosCliente.getCpf());
        modelo.addAttribute("email", dadosCliente.getEmail());
        modelo.addAttribute("senha", dadosCliente.getSenha());
        modelo.addAttribute("telefone", dadosCliente.getTelefone());
        modelo.addAttribute("id", dadosCliente.getId());
        return "atualizarClienteEdicao"; 
    }    
    @RequestMapping(value = "/atualizarClienteEdicao", method = RequestMethod.POST) 
    public String atualizarClienteEdicao(@ModelAttribute("cliente5")@Validated Cliente est, BindingResult bindingResult, Model modelo) { 
        if (bindingResult.hasErrors()) { 
            return "atualizarClienteConsulta";
        } 
        modelo.addAttribute("nome", est.getNome()); 
        modelo.addAttribute("cpf", est.getCpf()); 
        modelo.addAttribute("senha", est.getSenha()); 
        modelo.addAttribute("email", est.getEmail()); 
        modelo.addAttribute("telefone", est.getTelefone()); 
        alterarClienteBanco(est);
        return "atualizarClienteConsulta"; 
    }
    
    public ArrayList<Cliente> consultarClienteBanco(){
        ClienteModel con = new ClienteModel();
        ArrayList<Cliente> lista = con.consultarCliente();
        return lista;
    }
    
    public String inserirClienteBanco(Cliente cli){
        ClienteModel con = new ClienteModel();
        String res = con.inserirCliente(cli);
        return res;
    }
    public String alterarClienteBanco(Cliente cli){
        ClienteModel con = new ClienteModel();
        String res = con.alterarCliente(cli);
        return res;
    }
    
    public Cliente consultarClienteBancoId(int id){
        ClienteModel con = new ClienteModel();
        Cliente lista = con.consultarClienteId(id);
        return lista;
    }
        
    @ModelAttribute("webConsultaClientes") 
    public Map<Integer, String> webConsultaClientes() { 
        ArrayList<Cliente>  con = consultarClienteBanco();
        
        Map<Integer, String> consultaClientes = new HashMap<>();
        for(int i = 0; i < con.size(); i++)
            consultaClientes.put(con.get(i).getId(), con.get(i).getNome());
        return ordenarMap(consultaClientes);
    }

    public Map<Integer, String> ordenarMap(Map<Integer, String> consultaClientes){
         Map<Integer, String> listaOrdenada = consultaClientes.entrySet()
        .stream().sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
         return listaOrdenada;
    }

}
