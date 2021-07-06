public class User {

    static private User instance = new User();
    private int idUser;
    private String nome;
    private String sobrenome;
    private String nomeUser;
    private String senha;
    private int tipoAcesso;


    private User (){}

    static User getInstance(){
        return instance;
    }


    public static void main(String[] args) {

        User usuario = User.getInstance();
    }


}
