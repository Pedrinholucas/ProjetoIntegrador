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
    
    @RequestMapping(value = "/atualizarCliente", method = RequestMethod.GET) 
    public ModelAndView cliente4() {
        return new ModelAndView("atualizarCliente", "command", new Cliente()); 
    }
    
    @ModelAttribute("cliente") 
    public Cliente criarClienteModelo() { 
        return new Cliente(); 
    }

    @ModelAttribute("cliente2") 
    public Cliente criarClienteModelo2() { 
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
        return "resultadoCliente"; 
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
    public String atualizarCliente(@ModelAttribute("cliente4")Cliente est, Model modelo) { 
       
        Cliente dadosCliente = consultarClienteBancoId(est.getId());
        
        modelo.addAttribute("nome", dadosCliente.getNome()); 
        modelo.addAttribute("cpf", dadosCliente.getCpf());
        modelo.addAttribute("email", dadosCliente.getEmail());
        modelo.addAttribute("senha", dadosCliente.getSenha());
        modelo.addAttribute("telefone", dadosCliente.getTelefone());
        modelo.addAttribute("id", dadosCliente.getId());
        return "atualizarCliente"; 
    }    
    @RequestMapping(value = "/atualizarClienteMudanca", method = RequestMethod.POST) 
    public String atualizarCliente2(@ModelAttribute("cliente4")Cliente est, Model modelo) { 
        System.out.println(est.getId());
                System.out.println("xang ja zhiuuuuuuuuuuu");        
        modelo.addAttribute("resultado", "certissimo amigo, mudanças aplicadas"); 

        ClienteModel con = new ClienteModel();
        String res = con.alterarCliente(est);
        System.out.println(res + " bagulho enorme de grandes proporções");
        return "atualizarCliente"; 
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
    
    public Cliente consultarClienteBancoId(int id){
        ClienteModel con = new ClienteModel();
        Cliente lista = con.consultarClienteId(id);
        return lista;
    }
    
    @ModelAttribute("webLinguagensLista")
    public ArrayList<String> webLinguagensLista() { 
        ArrayList<String> webLinguagensLista = new ArrayList<>(); 
        webLinguagensLista.add("Inglês"); 
        webLinguagensLista.add("Espanhol"); 
        webLinguagensLista.add("Alemão"); 
        webLinguagensLista.add("Francês"); 
        return webLinguagensLista; 
    }
    
    @ModelAttribute("webGeneroFilmes")
    public ArrayList<String> webGeneroFilmes() { 
        ArrayList<String> webGeneroFilmes = new ArrayList<>(); 
        webGeneroFilmes.add("Terror"); 
        webGeneroFilmes.add("Ação"); 
        webGeneroFilmes.add("Romance"); 
        webGeneroFilmes.add("Comédia"); 
        webGeneroFilmes.add("Policial");
        return webGeneroFilmes; 
    }

    @ModelAttribute("webListaCidades") 
    public Map<String, String> webListaCidades() { 
        Map<String, String> listaCidades = new HashMap<>();
        listaCidades.put("ITB", "Ituiutaba");
        listaCidades.put("PTM", "Patos de Minas");
        listaCidades.put("PTU", "Paracatu");
        listaCidades.put("PTC", "Patos de Minas");
        listaCidades.put("URA", "Uberaba");
        listaCidades.put("UDI", "Uberlândia");
        return listaCidades;
    }
    
    @ModelAttribute("webListaDesejos") 
    public Map<String, String> webListaDesejos() { 
        Map<String, String> listaDesejos = new HashMap<>();
        listaDesejos.put("Viagem", "Viagem");
        listaDesejos.put("Férias", "Férias");
        listaDesejos.put("Compras", "Compras");
        return listaDesejos;
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
