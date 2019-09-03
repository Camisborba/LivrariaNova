
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//anotation, urlPatterns- link de acesso
@WebServlet(name = "GeneroWS", urlPatterns = {"/admin/genero/GeneroWS"})
public class GeneroWS extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //requisições gerais    
    String acao = request.getParameter ("txtAcao");
    
    //switch-if encadeado / string.valueof-pega null e transforma em algo
        switch(String.valueOf(acao)){
            case "add":
            
                break;
            case "edit":
                
                break;
            default:
            
            
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //requisições de submissão de formulário
    }


}
