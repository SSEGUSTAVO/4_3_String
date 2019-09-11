# 4_3_String

En este ejercicio se pide localizar el índice de algún caracter del string: "72-25-14-23-62", utilizando el método .indexOf(). Se diseñó el programa -cadenas- para realizarlo, y posteriormente se pide buscar el índice de un caracter buscado a partir de un índice incial. Se puede observar que el caracter "-" aparece en el índice 5 ya que se busca a partir del índice 4.



En el siguiente paso del ejercicio se pide ingresar algún índice y que se devuelva el caracter correspondiente. Para ello se usa el método .charArt(), con el cual se ingresa un valor entero y dentro del número de índices para que devuelva el caracter correspondiente en la cadena.



En el siguiente paso del ejercicio se pide extraer una "subcadena" contenida en la cadena principal, esto es la extracción de caracteres de una cadena y presentarlos como una subcadena. Para realizarlo se utiliza el método .substring(x,y) dónde -x- es el índice inicial de extracción e -y- es el índice final de extracción.



En el siguiente paso del ejercicio se pide cambiar alguno de los carácteres similares de la cadena principal y reemplazarlos por otro caracter. Lo que se realiza es cambiar el caracter guión "-" por "@". Esto se realiza con el método .replace(x, y) que puede reemplazar todos los caracteres iguales -x- por el caracter -y-.



Como paso final se pide que sólo se reemplace uno o algunos pero una sola vez, dejando al resto de caracteres similaes. Esto se realiza con el método .replaceFirst(x, y) que reemplaza el caracter o subcadena -x- por el caracter o subcadena -y- sólo la primera vez que aparece.
