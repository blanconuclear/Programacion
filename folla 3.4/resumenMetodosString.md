# Resumen de Métodos de la Clase `String` en Java

## `length()`

Devuelve la longitud (número de caracteres) de la cadena.

```java
String cadena = "Hola";
int longitud = cadena.length();  // longitud = 4
```

## `charAt(int index)`

Devuelve el carácter en la posición especificada.

```java
String cadena = "Hola";
char primerCaracter = cadena.charAt(0);  // primerCaracter = 'H'
```

## `substring(int beginIndex), substring(int beginIndex, int endIndex)`

Devuelve una subcadena de la cadena original.

```java
String cadena = "Hola Mundo";
String subcadena1 = cadena.substring(0, 4);  // subcadena1 = "Hola"
String subcadena2 = cadena.substring(5);     // subcadena2 = "Mundo"
```

## `indexOf(String str), indexOf(String str, int fromIndex)`

Encuentra la posición de la primera ocurrencia de una subcadena.

```java
String cadena = "Hola Mundo";
int posicion = cadena.indexOf("Mundo");  // posicion = 5
```

## `startsWith(String prefix), endsWith(String suffix)`

Verifica si la cadena comienza o termina con la subcadena especificada.

```java
String cadena = "Hola Mundo";
boolean comienzaConHola = cadena.startsWith("Hola");  // true
boolean terminaConMundo = cadena.endsWith("Mundo");  // true
```

## `toUpperCase()`, `toLowerCase()`

Convierte todos los caracteres a mayúsculas o minúsculas.

```java
String cadena = "Hola Mundo";
String mayusculas = cadena.toUpperCase();  // mayusculas = "HOLA MUNDO"
String minusculas = cadena.toLowerCase();  // minusculas = "hola mundo"
```

## `replace(char oldChar, char newChar), replace(CharSequence target, CharSequence replacement)`

Reemplaza todas las ocurrencias de un carácter o subcadena con otro.

```java
String cadena = "Hola Mundo";
String reemplazada1 = cadena.replace('o', 'x');            // reemplazada1 = "Hxla Mundx"
String reemplazada2 = cadena.replace("Hola", "Bonjour");  // reemplazada2 =  "Bonjour Mundo"
```

## `split(String regex)`

Divide la cadena en un array de subcadenas basándose en una expresión regular.

```java
String cadena = "Hola Mundo";
String[] partes = cadena.split(" ");  // partes = ["Hola", "Mundo"]
```
