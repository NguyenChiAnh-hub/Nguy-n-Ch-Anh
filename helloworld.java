import java.io.IOException;

public class helloworld {
	/**
	 * HelloWorld class.</br>
	 * đây là Class đầu tiên của lớp để làm quen vs java</br>
	 */
	
		    public static void main(String[] args) throws IOException {
		        System.out.println("Hello World");
		        
		        int ch;
		        System.out.println("Nhap vao ky tu:");
		        
		        while ((ch = System.in.read()) != '\n') {
		            System.out.print((char)ch);
		        }
		    }
		}

