
public class TesteEscola {
    public static void main(String[] args){
        
        Escola cadastro1 = new Escola();
        cadastro1.codmatricula = 0001;
        cadastro1.aluno = "Danrley Santos";
        cadastro1.classe = "4ª periodo de sistemas de informação";
        
        Escola cadastro2 = new Escola();
        cadastro2.codmatricula = 0002;
        cadastro2.aluno = "Lucas Rodrigues";
        cadastro2.classe = "4ª periodo de sistemas de informação";
        
        Escola cadastro3 = new Escola();
        cadastro3.codmatricula = 0003;
        cadastro3.aluno = "Anderson noé";
        cadastro3.classe = "4ª periodo de sistemas de informação";
        
        System.out.println("Nº da matricula:" + cadastro1.codmatricula);
        System.out.println("Nome do aluno:" + cadastro1.aluno);
        System.out.println("Turma:" + cadastro1.classe);
        
        System.out.println("Nº da matricula:" + cadastro2.codmatricula);
        System.out.println("Nome do aluno:" + cadastro2.aluno);
        System.out.println("Turma:" + cadastro2.classe);
        
        System.out.println("Nº da matricula:" + cadastro3.codmatricula);
        System.out.println("Nome do aluno:" + cadastro3.aluno);
        System.out.println("Turma:" + cadastro3.classe);
        
    }
    
}
