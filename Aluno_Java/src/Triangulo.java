import java.util.Scanner;

public class Triangulo
{
    public float Base;
    public float Altura;

    public Triangulo(float Base, float Altura)
    {
        this.Base = Base;
        this.Altura = Altura;
    }
    public float Area()
    {
        return (Base * Altura)/ 2;
    }

    public float Perimetro()
    {
        return 2 * (Base + Altura);
    }
}