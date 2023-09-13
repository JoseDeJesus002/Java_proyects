package color.colors;

public class ColoresHilos extends Thread{
	
	public void color1() {
	System.out.println("\033[0;30m Texto1");
	System.out.println("\033[1;30m Negritas");
	System.out.println("\033[0;40m Fondo 1");
	}
	
	public void color2() {
	System.out.println("\033[0;31m Texto2");
	System.out.println("\033[1;31m Negritas");
	System.out.println("\033[0;41m Fondo 2");
	}
	
	public void color3() {
	System.out.println("\033[0;32m Texto3");
	System.out.println("\033[1;32m Negritas");
	System.out.println("\033[0;42m Fondo 3");
	}
	
	public void color4() {
	System.out.println("\033[0;33m Texto4");
	System.out.println("\033[1;33m Negritas");
	System.out.println("\033[0;43m Fondo 4");
	}
	
	public void color5() {
	System.out.println("\033[0;34m Texto5");
	System.out.println("\033[1;34m Negritas");
	System.out.println("\033[0;44m Fondo 5");
	}
	
	public void color6() {
	System.out.println("\033[0;35m Texto6");
	System.out.println("\033[1;35m Negritas");
	System.out.println("\033[0;45m Fondo 6");
	}
	
	public void color7() {
	System.out.println("\033[0;36m Texto7");
	System.out.println("\033[1;36m Negritas");
	System.out.println("\033[0;46m Fondo 7");
	}
	
	public void color8() {	
	System.out.println("\033[0;37m Texto8");
	System.out.println("\033[1;37m Negritas");
	System.out.println("\033[0;47m Fondo 8");
	}
	
	@Override
	public void run() {
		color1();
		color2();
		color3();
		color4();
		color5();
		color6();
		color7();
		color8();
	}
}
