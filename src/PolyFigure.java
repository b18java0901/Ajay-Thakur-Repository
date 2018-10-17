
public class PolyFigure {

	public static void main(String[] args) {
		Figure[] f=new Figure[6];
		f[0]=new Rectangle();
		f[1]=new Rectangle();
		f[2]=new Circle();
		f[3]=new Circle();
		f[4]=new Triangle();
		f[5]=new Triangle();
//		Rectangle r=new Rectangle();
//		r.tostring();
		for(int i=0;i<6;i++)
		{   System.out.println(f[i].toString()); 
			f[i].findArea();
			f[i].findPerimeter();
		}
		
		
		

	}

}
