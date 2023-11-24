
public class Main {
	static Login login = Login.getInstance();
	static Usuarios usuarios = Usuarios.getInstance();
	public static void main(String[] args) {
		
		usuarios.adicionaUsuario("Juca", "123456","12345", "Gerente");
		login.exibeLogin();
	}
	

}
