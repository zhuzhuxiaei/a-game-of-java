package ground;
import veriable.StaticNum;
public class Units_Of_Brick {//x,y daibiao kuaisu XY daibiao zhongxin zuobiao
	private int size=StaticNum.SIZE;
	private int x=0;
	private int y=0;
	private int X=0;//像素级别的控制
	private int Y=0;//像素级别的控制
	public Units_Of_Brick(int x,int y) {
		if(y<14) y=14;
		this.x=x/40;
		this.y=(y-14)/40;
		if(this.x>16) this.X=this.x*40+30;else this.X=this.x*40+20;
		this.Y=this.y*40+34;
	} 
	public Units_Of_Brick() {
		this(0,0);
	}
	public void setx(int x) {
		this.x=x/40;
	}
	public void sety(int y) {
		if(y<14) y=14;
		this.y=(y-14)/40;
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public int getX() {
		if(this.x>16) this.X=this.x*40+30;
		else {this.X=this.x*40+20;}
		return X;
	}
	public int getY() {
		this.Y=this.y*40+34;
		return Y;
	}
}
