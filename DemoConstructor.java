class Box
{
	int Firstnum = 10;
	int Secondnum = 20;
	int Thirdnum = 30;
}
class DemoConstructor
{
	public static void main(String args[])
	{
		Box obj=new Box();
		System.out.println(obj.Firstnum + "\n" + obj.Secondnum + "\n" + obj.Thirdnum);
	}
}