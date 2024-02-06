## Exercicio 1

Cando traballamos cun array de tamaño n, o último elemento é x\[n-1\]. Se sobrepasamos os límites do array accedendo a x\[n\], java xera unha excepción de tipo _IndexOutOfBoundsException_. Modifica o código do seguinte programa para que o código capture a excepción e o programa non rompa.

```java
class AppEx1{ public static void main(String[] args){ int[] x= {0,1,2,3,4}; x[5]=5; System.out.println("O programa recupérase da excepción e continúa ata aquí"); } }
```

## Exercicio 2

Queremos calcular o factorial dun número pero asegurándonos que o usuario introduce un enteiro por teclado. Ata que non introduza un enteiro pedirémoslle de novo o número. Faino primeiro coa clase Scanner e logo co JOptionPane. Investiga _InputMismatchException_ e _NumberFormatException_, para cada un dos casos.

## Exercicio 3

Partindo do código fonte seguinte engade a capacidade de xerar unha excepción cando se xere unha figura de cor branca, de forma que funcione o seguinte main.

```java
class AppVariasFiguras { public static void main(String[] args) { try { Circulo c = new Circulo(2.0, "branco"); System.out.println("Area circulo " + c.area()); } catch (Exception e) { System.out.println("NON SE PUIDO CREAR OBXECTO: " + e.getMessage()); } try { Triangulo t = new Triangulo(2.0, 3.0, "rojo"); System.out.println("Area triangulo " + t.area()); } catch (Exception e) { System.out.println("NON SE PUIDO CREAR OBXECTO" + e.getMessage()); } } } abstract class Figura { protected String cor; public Figura(String cor) { this.cor = cor; } abstract public double area(); } class Triangulo extends Figura { private double base; private double altura; public Triangulo(double base, double altura, String cor) { super(cor); this.base = base; this.altura = altura; } @Override public double area() { return base * altura / 2; } } class Circulo extends Figura { private double radio; public Circulo(double radio, String cor) { super(cor); this.radio = radio; } @Override public double area() { return Math.PI * radio * radio; } }
```

## Ejercicio 4

Escrebe de novo o seguinte código, respetándoo tal cual, pero engadindo a capacidade de traballar con excepcións (clase Exception) de forma que cando se crea un rectángulo cun punto orixe que ten algunha coordenada negativa lánzase unha Exception.

```java
class Ponto { int x = 0; int y = 0; Ponto(int x, int y) { this.x = x; this.y = y; } } class Rectangulo { Ponto orixe; int ancho; int alto; Rectangulo(int x, int y, int w, int h) { orixe = new Ponto(x,y); ancho = w; alto = h; } } class App{ public static void main(String[] args){ Rectangulo oRectangulo=new Rectangulo(-2,3,4,5); } }
```

## Ejercicio 5

Fai un pequeno programa para controlar o stock dun produto (id, prezo e cantidade). A cantidade por defecto é de 50 unidades. Crea un método estático de venderProduto(), e crea a túa propia clase de excepción produtoSenStockException (filla de Exception) para xestionar a falta de stock.

## Ejercicio 6

Temos unha clase Ordenador e outras clases:

```java
public class Ordenador { private Procesador p; private Memoria m; private DiscoDuro d; private int pvp; public Ordenador(int m_capacidade, String m_tipo, int m_velocidade, double d_capacidade, String d_tipo, int d_velocidade, String p_modelo, double p_velocidade, int prezo){ m = new Memoria(m_capacidade, m_tipo, m_velocidade); d = new DiscoDuro(d_capacidade, d_tipo, d_velocidade); p = new Procesador(p_modelo, p_velocidade); pvp = prezo; } public int getCapacidadeMemoria() { return m.getCapacidade(); } }
```

As outras clases son:

```java
public class Procesador{ private String modelo; private double velocidade; Procesador(String modelo, double velocidade) { this.modelo = modelo; this.velocidade = velocidade; } }
```

```java
class DiscoDuro { private double capacidade; private String tipo; private int velocidade; DiscoDuro(double capacidade, String tipo, int velocidade){ this.capacidade = capacidade; this.tipo = tipo; this.velocidade = velocidade; } }
```

```java
class Memoria{ static final int MIN_MEM=2; private int capacidade; private String tipo; private int velocidade; Memoria(int capacidade, String tipo, int velocidade){ if(capacidade < MIN_MEM) this.capacidade = MIN_MEM; else this.capacidade = capacidad this.tipo = tipo; this.velocidade = velocidade; } int getCapacidade(){ return capacidade; } }
```

Amplia a clase Ordenador para axustalo aos seguintes supostos:

1.  Engade á clase Ordenador o atributo: private String numeroDeSerie;
2.  O constructor de Ordenador tamén se encarga de lanzar unha excepción de tipo OrdenadorException cando se intenta crear un Ordenador nas seguintes situacións:
    -   Téntase configurar un ordenador con procesador modelo I7 sen disco tipo SATA3
    -   O número de serie comeza por HP e ten menos de 4gb de RAM.
    -   Un obxecto OrdenadorException debe recibir no seu constructor un número de serie e unha mensaxe e reescribir con esta información o método getMessage()

Todo o anterior debe facer funcionar o seguinte main:

```java
//Principal.java import ordenador.Ordenador; import ordenador.OrdenadorException; class Principal{ public static void main(String[] args) { //formato contructor Ordenador: //NumeroDeSerie,capacidadeMemoria,tipMemoria,velocidadeMemoria,capacidadeDisco,tipoDisco,velocidadeDisco,tipoProcesador,velocidadeProcesador,prezo try{ new Ordenador("DELL122",8,"DDR2",533,(double)2.0,"SATA",7200,"i7",(double)3.3,400); System.out.println("ORDENADOR DELL122 OK"); }catch(OrdenadorException e){ System.out.println(e.getMessage()); } try{ new Ordenador("CLONIC900",8,"DDR2",533,(double)2.0,"SATA3",7200,"i7",(double)3.3,400); System.out.println("ORDENADOR CLONIC900 OK"); }catch(OrdenadorException e){ System.out.println(e.getMessage()); } try{ new Ordenador("HP511",2,"DDR2",533,(double)2.0,"SATA",7200,"i5",(double)3.3,400); System.out.println("ORDENADOR HP511 OK"); }catch(OrdenadorException e){ System.out.println(e.getMessage()); } } }
```

Que debe xerar a seguinte saída:

```java
DELL122: I7 sen SATA3 non se pode montar ORDENADOR CLONIC900 OK HP511: Serie HP non pode ter menos de 4gb de memoria
```