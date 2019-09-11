# 4_3_String

En este ejercicio se pide localizar el índice de algún caracter del string: "72-25-14-23-62", utilizando el método .indexOf(). Se diseñó el programa -cadenas- para realizarlo, y posteriormente se pide buscar el índice de un caracter buscado a partir de un índice incial. Se puede observar que el caracter "-" aparece en el índice 5 ya que se busca a partir del índice 4.

![Leccion 4_3_1_1](https://user-images.githubusercontent.com/54320247/64726251-d7612c80-d49b-11e9-8826-f1cf05edfb56.jpg)

En el siguiente paso del ejercicio se pide ingresar algún índice y que se devuelva el caracter correspondiente. Para ello se usa el método .charArt(), con el cual se ingresa un valor entero y dentro del número de índices para que devuelva el caracter correspondiente en la cadena.

![Leccion 4_3_1_2](https://user-images.githubusercontent.com/54320247/64726252-d7612c80-d49b-11e9-9edc-08dabc8ddd22.jpg)

En el siguiente paso del ejercicio se pide extraer una "subcadena" contenida en la cadena principal, esto es la extracción de caracteres de una cadena y presentarlos como una subcadena. Para realizarlo se utiliza el método .substring(x,y) dónde -x- es el índice inicial de extracción e -y- es el índice final de extracción.

![Leccion 4_3_1_3](https://user-images.githubusercontent.com/54320247/64726253-d7612c80-d49b-11e9-85c7-4f280e2c6732.jpg)

En el siguiente paso del ejercicio se pide cambiar alguno de los carácteres similares de la cadena principal y reemplazarlos por otro caracter. Lo que se realiza es cambiar el caracter guión "-" por "@". Esto se realiza con el método .replace(x, y) que puede reemplazar todos los caracteres iguales -x- por el caracter -y-.

![Leccion 4_3_1_4](https://user-images.githubusercontent.com/54320247/64726254-d7612c80-d49b-11e9-835b-ec0da7c2a2cb.jpg)

Como paso final se pide que sólo se reemplace uno o algunos pero una sola vez, dejando al resto de caracteres similaes. Esto se realiza con el método .replaceFirst(x, y) que reemplaza el caracter o subcadena -x- por el caracter o subcadena -y- sólo la primera vez que aparece.

![Leccion 4_3_1_5](https://user-images.githubusercontent.com/54320247/64726250-d7612c80-d49b-11e9-8c66-d372f1be3d32.jpg)
