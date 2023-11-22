É unha clase similar a String, só que non son inmutables, son modificables: son unha secuencia cambiante de caracteres Unicode, de lonxitude variable.

Teremos agora métodos que poden modificar o string orixinal.

É preferible empregar Sring salvo algúns casos. Por exemplo:

-   simplifica código (exemplo inverter unha cadea)
-   mellora rendemento (concatenar moitas cadeas)

### Construtores de StringBuilder

Os construtores de StringBuilder son:

```

StringBuilder exemploStringBuilder = new StringBuilder(); 
// inicializado a "", con 16 de capacidade

StringBuilder exemploStringBuilder = new StringBuilder("Lisboa");
// Recibe un tipo String e inicialízase a "Lisboa", e a capacidade é 6 + 16

StringBuilder exemploStringBuilder = new StringBuilder(3);
// Con un parámetro tipo in que indica a súa capacidade inicial
```

Tamén podemos crear un String a partir dun StringBuilder co método _**toString()**_:

```
StringBuilder exemploStringBuilder = new StringBuilder("Lisboa");
String st = exemploStringBuilder.toString();
```

## Algún Métodos de StringBuilder

Veremos algúns métodos de StringBuilder, algúns similares aos da clase String, outros exclusivos de StringBuilder

### public char charAt(int index)

Devolve o carácter da posición index

```
StringBuilder cadeaSB = new StringBuilder("Lisboa");
System.out.println(cadeaSB.charAt(0)); // L de Lisboa
```

### public int indexOf(String str)

Devolve a primeira ocurrencia de str (-1 se non está)

```
StringBuilder cadeaSB = new StringBuilder("Lisboa");
System.out.println(cadeaSB.indexOf("s")); // 2 
```

### public StringBuilder append (String str)

Permite engadir cadeas ao obxecto orixinal.

```

StringBuilder sb = new StringBuilder(10);
sb.append("Ola!");
System.out.println(sb); // vale "Ola!"
```

### public int length() e public int capacity()

Ademais de _**length()**_, que devolva a lonxitude da cadea, ten outro método _**capacity()**_, que devolve o número espazos que foron reservados (o número de caracteres que pode conter sen necesidad da asignar máis memoria)

```
//Sempre se cumple que sb.length( )<= sb.capacity():
StringBuilder sb = new StringBuilder(10);
sb.append("Ola!");
        System.out.println(sb); // vale "Ola"
        System.out.println(sb.length()); // 3 
        System.out.println(sb.capacity());  //10
```

Sempre se pode asignar máis capacidade de xeito dinámico, modificando a cadea:

```
sb.append(" como vai a cousa?");
System.out.println(sb.capacity());  //22 (Ola! como vai a cousa?)
```

### public String toString()

Devolve un String representado polo StringBuilder

```
StringBuilder sb = new StringBuilder("Elemento de proba");
String cadea = sb.toString();
```

### public String substring(int indiceInicio)

Devolve o string desde indiceInicio ata o final

```
StringBuilder sb = new StringBuilder("Elemento de proba");
String deProba = sb.substring(9);  // 'de proba'
```

### public String reverse( )

Retorna un String co texto invertido

```
StringBuilder sb = new StringBuilder("mesa");
String invertido = sb.reverse();  //asem
```

### public void setCharAt(int index, char ch)

Reempraza o carácter da posición index polo carácter ch

### public String Builder replace(int indiceInicio, int indiceFin, String str)

Reempraza a cadea entre indiceInicio e indiceFin polo string str

### public StringBuilder insert(int offset, char ch)

Inserta ch na posición offset da cadea. Este método está sobrecargado varias veces podendo recibir outros tipos: int, float, …

### public StringBuilder delete(int start, int end)

Elimina as posicións entre start e end.